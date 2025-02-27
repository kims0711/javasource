package condition;

import java.util.Scanner;

public class ifTest9 {
  public static void main(String[] args) {
       
     // 윤년, 평년 구하기
     // 년도를 입력받고 입력받은 년도가 윤년인지 평년인지
    // * 윤년조건1 : 년도 % 4 == 0 이고 년도 % 100 !=0
    // * 윤년조건2 : 윤년 % 400 == 0

    Scanner scanner = new Scanner(System.in);
    System.out.println("년도를 입력하십시오");
    String input = scanner.nextLine();
    int year = Integer.parseInt(input);

    if((year % 4==0 && year % 100!=0) || year % 400==0){
      System.out.printf("%d년은 윤년입니다\n",year);
     }else{
      System.out.printf("%d년은 평년입니다\n", year);
    
    }
     
    }
   
  }

