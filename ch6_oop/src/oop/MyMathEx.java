package oop;

public class MyMathEx {
    public static void main(String[] args) {
        MyMath math = new MyMath();

        System.out.println(math.add(5, 10));
        System.out.println(math.add(5L, 10)); // long에는 L 붙여주기
        System.out.println(math.add(5, 10L)); // long에는 L 붙여주기

        int arr[] = { 3, 4, 5 };
        System.out.println(math.add(arr));
    }

}
