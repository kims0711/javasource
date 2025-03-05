package oop;

import java.util.Arrays;

public class SquareEx2 {
    public static void main(String[] args) {

        // 한두개일때는 이렇게 하나하나 해도 되지만 많아지면 힙들다
        Square square = new Square(10);
        System.out.println("정사각형 면적 : " + square.getArea());

        Square square2 = new Square(15);
        System.out.println("두번째 정사각형 면적 : " + square2.getArea());
        // 배열
        // 1) 타입 배열명[] = new 타입[n];
        // 2) 타입 배열명[] = {};

        // 객체배열
        // 객체(클래스)명 배열명[] = new 객체(클래스)명[n];

        Square squareArr[] = new Square[5]; // Square 밖에 못 담아! 그래서 23번째 줄 처럼 담게 되는 것
        System.out.println(Arrays.toString(squareArr)); // [null, null, null, null, null] : 객체배열은 초기값이 null이 됨

        // 객체 배열 초기화
        // squareArr[0] = new Square(); // sideLength = 0 으로 초기화 된 상태
        // squareArr[1] = new Square();
        // squareArr[2] = new Square();
        // squareArr[3] = new Square();
        // squareArr[4] = new Square();

        for (int i = 0; i < squareArr.length; i++) {
            squareArr[i] = new Square();
        }

        // sideLength에 값 부여
        squareArr[0].sideLength = 35;
        squareArr[1].sideLength = 13;
        squareArr[2].sideLength = 23;
        squareArr[3].sideLength = 9;
        squareArr[4].sideLength = 17;

        for (int i = 0; i < squareArr.length; i++) {
            System.out.printf("%d 번째 정사각형 면적 : %d\n", (i + 1), squareArr[i].getArea());
        }

    }
}
