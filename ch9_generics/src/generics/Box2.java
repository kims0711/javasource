package generics;

import javax.swing.Box;

public class Box2<T> {

    T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    class BoxEx2 {
        public static void main(String[] args) {
            Box2<String> box = new Box2<>(); // 오른쪽은 String 생략 가능 (어차피 왼쪽에서 선언한 타입만 들어올 수 있으니까)
            box.setItem("자바"); // new String 같은 것도 같은 이유로 필요 X
            String result = (String) box.getItem();

            // Object로 받을 때와 다르게 형변환 하지 않아도 됨
            Box2<Integer> box2 = new Box2<>();
            box2.setItem(1);
            int i = (int) box2.getItem();
        }
    }
}
