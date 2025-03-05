package oop;

public class TriangleEx {
    public static void main(String[] args) {

        // 1) 직접 입력
        Triangle triangle = new Triangle();

        // 인스턴스 변수 초기화
        triangle.baseLine = 7;
        triangle.height = 7;
        System.out.println("면적은 = " + triangle.getArea());

        // 2) 생성자 만들고 이용
        triangle = new Triangle(20, 15);
        System.out.println("면적은 = " + triangle.getArea());

    }
}
