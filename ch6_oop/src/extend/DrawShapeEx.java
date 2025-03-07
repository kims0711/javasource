package extend;

public class DrawShapeEx {
    public static void main(String[] args) {

        // Point[] point = new Point[3];
        // point[0] = new Point(100, 100);
        // point[0] = new Point(120, 120);
        // point[0] = new Point(140, 140);
        Point[] point = { new Point(100, 100), new Point(120, 120), new Point(140, 140) }; // 위에 긴 코드도 가능은 하지만 이렇게 간단하게
                                                                                           // 가능
        // 삼각형 그리기
        Triangle triangle = new Triangle(point); // Triangle 클래스 9번째 줄 때문에 : 여기 point 배열로 받아라 라는 듯
        triangle.draw();

        // 원 그리기
        // Point p1 = new Point(150, 150);
        // Circle circle = new Circle(p1, 30);
        Circle circle = new Circle(new Point(150, 150), 30); // 위 방법도 되지만 이렇게도 가능 (따로 p1을 또 만들지 않고)
        circle.draw();
    }
}
