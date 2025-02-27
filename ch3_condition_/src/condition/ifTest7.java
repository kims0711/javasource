package condition;

import java.util.Scanner;

public class ifTest7 {
    public static void main(String[] args) {
       
 
    //   임의의 값 num1을 입력받기
    //   num1의 짝수/홀수 여부를 판별하여 출력하는 프로그램 
        
      Scanner scanner = new Scanner(System.in);
      System.out.println("정수를 입력하십시오: ");
      String input = scanner.nextLine();
      int num1 = Integer.parseInt(input);


    System.out.println("입력받은 값은 " + num1 + " 입니다");
    System.out.printf("입력받은 값은 %d 입니다\n",num1);
      
    if(num1%2==0){
        System.out.printf("%d은(는) 짝수입니다" ,num1);
      }else{
        System.out.printf("%d은(는) 홀수입니다" ,num1);
      }
      scanner.close();

    }
}
