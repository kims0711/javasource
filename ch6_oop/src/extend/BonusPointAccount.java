package extend;

public class BonusPointAccount extends Account {

    private int bonusPoint;

    public BonusPointAccount(String ano, String owner, long balance, int bonusPoint) {
        super(ano, owner, balance);
        this.bonusPoint = bonusPoint;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    @Override
    void deposit(long amount) {
        // 예금하다
        super.deposit(amount);
        // 보너스포인트 추가
        bonusPoint += amount / 100;

    }
    // 보너스포인트 = 보너스포인트 + (예금액의 1%)
    // 예금하다 메소드 수정
    // 부모 클래스에 기본 예금 메소드는 있는데 보너스 기능 추가 원함 -> 오버라이딩 !!

}
