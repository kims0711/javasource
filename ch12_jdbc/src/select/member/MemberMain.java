package select.member;

import java.util.List;
import java.util.Scanner;

import select.emp.EmpDTO;

public class MemberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberDAO mDao = new MemberDAO();
        MemberDTO mDto = null;
        Consolutil util = new Consolutil();

        boolean run = true;
        while (run) {
            System.out.println("=============Member=============");
            System.out.println("1. 멤버 추가");
            System.out.println("2. 멤버 수정");
            System.out.println("3. 멤버 삭제");
            System.out.println("4. 멤버 조회");
            System.out.println("5. 멤버 전체 조회");
            System.out.println("6. 멤버 전체 조회");
            System.out.println("6. 프로그램 종료");
            System.out.println("================================");

            System.out.print("메뉴 선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());
            int result = 0;
            switch (menu) {
                case 1:
                    MemberDTO dto = util.memberInsertInfo(sc);
                    result = mDao.insert(dto);
                    // System.out.println(result>0 ? "입력성공":"입력실패");
                    util.printSuccessMessage(result);

                    break;
                case 2:
                    mDto = util.meberUpdateMenu(sc);
                    if (mDto != null) {
                        result = mDao.update(mDto);
                        // 출력문 호출
                        util.printUpdateMessage(result, mDto.getId());
                    }

                    break;
                case 3:
                    String id = util.memberDeleteInfo(sc);
                    result = mDao.delete(id);
                    util.printDeleteMessage(result);
                    break;
                case 4:
                    String input = util.memberGetInfo(sc);

                    // regex(정규식)
                    // input.matches("^[A-Za-z].*") : 정규식과 일치하면 true
                    if (input.matches("^[A-Za-z].*")) {
                        MemberDTO row = mDao.getRow(input);
                        if (row != null) {
                            util.memberPrint(row);
                        }
                    } else {
                        List<MemberDTO> list = mDao.getNameList(input);
                        if (!list.isEmpty()) {
                            util.memberAllPrint(list);
                        }
                    }
                    // 아이디는 영어로 시작 => getRow()
                    // 이름은 한글로 시작 => getNameList()

                    break;
                case 5:
                    // mDAO.getlist() => 받은 결과 화면 출력
                    List<MemberDTO> list = mDao.getlist();
                    util.memberAllPrint(list);

                    break;
                case 6:

                    run = false;
                    break;
                default:
                    break;
            }
        }
    }
}
