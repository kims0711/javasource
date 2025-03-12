package exception;

import java.util.Scanner;

public class NumberFormatEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 >> ");
        try {
            int num = Integer.parseInt(sc.nextLine());
            System.out.println(num);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("숫자를 입력해주세요");
        } finally {
            System.out.println("무조건 실행"); // 예외의 발생 여부 상관없이 무조건 실행되는 코드
        }

        // 아래처럼 catch 안 잡고 finally 올 수도 있음
        try {
            int num[] = new int[1];
            System.out.println(num[3]);
        } finally {
            System.out.println("여기도 무조건 실행");
        }

        sc.close();
    }
}
