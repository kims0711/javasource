package oop;

public class Account {
    // 속성 : 계좌번호(ano), 이름(owner), 잔액(balance)
    // 110-10-0100
    // 기능 : 예금하다(잔액 = 잔액 + 예금액), 출금하다(잔액 = 잔액 - 출금액)
    // deposit, withdraw
    // 생성자(default, 멤버변수 3개 초기화) 두개 만들기
    // toString

    private String ano, owner;
    private long balance;

    public String getAno() {
        return ano;
    }

    public String getOwner() {
        return owner;
    }

    public long getBalance() {
        return balance;
    }

    public Account() {
    }

    public Account(String ano, String owner, long balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    // 예금하기
    void deposit(long amount) {
        this.balance += amount;
    }

    // 출금하기
    void withdraw(long amount) {
        // 인출액이 잔액보다 작으면 go 아니면 불가능
        if (amount > balance) {
            System.out.println("잔액이 부족합니다");
            return;
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
    }
}
