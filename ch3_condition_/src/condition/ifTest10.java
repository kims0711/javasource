package condition;

import java.util.Scanner;

public class ifTest10 {
  public static void main(String[] args) {
       
//숫자를 세 개 입력 받고 입력받은 수 중에서 가장 큰 수와 가장 작은 수를 출력

    Scanner scanner = new Scanner(System.in);
    System.out.println("첫번째 수 입력");
    String input = scanner.nextLine();
    int num1 = Integer.parseInt(input);

    System.out.println("두번째 수 입력");
    input = scanner.nextLine();
    int num2 = Integer.parseInt(input);

    System.out.println("세번째 수 입력");
    input = scanner.nextLine();
    int num3 = Integer.parseInt(input);

    // int max = 0, min = 0;

    // if(num1>num2 && num1>num3 ){
    //   max = num1; min = num3;
    //     if(num3>num2){
    //       min = num2;
    //     }
    // }if(num2>num3 && num2>num1 && num1>num3){
    //   max = num2; min = num3;
    //     if(num3>num1){
    //       min = num1;
    //     }
    // }if(num3>num2 && num3>num1 && num1>num2){
    //   max = num3; min = num2;
    //     if(num2>num1){
    //       min = num1;
    //     }
    // }
    // System.out.printf("가장 큰 수는 %d이고 가장 작은 수는 %d입니다\n", max, min);

    int min = num1;
    
    if(min > num2){
      min = num2;
    }
    if(min > num3){
      min = num3;
    }
    

    int max = num1;
    
    if(max < num2){
      max = num2;
    }
    if(max < num3){
      max = num3;
    }

    System.out.printf("최대는 %d 최소는 %d\n", max, min); 
    
    }

  }

