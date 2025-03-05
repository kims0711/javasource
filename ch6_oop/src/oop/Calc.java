package oop;

public class Calc {
    // 사칙연산 계산기

    long add(long num1, long num2) {
        return num1 + num2;
    }

    long subtract(long num1, long num2) {
        return num1 - num2;
    }

    long multiply(long num1, long num2) {
        return num1 * num2;
    }

    double divide(double num1, double num2) {
        return num1 / num2;
    }

    // 큰 값 출력하기
    long max(long num1, long num2) {
        // if (num1 > num2) {
        // return num1;
        // } else {
        // return num2;
        // }
        return num1 > num2 ? num1 : num2; // 삼항연산자로도 가능
    }

    long min(long num1, long num2) {
        // if (num1 < num2) {
        // return num1;
        // } else {
        // return num2;
        // }
        return num1 < num2 ? num1 : num2; // 얘도 삼항연산자로
    }

}
