package io;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드 입력
        // 1) InputStream
        // 2) Scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력");
        int num1 = sc.nextInt(); // 숫자 치고 엔터 하면 nextInt가 숫자만 가져가고 엔터는 버퍼에 남겨둠
                                 // ∴ 다음에 스트링 입력 받으려고 해도 남은 엔터가 입력되어서 넘어가 버리는 것
                                 // ∴ 그냥 nextLine으로 받고 Integer로 형변환 하자

        System.out.println("연산자 입력(+, -, *, /)");
        String op = sc.next(); // 얘를 그냥 next() 로 받으면 엔터 안 넘어오긴 함
        System.out.println("두번째 숫자 입력");
        int num2 = sc.nextInt();

        System.out.printf("%d %s %d = ?", num1, op, num2);
        sc.nextLine();
        sc.nextInt();

        // sc.next();

    }

}
