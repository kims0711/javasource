package extend;

public class CheckingAccount extends Account {
    // 은행계좌 + 체크카드 기능
    private String cardNo;

    // 부모의 default 생성자 호출
    // public CheckingAccount() {
    // super(); //부모거
    // }

    // 부모(Account 클래스)의 2 생성자를 호출하는 방법 (위에 super()는 1 생성자 호출됨)
    public CheckingAccount(String ano, String owner, long balance, String cardNo) {
        super(ano, owner, balance);
        this.cardNo = cardNo;
    }

    // 비용(체크카드 사용액) 지불
    // 사용한 카드번호와 체크카드 번호의 일치 여부 확인
    // 조건1 : 잔액 > 사용액
    long pay(String cardNo, int amount) throws Exception {
        if (!this.cardNo.equals(cardNo) || getBalance() < amount) { // this.carNo는 checkingAccount의 cardNo 이고 /
                                                                    // cardNo는 입력값으로 들어오는 String cardNo의 cardNo이다
            throw new Exception("cardNo나 잔액을 확인해주세요");

        }
        // 위 조건에 맞으면 비용 지불 : 잔액 -= 사용액 (부모의 withdraw와 같은 개념이니 그거 쓰자)
        withdraw(amount);
        // 잔액(getBalance) 리턴
        return getBalance();
    }

    public String getCardNo() { // getter 하나 정도 만들 때 그냥 get 치면 자동완성 됨
        return cardNo;
    }

}
