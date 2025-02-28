package array;

import java.util.Arrays;

public class arrayEx2 {
    public static void main(String[] args) {
        // 길이가 10인 int형 배열 생성

        int[] arr = new int[10]; // int arr[] = new int[10]; -> 대괄호 위치 둘 다 가능

        // System.out.println(Arrays.toString(arr)); //원래 배열의 내용 (int로 공간만 잡았기 때문에 0만
        // 들어있음)

        for (int i = 0; i < arr.length; i++) { // 배열에 값을 변경하기
            arr[i] = i * 10 + 10;
        }
        System.out.printf("\n\n");
        // 배열 요소의 값을 확인하는 방법
        // 1) for문 사용 : 원하는 모양(형태)로 출력이 가능하다
        // 2) 향상된 for문 1)과 같음
        // 3) Arrays.toString(배열명) : [배열요소 출력]

        System.out.print(Arrays.toString(arr)); // for문 거친 후에 배열의 내용

        // 향상된 for문 -> index 사용 못 함
        // 따라서 필요한 경우 아래와 같이 index 만들어 사용 할 수 있음
        int idx = 0;
        for (int i : arr) {
            System.out.print(++idx + " : " + i + "\t");
        }

        System.out.printf("\n\n");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "\t");
        }

    }

}
