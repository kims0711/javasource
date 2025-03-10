package poly;

public class Animal { // 클래스 여러개 작성 가능은 하나 public은 하나만 가능 (public = 접근제한 없이 모두 가능)
    Animal() { // default 생성자
        System.out.println("Amimal 생성자");
    }

}

class Canine extends Animal {
    Canine() {
        // super(); 여기에 숨어져 있지만 있는 것이다
        System.out.println("Canine 생성자");
    }
}

class Feline extends Animal {
    Feline() {
        System.out.println("Feline 생성자");
    }
}

class Dog extends Canine {
    Dog() {
        System.out.println("Dog 생성자");
    }
}

class Cat extends Feline {
    Cat() {
        System.out.println("Cat 생성자");
    }
}
