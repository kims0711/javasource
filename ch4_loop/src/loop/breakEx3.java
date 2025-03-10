package loop;

import java.util.Scanner;

public class breakEx3 {
    public static void main(String[] args) {
        boolean run = true;

        Scanner sc = new Scanner(System.in);

        int account = 0; // 잔액 변수가 while문 안에 있으면 반복 될 때마다 초기화 되니까 당연히 여기에 있어야
        int inout = 0;

        while (run) { // run이 true 이기 때문에 현재 무한루프이고 4번을 고를 시에 false가 되어 종료되는 것
            System.out.println("==================================");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("==================================");

            System.out.println("메뉴 번호 입력하세요.");
            int menu = sc.nextInt();

            switch (menu) { // switch 안에 있는 break는 switch 구문만을 나가는 것
                case 1: // 예금액 임력 , 잔액(기존 잔액 + 예금액)

                    System.out.println("예금액을 입력하시오");
                    // inout = sc.nextInt();
                    // account += inout;
                    account += sc.nextInt(); // inout 선언없이 이렇게 해도 됨

                    System.out.printf("예금 후 현재 잔액은 %d 원 입니다\n", account);

                    break;
                case 2: // 출금액 입력, 잔액(기존 잔액 - 출금액)
                    System.out.println("출금액을 입력하시오");
                    inout = sc.nextInt(); // 위에서 선언한 변수 써도 되고 여기서 int 로 다시 선언해주고 써도 되고
                                          // 위에 account += sc.nextInt(); 로 간략화 해준 것 때문에 inout 변수가 필요가 없어졌었음 (inout 써보려고
                                          // 지금 다시 만든거)
                    if (account >= inout) {
                        // account -= inout;
                        account -= inout;

                        // *

                    } else {
                        System.out.println("잔액이 부족합니다");
                        continue; // 밑에 문장 출력되지 않게
                    }
                    System.out.printf("출금 후 현재 잔액은 %d 원 입니다\n", account); // 위에 continue 써보려고 여기에 두었지만 if 블럭 안의 *위치에 두면
                                                                          // continue도 필요 없음
                    break;
                case 3: // 잔액 조회 : 출력만
                    System.out.printf("현재 잔액은 %d 원 입니다\n", account);

                    break;
                case 4:
                    System.out.println("프로그램이 종료 되었습니다");
                    run = false; // 얘가 반복문 종료 시키는 것
                    break;

                default:
                    break;
            }
        }
    }

}
