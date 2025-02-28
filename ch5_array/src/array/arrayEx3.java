package array;

import java.util.Arrays;
import java.util.Scanner;

public class arrayEx3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 5명 학생의 수학점수를 입력받아서 평균, 총합 구하기
        int[] arr = new int[5];

        // System.out.println("첫번째 학생 점수 입력");
        // arr[0] = sc.nextInt();

        // System.out.println("두번째 학생 점수 입력");
        // arr[1] = sc.nextInt();

        // System.out.println("세번째 학생 점수 입력");
        // arr[2] = sc.nextInt();

        // System.out.println("네번째 학생 점수 입력");
        // arr[3] = sc.nextInt();

        // System.out.println("다섯번째 학생 점수 입력");
        // arr[4] = sc.nextInt();

        // 아래 for문 코드로 위에 주석처리된 코드들 간략하게 가능
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

    }

}
