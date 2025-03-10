package poly;

public class CarEx3 {
    public static void main(String[] args) {

        HankookTire frontLeft = new HankookTire(1, "앞 왼쪽");
        HankookTire frontright = new HankookTire(1, "앞 오른쪽");
        HankookTire backLeft = new HankookTire(1, "뒤 왼쪽");
        HankookTire backRight = new HankookTire(1, "뒤 오른쪽");

        Car3 car3 = new Car3(frontLeft, frontright, backLeft, backRight); // 생성자를 이용한 초기화

        System.out.println(car3.num); // 0
        System.out.println(car3.frontLeft); // null
        // NullPointerException
        System.out.println(car3.frontLeft.acuumulateRotation);
    }
}
