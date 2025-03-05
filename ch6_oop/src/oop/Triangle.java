package oop;

public class Triangle {

    // 속성 : 밑변(baseLine), 높이(height)
    // 기능 : 면적을 구한다. - getArea()

    int baseLine, height;
    // double getArea = baseLine * height / 2;

    public Triangle() {
    }

    // 생성자 목적
    // 인스턴스 변수 초기화
    public Triangle(int baseLine, int height) {
        this.baseLine = baseLine;
        this.height = height;
    }

    double getArea() {

        return baseLine * height / 2.0;
    }
}
