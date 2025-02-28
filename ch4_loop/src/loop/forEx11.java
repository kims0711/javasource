package loop;

import java.util.Scanner;

public class forEx11 {
    public static void main(String[] args) {

        // 구구단

        // for (int i = 2; i < 10; i++) {
        // System.out.printf("< %d단 >\n", i);
        // for (int j = 1; j < 10; j++) {
        // System.out.printf("%d * %d = %d\n", i, j, i * j);
        // }
        // System.out.println();
        // }

        // 몇단까지 출력할지 입력받고 출력하기 (그냥 해봄)
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("몇단까지 출력하실 건가요? (숫자로 입력하세요)");
        // int dan = scanner.nextInt();

        // for (int i = 2; i <= dan; i++) {
        // System.out.printf("< %d단 >\n", i);
        // for (int j = 1; j <= 9; j++) {
        // System.out.printf("%d * %d = %d\n", i, j, i * j);
        // }
        // System.out.println();
        // }

        for (int i = 2; i < 10; i++) {
            System.out.printf("< %d단 >\n", i);
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\t", i, j, i * j);
            }
            System.out.printf("\n\n");
        }

    }
}
