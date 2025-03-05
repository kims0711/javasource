package oop;

public class AccountEx {
    public static void main(String[] args) {

        Account account = new Account("110-10-0100", "김민성", 1000000);
        System.out.println(account);

        // 200,000 입금
        account.deposit(200000);
        System.out.println("입급 후 잔액 : " + account.balance);

        // 150,000 출금
        account.withdraw(150000);
        System.out.println("출금 후 잔액 : " + account.balance);

    }

}
