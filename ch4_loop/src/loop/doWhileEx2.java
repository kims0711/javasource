package loop;

import java.util.Scanner;

public class doWhileEx2 {
    public static void main(String[] args) {

        // 문자 입력받은 후 출력
        // q라는 문자가 입력되면 종료

        Scanner scanner = new Scanner(System.in);

        String input;

        do {
            System.out.println("하나의 영문자를 입력하십시오");
            input = scanner.nextLine();
            System.out.printf("입력된 값 : %s \n", input);

        } while (!input.equals("q")); // 문자열을 다룰 때는 == / != 이 아닌 equals 사용해라 //대문자도 허용하고 싶다면 equalsIgnoreCase사용

        System.out.printf("정답입니다! q = %s ", input);
        scanner.close();
    }

}
