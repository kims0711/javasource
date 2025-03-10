package poly;

public class CarEx {
    public static void main(String[] args) {
        Car car = new FireEngine();

        car.drive();
        car.stop();

        // 처음에 얘만 치면 안 되는데 가능하게 해보자
        // car.water();

        // 해결
        FireEngine fe = (FireEngine) car; // 캐스팅 하고
        fe.water();

        ((FireEngine) car).water(); // 이렇게 한줄로도 가능

        // instance of : 참조변수가 참조하고 있는 실제 인스턴스의 타입 알아보기

        if (car instanceof FireEngine) {
            System.out.println("FireEngine의 instance 임");
        }
        if (car instanceof Car) {
            System.out.println("Car의 instance 임");
        }

        Car car2 = new Car();

        if (car2 instanceof FireEngine) {
            System.out.println("car2 - FireEngine의 instance임"); // false이기 때문에 출력x
        }
        if (car2 instanceof Car) {
            System.out.println("car2 - Car의 instance임");
        }

    }

}
