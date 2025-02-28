package loop;

import java.util.Scanner;

public class forEx10 {
    public static void main(String[] args) {
        // 삼각형 별 찍기 (좌우반전)

        // *
        // **
        // ***
        // ****
        // *****

        // * 을 출력할 라인의 수를 입력받고 출력하기

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("숫자(정수)를 입력하세요 ");
        // int num = scanner.nextInt();

        // for (int i = 0; i < num + 1; i++) {
        // for (int j = num; j > 0; j--) {
        // if (i < j) {
        // System.out.print(" ");
        // } else {
        // System.out.print("*");
        // }
        // }
        // System.out.println();
        // }
        // scanner.close();

        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > 0; j--) {
                // if (j > i) {
                // System.out.print(" ");
                // } else {
                // System.out.print("*");
                // }
                System.out.print(j > i ? " " : "*"); // 삼항연산자로도 가능
            }
            System.out.println();
        }

    }
}
