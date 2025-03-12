package exception;

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

    public static void main(String[] args) {
        String str = null;
        Account accounts[] = new Account[5];

        // try catch 없이 if 로 nullpointerException 피하기
        for (Account account : accounts) {
            if (account != null) {
                System.out.println(account.getAno());
            }
        }

        // if 를 사용하지 않으면 널포인터 발생할 때 처리 필요
        try {
            for (Account account : accounts) {
                System.out.println(account.getAno());
                // NullPointerException 뜸 .찍고 접근했으니까 이때 .앞의 것이 null 이라는 뜻
                // 결국 accounts가 null 이라는 뜻 (초기화 안 했으니까)
            }
        } catch (NullPointerException e) {
            e.printStackTrace(); // 어디가 에러인지 알려주는 코드 (개발자용)
            System.out.println(e.getMessage()); // 뭐가 오류인지 설명해줌
            System.out.println("입력을 다시 확인해주세요");
        }
    }
}
