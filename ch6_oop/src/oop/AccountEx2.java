package oop;

import java.util.Scanner;

public class AccountEx2 {

    // account = 주소
    // account.~~ = 값
    private static Account account; // static으로 선언 -> static(static은 static만의 공간이 있음) 공간에 account 하나 선언됨
    static Scanner sc = new Scanner(System.in); // 얘도 static 공간에 sc 선언됨 but new 선언도 했기 때문에 다른 곳도 지정중

    public static void main(String[] args) {

        // 인스턴스 생성 후에 접근하는 방법
        // AccountEx2 obj = new AccountEx2();

        boolean run = true; // 5번 누르기 전 까지는 계속 반복
        while (run) {
            System.out.println("====================================================");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
            System.out.println("====================================================");

            System.out.print("선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    account = createAccount();

                    break;
                case 2:
                    accountList(account);
                    break;
                case 3:
                    deposit(account);
                    break;
                case 4:
                    withdraw(account);
                    break;
                case 5:
                    run = false;
                    break;

                default:
                    System.out.println("번호 확인");
                    break;
            }

        }

    }

    private static Account createAccount() { // static void가 아닌 static Account
        // 계좌번호 입력 받기
        System.out.print("계좌번호 : ");
        String ano = sc.nextLine();
        // 계좌주 입력 받기
        System.out.print("계좌주 : ");
        String ower = sc.nextLine();
        // 잔액
        System.out.print("금액 : ");
        int balance = Integer.parseInt(sc.nextLine());

        return new Account(ano, ower, balance);
    }

    private static void accountList(Account account) {
        System.out.println("================================");
        System.out.println("계좌 목록");
        System.out.println("================================");

        System.out.printf("계좌번호 : %s\t 예금주 : %s\t 예금액 : %d\n", account.getAno(), account.getOwner(),
                account.getBalance());
    }

    private static void deposit(Account account) { // 예금
        // 계좌번호 입력받고 => 사용자의 계좌번호와 일치하는지 체크
        // 맞으면 예금액 입력받고 => 잔액 + 예금액
        System.out.print("계좌번호를 입력하세요 : ");
        String ano = sc.nextLine();

        if (!(ano.equals(account.getAno()))) {
            System.out.println("존재하지 않는 계좌입니다"); // if 한 줄일때는 상관 없지만 두 줄 이상부터느 중괄호로 묶어주기
            return;
        }
        // 예금액 입력받기

        System.out.print("예금액을 입력하시오 : ");
        int balance = Integer.parseInt(sc.nextLine());

        // account.balance = account.getBalance() + balance;
        account.deposit(balance);
        // System.out.printf("예금액 : %d\t 잔액 : %d\n", balance, account.getAno());
    }

    private static void withdraw(Account account) { // 출금
        System.out.print("계좌번호를 입력하세요 : ");
        String ano = sc.nextLine();

        if (!(ano.equals(account.getAno()))) {
            System.out.println("존재하지 않는 계좌입니다.");
            return;
        }
        System.out.print("출금액을 입력해주세요 : ");
        int balance = Integer.parseInt(sc.nextLine());

        account.withdraw(balance);
        // System.out.printf("출금액 : %d\t 잔액 : %d\n", balance, account.getAno());
    }

    // private static void findAccount() {
    // }

}
