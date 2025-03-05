package oop;

import java.util.Arrays;

public class MethodEx {
    public static void main(String[] args) {
        // Method 인스턴스 생성
        Method method = new Method();

        // 메서드 호출
        int result = method.add(15, 25);

        System.out.println(result);

        float result2 = method.add2(5, 5.f);
        System.out.println(result2);

        System.out.println(method.add(5, 3));

        method.print("홍길동", "s123"); // void는 호출만 하고 끝임, 변수에 담기 불가능

        int arr[] = { 5, 3, 2 };
        int arr2[] = method.arr(arr);
        System.out.println(Arrays.toString(arr2));
    }

}
