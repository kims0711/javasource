package select.member;

import java.util.Scanner;

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

                    break;
                case 4:

                    break;
                case 5:

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
