package array;

import java.util.Arrays;

public class arrayEx9 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) { // 10칸 짜리 배열에 0~9 넣기
            numArr[i] = i;
        }

        System.out.println(Arrays.toString(numArr));

        // * < 자바에서 값의 위치 바꾸기 >
        // int a = 10, b = 15; // a랑 b의 값 바꾸기 -> 자바에서는 임시 공간 하나를 새로 만들고 연쇄적으로 옮겨야 함
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.printf("a값 = %d, b값 = %d", a, b);

        System.out.println();

        // 위에서 넣은 0~9 섞어주기
        for (int i = 0; i < 100; i++) {
            // 교환위치 임의 생성 : 0~9
            int pos = (int) (Math.random() * 10); // 10곱해주고 int로 캐스팅 해줘서 0~9로 됨
            int temp = numArr[0]; // 0번 자리를 교환 자리로 만들고 임의의 자리를 계속 0번 자리의 수와 100번 교환한 개념
            numArr[0] = numArr[pos];
            numArr[pos] = temp;
        }
        System.out.println(Arrays.toString(numArr));

    }

}
