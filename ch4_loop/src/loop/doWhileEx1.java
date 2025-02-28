package loop;

import java.util.Scanner;

public class doWhileEx1 {
    public static void main(String[] args) {
        // 컴퓨터가 1~100 사이의 임의의 수 생성 / 생성된 수 맞추기
        // 1~100 사이의 임의의 숫자 하나 입력 하여 맞추기

        Scanner scanner = new Scanner(System.in);

        int computer = (int) (Math.random() * 100) + 1; // ifTest5 참조
        int input = 0;

        int i = 0; // 당연히 밖에서 선언해야 함
        do {// 먼저 실행 후 나중에 조건검사 (조건이 맞지 않아도 무조건 한 번은 실행)
            System.out.println("1~100 사이의 정수를 하나 입력하십시오");
            input = scanner.nextInt();
            if (computer < input) {
                System.out.println("입력값이 더 큽니다! 더 작은 수를 입력해주세요");
            } else {
                System.out.println("입력값이 더 작습니다! 더 큰 수를 입력해주세요");
            }

        } while (input != computer);

        System.out.printf("%d = %d 정답입니다! \n", input, computer);
        scanner.close();
    }

}
