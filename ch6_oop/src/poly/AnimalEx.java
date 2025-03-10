package poly;

public class AnimalEx {
    public static void main(String[] args) {
        // ===아래처럼 가능하지만===
        // Animal animal = new Animal();
        // Canine canine = new Canine();
        // Feline feline = new Feline();
        // Cat cat = new Cat();
        // Dog dog = new Dog();

        // ===이렇게 하는 것도 허용===
        // 부모 = new 자식
        Animal animal = new Animal();
        Animal animal1 = new Canine();
        Animal animal2 = new Feline();
        Animal animal3 = new Cat();
        Animal animal4 = new Dog();

        // Dog dog = new Cat(); // 형제끼리는 참조 안 되니까 당연히 오류 Type mismatch

    }

}
