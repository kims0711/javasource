package extend;

// 삼각형은 도형이다 (isa)
// 삼각형은 점을 세개 가지고 있다 (hasa)
public class Triangle extends Shape { // 삼각형은 도형이니까

    Point[] point; // 포함 : 점을 세개 가지고 있으니까

    public Triangle(Point[] point) { // 생성자
        this.point = point;
    }

    void draw() {
        System.out.printf("p1 = %s, p2 = %s, p3 = %s, color = %s\n", point[0].getXY(), point[1].getXY(),
                point[2].getXY(), color);
    }
}
