package array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayEx4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // n명 학생의 수학점수를 입력받아서 평균, 총합 구하기 (몇명인지 입력받기)
        int[] arr; // 배열 선언만 한 것

        System.out.println("학생의 수를 입력하시오");
        int num = sc.nextInt();
        // 배열 생성
        arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d 번째 학생 점수 입력 : ", (i + 1));
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf("총합 : %d \n", sum);
        System.out.printf("평균 : %.2f\n", (double) sum / arr.length);

        sc.close();
    }

}
