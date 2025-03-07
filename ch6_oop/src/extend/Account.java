package extend;

public class Account {
    // 속성 : 계좌번호(ano), 이름(owner), 잔액(balance)

    private String ano, owner;
    private long balance; // 자식이 private인 balance를 쓰려면 메소드를 써야한다 (17번째 줄의 getBalance())

    public String getAno() {
        return ano;
    }

    public String getOwner() {
        return owner;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    // 1 생성자(기본)
    // public Account() {
    // }

    // 2 생성자
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
    void withdraw(long amount) throws Exception {
        // 인출액이 잔액보다 작으면 go 아니면 불가능
        if (amount > balance) {
            System.out.println("잔액이 부족합니다");
            throw new Exception("잔액 확인");
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
    }
}
