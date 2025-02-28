package op;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        // 키보드로 입력받기
        Scanner scanner = new Scanner(System.in); // 키보드로 사용자에게 입력받기
        // System.in : 키보드 / System.out : 화면
        System.out.println("정수 입력하세요 ");

        int input = scanner.nextInt(); // 입력값이 정수이어야 함
        System.out.println("입력값= " + input);

        scanner.close();
    }
}
