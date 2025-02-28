package loop;

import java.util.Scanner;

public class forEx9 {
    public static void main(String[] args) {
        // 삼각형 별 찍기 (5개 까지)

        // *
        // **
        // ***
        // ****
        // *****

        // * 을 출력할 라인의 수를 입력받고 출력하기

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자(정수)를 입력하세요 ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
