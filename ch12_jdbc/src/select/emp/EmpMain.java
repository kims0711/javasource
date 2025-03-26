package select.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import oracle.net.aso.l;

public class EmpMain {
    public static void main(String[] args) {

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        int empNo = 0, result = 0;
        EmpDAO eDao = new EmpDAO();
        EmpDTO eDto = null;

        while (run) {
            System.out.println("=======================");
            System.out.println("1. 입력");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 조회");
            System.out.println("5. 종료");
            System.out.println("=======================");

            System.out.print("메뉴 >> ");
            int menu = Integer.parseInt(scanner.nextLine());

            switch (menu) {
                case 1:
                    eDto = insertInfo(scanner);
                    result = eDao.insert(eDto);
                    System.out.println(result > 0 ? "입력 성공" : "입력실패");
                    break;
                case 2:
                    eDto = updateInfo(scanner);
                    result = eDao.update(eDto);
                    System.out.println(result > 0 ? "수정 성공" : "수정실패");
                    break;
                case 3:
                    empNo = deleteInfo(scanner); // empno 받아오기
                    result = eDao.delete(empNo); // 삭제 시키기 (EmpDao클래스에 넘김)
                    System.out.println(result > 0 ? "삭제 성공" : "삭제 실패");
                    break;
                case 4:

                    break;
                case 5:
                    run = false;
                    break;

                default:
                    break;
            }
        }
    }

    public static int deleteInfo(Scanner scanner) {
        // 삭제할 empno 입력받은 후 return 하기
        System.out.print("삭제할 사원의 사원번호를 입력하시오 >> ");
        int empno = Integer.parseInt(scanner.nextLine());
        return empno;
    }

    public static EmpDTO updateInfo(Scanner scanner) {
        // 수정할 empno, sal 입력받은 후 return 하기
        System.out.print("수정할 사원의 사원번호를 입력하시오 >> ");
        int empno = Integer.parseInt(scanner.nextLine());
        System.out.print("변경할 급여를 입력하시오 >> ");
        int sal = Integer.parseInt(scanner.nextLine());

        EmpDTO eDto = EmpDTO.builder().empNo(empno).sal(sal).build();

        return eDto;
    }

    public static EmpDTO insertInfo(Scanner scanner) {
        // 새로운 사원 정보 입력
        System.out.print("사원번호를 입력하시오 >> ");
        int empNo = Integer.parseInt(scanner.nextLine());
        System.out.print("사원이름을 입력하시오 >> ");
        String eName = scanner.nextLine();
        System.out.print("직무를 입력하시오 >> ");
        String job = scanner.nextLine();
        System.out.print("매니저 번호를 입력하시오 >> ");
        int mgr = Integer.parseInt(scanner.nextLine());
        System.out.print("입사일을 입력하시오 >> ");
        String hireDate = scanner.nextLine();
        System.out.print("급여를 입력하시오 >> ");
        int sal = Integer.parseInt(scanner.nextLine());
        System.out.print("수당을 입력하시오 >> ");
        int comm = Integer.parseInt(scanner.nextLine());
        System.out.print("부서번호를 입력하시오 >> ");
        int deptNo = Integer.parseInt(scanner.nextLine());

        Date date = null; // 여기서 Date java.util 에 있는 걸로 import 해야함
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(hireDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        EmpDTO eDto = EmpDTO.builder().empNo(empNo).eName(eName).job(job).mgr(mgr).hirDate(hireDate).sal(sal).comm(comm)
                .deptNo(deptNo).build();
        // return new EmpDTO(~~~) 이거랑 위에 builder랑 같은 내용 (얘로도 할 수는 있음)

        return eDto;

    }

}
