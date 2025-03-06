package oop;

import java.util.Arrays;

public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 6, 5, 4 };
        pirntArr(arr); // 주소 복사
        sorttArr(arr);
        // 정렬후 결과 출력
        pirntArr(arr);
        System.out.println("sum = " + sumArr(arr));
    }

    static void pirntArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += i;
        }
        return sum;
    }

    static void sorttArr(int[] arr) {
        // 버블정렬
        for (int i = 0; i < arr.length - 1; i++) { // ch5 - arrayEx11 참조
            for (int j = 0; j < arr.length - 1 - i; j++) { // 뒷자리부터 정렬이 끝나기 때문에 arr.length - 1 - i 만큼 빼주는 것
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

}
