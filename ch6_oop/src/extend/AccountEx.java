// 클래스 만들면 -> 구조
// 

package extend;

public class AccountEx {
    public static void main(String[] args) {
        // new -> CheckingAccount의 default 생성자 호출
        // 자식 클래스의 인스턴스를 만들면 부모의 인스턴스도 같이 생성됨
        // 그래서 아래의 코드들도 문제없이 사용 가능했던 것

        CheckingAccount cAccount = new CheckingAccount("110-11", "min", 1000000, "1313-1313");
        // CheckingAccount 클래스에서 부모(Account)의 2 생성자를 가져왔기 때문에 가능해진 것

        System.out.println("계좌번호 : " + cAccount.getAno()); // null
        System.out.println("계좌주 : " + cAccount.getOwner()); // null
        System.out.println("잔액 : " + cAccount.getBalance()); // 0
        System.out.println("체크카드번호 : " + cAccount.getCardNo()); // null

        try {
            // System.out.println("현재 잔액 : " + cAccount.pay("435", 100));
            System.out.println("현재 잔액 : " + cAccount.pay("1313-1313", 50000));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // CreditLineAccount
        CreditLineAccount creditLineAccount = new CreditLineAccount("1002", "김민성", 100000, 50000);
        try {
            // creditLineAccount.withdraw(3000000); // 마이너스 한도 초과한다고 출력됨
            creditLineAccount.withdraw(120000); // 마이너스 한도 이내이기 때문에 정상 출력
            System.out.println("현재 잔액 : " + creditLineAccount.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // BonusPointAccount
        BonusPointAccount bonusPointAccount = new BonusPointAccount("1002", "김민성", 1000000, 0); // 처음에는 보너스 포인트 0
        bonusPointAccount.deposit(1000000);
        System.out.println("보너스 포인트 : " + bonusPointAccount.getBonusPoint());

        // CheckingTrafficAccount
        CheckingTrafficAccount checkingTrafficAccount2 = new CheckingTrafficAccount("1002", "김민성", 1000000, "1313-1313",
                true);
        CheckingTrafficAccount checkingTrafficAccount = new CheckingTrafficAccount("1002", "김민성", 1000000, "1313-1313",
                false);
        try {
            System.out.println("교통카드 지불 후 현재 잔액 : " + checkingTrafficAccount2.payTrafficCard("1313-1313", 1400));
            System.out.println("현재 잔액 : " + checkingTrafficAccount.payTrafficCard("1313-1313", 1400));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
