package extend;

public class Shape {
    String color = "black";

    void draw() {
        System.out.printf("[color = %s]", color); // 부모가 주는 draw : color 만 있음
    }

}
