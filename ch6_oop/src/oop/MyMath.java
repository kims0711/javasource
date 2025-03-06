package oop;

// 오버로딩
// 메서드 오버로딩 : 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것
// 생성자 오버로딩 : 한 클래스 내에 같은 이름의 생성자를 여러 개 정의하는 것

// 오버로딩 조건 
// 1. 메서드명이 같아야 한다.
// 2. 매개변수의 개수 또는 타입이 달라야 한다. (리턴 타입이 아닌 매개변수의! )

public class MyMath {
    int add(int a, int b) {
        System.out.println("int add(int a, int b)");
        return a + b;
    }

    long add(long a, int b) { // 2 조건 맞춘 것 (int->long 으로 바꿔서)
        System.out.println("int add(int a, int b)");
        return a + b;
    }

    long add(int a, long b) { // 얘도 마찬가지 (위와 a,b의 타입만 서로 바꿔줌)
        System.out.println("int add(int a, int b)");
        return a + b;
    }

    long add(int a[]) { // 2 조건 맞춘 것 (int->long 으로 바꿔서)
        System.out.println("int add(int a, int b)");
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;

    }
}
