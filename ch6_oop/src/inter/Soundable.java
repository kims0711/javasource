package inter;

public interface Soundable {
    String sound();
}

class Cat implements Soundable {

    @Override
    public String sound() {
        return "냐옹";
    }

}

class Dog implements Soundable {

    @Override
    public String sound() {
        return "멍멍";
    }
}

class SoundableEx {
    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }

    static void printSound(Soundable s) { // 인터페이스가 공통된 부모이니 인터페이스로 매개변수 받기
        System.out.println(s.sound());
    }

}
