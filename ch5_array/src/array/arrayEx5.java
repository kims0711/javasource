package array;

import java.util.Arrays;

public class arrayEx5 {
    public static void main(String[] args) {

        // char값 5개 담기 ( a ~ e )
        // 담아야 하는 값을 전부 알고 있기 때문에 중괄호 사용한다.

        char chArr[] = { 'a', 'b', 'c', 'd', 'e' }; // 배얼선언, 생성

        // 배열 길이가 알고싶다
        System.out.println("배열 길이 : " + chArr.length);

        // 배열 요소 확인
        System.out.println(chArr);
        System.out.println(Arrays.toString(chArr));

        // 배열 요소 변경
        chArr[2] = 'f';
        System.out.println(Arrays.toString(chArr));

        // double 배열 선언, 생성(5)

        double dbArr[] = { 90.5, 43.7, 75, 9.19, 9.14 };
        System.out.println(dbArr); // [D@1be6f5c3 얘는 그냥 주소 (주소로 출력됨)
        System.out.println(Arrays.toString(dbArr)); // Arrays.toString(arr) : 주소가 아닌 배열명이 가리키는 실제 값을 출력하기 위해

    }

}
