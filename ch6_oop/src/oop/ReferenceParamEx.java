package oop;

public class ReferenceParamEx {
    public static void main(String[] args) {
        int[] x = { 10 };
        System.out.println("main() : x = " + x[0]); // 1) 10
        // 주소복사
        change(x); // 주소 자체를 복사
        // 값복사
        change2(x[0]); // 이렇게 값만 복사하여 넘기는 것
        System.out.println("After change(x)");
        System.out.println("main() : x = " + x[0]); // 3) 1000 -> 바꼈음
    }

    static void change(int[] x) {
        x[0] = 1000;
        System.out.println("change(0) : x = " + x[0]); // 2) 1000
    }

    static void change2(int x) {
        x = 100;
        System.out.println("change2(0) : x = " + x);
    }

}
