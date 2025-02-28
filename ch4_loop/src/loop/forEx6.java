package loop;

import java.util.Scanner;

// 반복문 : 반복적으로 실행해야 하는 코드를 간단하게 처리
// for , while, do~while 있음

public class forEx6 {
  public static void main(String[] args) {

    // 팩토리얼 구하기
    // 입력받은 숫자의 팩토리얼 구하기

    Scanner scanner = new Scanner(System.in);
    System.out.println("숫자(정수)를 입력하십시오 : ");
    String imput = scanner.nextLine();
    int num = Integer.parseInt(imput);

    int result = 1;
    for (int i = 1; i < num + 1; i++) {
      result *= i;
    }
    System.out.printf("%d 팩토리얼의 값은 = %d\n", num, result);
    scanner.close();
  }

}
