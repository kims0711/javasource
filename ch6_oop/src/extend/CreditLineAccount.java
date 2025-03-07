package extend;

public class CreditLineAccount extends Account { // Account 상속

    private int creditLine; // 마이너스 한도

    // creditLine 만들고 생성자 안 만들면 알아서 아래와 같은 기본 생성자 생김
    // CreditLineAccount(){
    // super();
    // }
    // 근데 부모 클래스의 기본 생성자를 주석처리 하면 위에 오류가 생기고 아래와 같이 해결 가능
    public CreditLineAccount(String ano, String owner, long balance, int creditLine) {
        super(ano, owner, balance);
        this.creditLine = creditLine;
    }

    // 오버라이딩
    // (잔액 + 마이너스한도) - 사용액

    @Override
    void withdraw(long amount) throws Exception {
        if (super.getBalance() + this.creditLine < amount) {
            throw new Exception("한도 범위를 초과합니다.");
        }
        // 잔액 = 잔액 - 사용액
        super.setBalance(super.getBalance() - amount);
    }

}
