package generics;

import java.util.ArrayList;

class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Box3<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box3<Fruit> fruitBox = new Box3<>();
        Box3<Apple> appleBox = new Box3<>();
        Box3<Toy> toyBox = new Box3<>();
        Box3<Grape> grapeBox = new Box3<>();

        // 상속 관계 시 부모 타입으로 지네릭스를 선언하면 모든 자식을 담을 수 있다.
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); // 가능 (Fruit의 자식 클래스니까)

        appleBox.add(new Apple());
        // appleBox.add(new Fruit()); -> 부모는 못 담는다! (다형성에 따라)
        // appleBox.add(new Grape()); -> 얘도 형제 관계니까 당연히 ㅂㄱㄴ
        // 자식을 부모에 담는 것만 가능하다
        toyBox.add(new Toy()); // 당연하지만 얜 toy만 가능
        grapeBox.add(new Grape()); // 얘도 마찬가지

    }

}
