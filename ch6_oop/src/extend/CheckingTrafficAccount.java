package extend;

public class CheckingTrafficAccount extends CheckingAccount {

    private boolean hasTrafficcard;

    public CheckingTrafficAccount(String ano, String owner, long balance, String cardNo, boolean hasTrafficcard) {
        super(ano, owner, balance, cardNo);
        this.hasTrafficcard = hasTrafficcard;
    }

    public boolean isHasTrafficcard() { // boolean만 get이 아닌 is
        return hasTrafficcard;
    }

    // 교통비 지불
    long payTrafficCard(String carNo, int amount) throws Exception {
        // 교통카드 기능이 있다면 교통비 지불한다.
        if (!hasTrafficcard) {
            throw new Exception("교통카드 기능이 없습니다.");
        }
        // 카드번호, 잔액 확인 후 지불한다. // CheckinAccount의 pay에 비슷한 기능 있으니 가져오자
        return pay(carNo, amount); // CheckingAccount의 pay에 넘겨서 계산하고 다시 balance return받기 // amount = 교통비
    }

}
