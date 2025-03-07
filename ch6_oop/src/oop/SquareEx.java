package oop;

import java.util.Arrays;

public class SquareEx {
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

        Square squareArr[] = new Square[5]; // Square 밖에 못 담아!
        System.out.println(Arrays.toString(squareArr)); // [null, null, null, null, null] : 객체배열은 초기값이 null이 됨
        // 원하는 값으로 초기화
        squareArr[0] = new Square(15);
        // System.out.println("첫번째 면적 : " + squareArr[0].getArea());
        squareArr[1] = new Square(4);
        // System.out.println("두번째 면적 : " + squareArr[1].getArea());
        squareArr[2] = new Square(7);
        // System.out.println("세번째 면적 : " + squareArr[2].getArea());
        squareArr[3] = new Square(11);
        // System.out.println("네번째 면적 : " + squareArr[3].getArea());
        squareArr[4] = new Square(9);
        // System.out.println("다섯번째 면적 : " + squareArr[4].getArea());
        for (int i = 0; i < squareArr.length; i++) {
            System.out.printf("%d 번째 면적 : %d\n", (i + 1), squareArr[i].getArea());
        }

        // 배열 기본타입으로 생성
        // 정수형-0, 실수형-0.0, 불린형-false
        int arr[] = new int[5];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]
        // 원하는 값으로 초기화
        arr[0] = 15;
        arr[1] = 11;
        arr[2] = 7;
        arr[3] = 5;
        arr[4] = 9;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
