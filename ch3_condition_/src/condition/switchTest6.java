package condition;

import java.util.Scanner;

public class switchTest6 {
    public static void main(String[] args) {
        // 연산자, 피연산자 입력받은 후에 계산하여 결과 출력
        // 산술연산자 + - / * % 다섯가지
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자(정수)를 입력해주세요");
        String input1 = scanner.nextLine();
        int num1 = Integer.parseInt(input1);

        System.out.println("연산자를 선택하여 입력해주세요 (+, -, *, /, %)");
        String op = scanner.nextLine();

        System.out.println("두번째 숫자(정수)를 입력해주세요");
        int num2 = scanner.nextInt();

        //아래처럼 해도 되지만 출력문 중복되니까 더 간결하게 가능함
        // switch (op) {
        // case "+":
        // System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        // break;
        // case "-":
        // System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        // break;
        // case "*":
        // System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
        // break;
        // case "/":
        // System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
        // break;
        // case "%":
        // System.out.printf("%d % %d = %d\n", num1, num2, num1 % num2);
        // break;
        // default:
        // System.out.println("입력 값을 확인해주세요");
        int result=0;
        
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("입력 값을 확인해주세요");
                System.exit(result); //프로그램 종료 얘가 있어야 이상한 값 입력되었을 때 최종 출력이 나오지 않고 위에서 끝남
                break; // 디폴트의 break은 굳이 필요 없다
        }
        System.out.printf("%d %s %d = %d", num1, op, num2, result);
        scanner.close();

    }

}
