package poly;

public class Car {
    String color;
    String door;

    void drive() {
        System.out.println("Drive");
    }

    void stop() {
        System.out.println("stop");
    }

}

class FireEngine extends Car {
    void water() {
        System.out.println("water");
    }
}
