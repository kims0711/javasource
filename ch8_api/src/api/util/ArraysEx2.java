package api.util;

import java.util.Arrays;

// 검색
public class ArraysEx2 {
    public static void main(String[] args) {

        Integer[] arr = { 33, 4, 17, 62, 7 };
        int result = 0;
        // 배열 안에 17이 있는지 찾고싶음
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("15위치 : " + Arrays.binarySearch(arr, 17) + "번 index에 있음"); // index넘버로 돌려줌

        // 배열비교
        Integer[] arr1 = { 33, 4, 17, 62, 7 };
        Integer[] arr2 = { 33, 4, 17, 62, 8 };
        System.out.println("배열 요소의 값 비교 : " + Arrays.equals(arr1, arr2)); // false 출력됨 (boolean으로 return 하니까)

    }
}
