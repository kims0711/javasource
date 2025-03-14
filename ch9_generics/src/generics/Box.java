package generics;

public class Box {

    Object item; // 사용자가 원하는대로 아무거나 담게 하고

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }

    class BoxEx {
        public static void main(String[] args) {
            Box box = new Box();
            box.setItem(new String("자바"));
            String result = (String) box.getItem(); // 받을때마다 형변환하기

            box.setItem(Integer.valueOf(1));
            int i = (int) box.getItem(); // 22
        }
    }
}
