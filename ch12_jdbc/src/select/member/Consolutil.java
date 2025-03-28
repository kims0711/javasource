package select.member;

import java.util.List;
import java.util.Scanner;

public class Consolutil {

    public MemberDTO memberInsertInfo(Scanner sc) {
        System.out.println();
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("======= 회원정보 입력 =======");
        System.out.print("아이디 >> ");
        memberDTO.setId(sc.nextLine());
        System.out.print("이름 >> ");
        memberDTO.setName(sc.nextLine());
        System.out.print("주소 >> ");
        memberDTO.setAddr(sc.nextLine());
        System.out.print("이메일 >> ");
        memberDTO.setEmail(sc.nextLine());
        System.out.print("나이 >> ");
        memberDTO.setAge(Integer.parseInt(sc.nextLine()));
        return memberDTO;
    }

    // 성공 시 출력 메서드
    public void printSuccessMessage(int result) {
        // result값에 따라 입력 성공/ 입력 실패 출력
        System.out.println(result > 0 ? "입력성공" : "입력실패");
    }

    public void printUpdateMessage(int result, String id) {
        // result값에 따라 입력 성공/ 입력 실패 출력
        System.out.println(result > 0 ? id + "님의 정보를 수정하였습니다" : id + "님의 정보 수정을 실패하였습니다");
    }

    public void printDeleteMessage(int result) {
        System.out.println(result > 0 ? "삭제하였습니다" : "삭제를 실패하였습니다");
    }

    public void memberPrint(MemberDTO dto) {
        System.out.println("-------------------------------------------");
        // System.out.printf("%s %s %s %s %d\n", dto.getId(), dto.getName(),
        // dto.getAddr(), dto.getEmail(),
        // dto.getAge());
        System.out.println("번호 : " + dto.getNo());
        System.out.println("아이디 : " + dto.getId());
        System.out.println("이름 : " + dto.getName());
        System.out.println("주소 : " + dto.getAddr());
        System.out.println("이메일 : " + dto.getEmail());
        System.out.println("나이 : " + dto.getAge());

    }

    public MemberDTO meberUpdateMenu(Scanner sc) {
        System.out.println("======= 회원정보 수정 =======");
        System.out.println("1. 주소 수정");
        System.out.println("2. 이메일 수정");
        System.out.println("=============================");
        System.out.print("번호 >> ");
        int no = Integer.parseInt(sc.nextLine());

        // no == 1 => meberUpdateAddr() 호출
        if (no == 1) {
            return memberUpdateAddr(sc);

        } else if (no == 2) {
            // no == 2 => meberUpdateEmail() 호출
            return memberUpdateEmail(sc);
        }
        // 리턴 받은 DTO를 리턴
        return null;
    }

    public MemberDTO memberUpdateAddr(Scanner sc) {
        System.out.println("======= 수정정보 입력 =======");
        System.out.print("아이디 >> ");
        MemberDTO memberDTO = new MemberDTO();
        // 수정할 값 입력(id, 변경할 addr) => DTO에 담은 후 리턴
        memberDTO.setId(sc.nextLine());
        System.out.print("변경할 주소 >> ");
        memberDTO.setAddr(sc.nextLine());
        return memberDTO;
    }

    public MemberDTO memberUpdateEmail(Scanner sc) {
        System.out.println("======= 수정정보 입력 =======");
        System.out.print("아이디 >> ");
        MemberDTO memberDTO = new MemberDTO();
        // 수정할 값 입력(id, 변경할 addr) => DTO에 담은 후 리턴
        memberDTO.setId(sc.nextLine());
        System.out.print("변경할 이메일 >> ");
        memberDTO.setEmail(sc.nextLine());
        return memberDTO;
    }

    // 삭제작업 메세지
    public String memberDeleteInfo(Scanner sc) {
        System.out.println("======= 회원 삭제 ========");
        // 삭제할 회원 아이디 입력
        System.out.print("삭제할 회원의 id를 입력하십시오 >> ");
        String id = sc.nextLine();
        // 입력받은 아이디 리턴
        return id;
    }

    // 조회
    public String memberGetInfo(Scanner sc) {
        System.out.println("======= 회원 조회 =======");
        System.out.println("1. 아이디 조회");
        System.out.println("2. 이름 조회");
        System.out.print("번호 입력 >> ");
        int no = Integer.parseInt(sc.nextLine());
        String input = "";
        if (no == 1) {
            System.out.print("조회할 회원의 id를 입력하십시오 >> ");
            input = sc.nextLine();
        } else if (no == 2) {
            System.out.print("조화할 회원의 이름을 입력하십시오 >> ");
            input = sc.nextLine();
        }
        // 입력받은 아이디 or 이름 리턴
        return input;
    }

    public void memberAllPrint(List<MemberDTO> list) {
        System.out.println("======= 전체 회원 조회 =======");
        System.out.println("no\t아이디\t이름\t주소\t이메일\t\t나이");
        System.out.println("----------------------------------------------------");
        for (MemberDTO memberDTO : list) {
            System.out.print(memberDTO.getNo() + "\t");
            System.out.print(memberDTO.getId() + "\t");
            System.out.print(memberDTO.getName() + "\t");
            System.out.print(memberDTO.getAddr() + "\t");
            System.out.print(memberDTO.getEmail() + "\t");
            System.out.print(memberDTO.getAge() + "\t");
            System.out.println();
        }
    }

}
