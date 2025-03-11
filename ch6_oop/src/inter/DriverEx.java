package inter;

public class DriverEx {
    public static void main(String[] args) {
        Driver driver = new Driver(); // Driver 클래스의 인스턴스 만들고

        driver.drive(new Taxi());
        driver.drive(new Bus());
        driver.drive(new Subway());
        // Driver의 driver 메서드 출력 하면 subway,bus,taxi의 오버라이딩 된 내용들이 출력되는 것
    }

}
