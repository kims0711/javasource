package poly;

public class Car3 {
    // 멤버변수의 타입 : 기본, 객체(대문자로 시작, 배열)
    // 기본 : 정수- 0, 실수-0.0, boolean-false
    // 객체 : null

    Tire frontLeft = new HankookTire(0, null); // 객체 초기화는 무조건 new 해야함-> 안 하면 널포인트익셉션 뜸
    Tire frontRight;
    Tire backLeft;
    Tire backRight;

    int num;

    // 초기화 : NullPointerException을 피하기 위해
    // : 1)생성자, 2)set 메서드, 3)멤버변수 선언하면서 초기화하기

    public Car3(Tire frontLeft, Tire frontRight, Tire backLeft, Tire backRight) {
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.backLeft = backLeft;
        this.backRight = backRight;
    }

}
