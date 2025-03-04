package array;

import java.util.Arrays;

public class arrayEx6 {
    public static void main(String[] args) {
        // 배열 : 한 번 생성하면 길이 변경이 불가능
        int arr[] = { 89, 56, 75, 65, 34 };

        // 기존 배열에 값을 추가해야 한다면
        // 새로운 배열 공간을 만들고
        int tmp[] = new int[10];

        // 1) for을 이용한 복사
        // 새로운 배열에 기존 배열 값 복사
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        System.out.println("< 방법 1 >");
        System.out.println(Arrays.toString(tmp));

        System.out.println();

        // 2) System.arraycopy(); 사용하기
        // arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        // arraycopy(원본 배열, 원본 배열에서 복사할 시작위치, 새로운 배열명, 새로운 배열에 붙여넣기 할 위치, 복사할 index의 수)

        int tmp2[] = new int[10];

        System.arraycopy(arr, 0, tmp2, 0, arr.length); //
        System.out.println("< 방법 2 >");
        System.out.println(Arrays.toString(tmp2));
    }

}
