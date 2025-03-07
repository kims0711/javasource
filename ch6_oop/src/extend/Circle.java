package extend;

// 클래스간의 관계

// 1) 상속관계 : isa
// 2) 포함관계 : hasa
// 한 클래스 안에 다른 클래스가 "멤버 변수"로 선언

// 관계 결정하기
// public class Circle extends Point{} 로 했다면?
// extends : 원(Circle)은 점(Point) 이다 : Circle is a Point
// 포함 : 원(Circle)은 점(Point)을 가지고 있다 : Circle has a Point

// Car, SportsCar 
// SprtsCar는 Car이다 or SportCar는 Car를 가지고 있다. : 전자가 더 합리적

public class Circle extends Shape {
    // x,y 좌표와 반지름 r
    // int x;
    // int y;
    Point point; // Point 클래스의 코드 끌고 와서 쓰는 것(Point클래스를 멤버변수로 씀)
    int r;
    // String name; // 사실 String 도 포함관계였음 ("대문자"로 시작하잖아)

    public Circle() {
    }

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }

    void draw() { // Shape에 draw 있었는데 여기서 또 다시 정의됨 : "오버라이딩"
        System.out.printf("[center = (%d,%d), r = %d, color = %s]\n", point.x, point.y, r, color);
    }

}
