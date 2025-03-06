package oop;

import java.util.Scanner;

public class AccountEx3 {

    // account = 주소
    // account.~~ = 값
    private static Account account[] = new Account[100];
    private static Scanner sc = new Scanner(System.in);

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
                    createAccount();

                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
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

    private static void createAccount() { // static void가 아닌 static Account
        // 계좌번호 입력 받기
        System.out.print("계좌번호 : ");
        String ano = sc.nextLine();
        // 계좌주 입력 받기
        System.out.print("계좌주 : ");
        String owner = sc.nextLine();
        // 잔액
        System.out.print("금액 : ");
        int balance = Integer.parseInt(sc.nextLine());
        for (int j = 0; j < account.length; j++) {
            // for : account[i] 첫번째 만나는 null 이면
            // 루프 종료

            if (account[j] == null) {
                account[j] = new Account(ano, owner, balance);
                System.out.println("계좌가 생성되었습니다.");
                break;
            }
        }

    }

    private static void accountList() {
        System.out.println("================================");
        System.out.println("계좌 목록");
        System.out.println("================================");

        // 배열 출력
        // for (int i = 0; i < account.length; i++) {
        // if (account[i] != null) {
        // System.out.printf("계좌번호 : %s\t 예금주 : %s\t 예금액 : %d\n", account[i].getAno(),
        // account[i].getOwner(),account[i].getBalance());
        // }
        // break;
        // }
        for (Account acc : account) {
            if (acc == null) {
                break;
            }
            System.out.printf("계좌번호 : %s\t 예금주 : %s\t 예금액 : %d\n", acc.getAno(), acc.getOwner(), acc.getBalance());
        }
    }

    private static void deposit() { // 예금
        // 계좌번호 입력받고 => 사용자의 계좌번호와 일치하는지 체크
        // 맞으면 예금액 입력받고 => 잔액 + 예금액
        // null이 아니어야 함 account[i].getAno() == ano break;
        // return account[i]
        System.out.print("계좌번호를 입력하세요 : ");

        String ano = sc.nextLine();

        // 예금액 입력받기

        System.out.print("예금액을 입력하시오 : ");
        int balance = Integer.parseInt(sc.nextLine());

        Account findAcc = findAccount(ano);
        // findAcc가 null 일때 메서드에 접근하면 NullPointerException 발생
        if (findAcc != null) {
            findAcc.deposit(balance);
        }

        // account.balance = account.getBalance() + balance;

        // System.out.printf("예금액 : %d\t 잔액 : %d\n", balance, account.getAno());
    }

    private static void withdraw() { // 출금 <-> 예금
        // 계좌번호 입력받고 => 사용자의 계좌번호와 일치하는지 체크
        // 맞으면 예금액 입력받고 => 잔액 + 예금액
        // null이 아니어야 함 account[i].getAno() == ano break;
        // return account[i]
        System.out.print("계좌번호를 입력하세요 : ");

        String ano = sc.nextLine();

        // 예금액 입력받기

        System.out.print("출금액을 입력하시오 : ");
        int balance = Integer.parseInt(sc.nextLine());

        Account findAcc = findAccount(ano);
        // findAcc가 null 일때 메서드에 접근하면 NullPointerException 발생
        if (findAcc != null) {
            findAcc.withdraw(balance);
        }

        // account.balance = account.getBalance() + balance;

        // System.out.printf("예금액 : %d\t 잔액 : %d\n", balance, account.getAno());
    }

    private static Account findAccount(String ano) {
        // 입력값 ano와 account 배열 계좌 중에서 일치하는 계좌 찾기
        Account acc = null;
        for (int i = 0; i < account.length; i++) {
            // 널이 아니어야 하고 account[i].getAno() == ano break;
            if (account[i] != null) {
                // if(account[i].getAno().equals(ano)){
                // return account[i];
                // }
                if (account[i].getAno().equals(ano)) {
                    acc = account[i];
                    break;
                }
            }
        }
        return acc;
    }
}
