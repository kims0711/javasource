package condition;

import java.util.Scanner;

public class ifTest8 {
  public static void main(String[] args) {
       
      // 급여 계산기

      int rate = 9800;  // 시급
      int pay, hours; 

      //사용자로부터 근무시간을 입력 받아서 hours에 저장하고 
      //근무시간이 8시간 까지는 기본시급 지금
      //8시간 초과 근무시에는 시간당 임금의 1.5배
      //임금 계산 후에 pay 변수에 담기

      //최종 출력은 "받는 임금은 ~~입니다"
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("근무시간을 입력하십시오");
      // String input = scanner.nextLine();
      // hours = Integer.parseInt(input);
      
      int input = scanner.nextInt();
      hours = input;

    

      if(hours<=8){
        pay = hours * rate;
        System.out.printf("급여는 %d원 입니다",pay);
      }else if(hours>8){
        pay = 8*rate + (hours-8)*(int)(rate*1.5);  //1.5곱해서 실수가 되었기 때문에 정수로 캐스팅 해주어야 함
        System.out.printf("급여는 %d원 입니다",pay);
        }       
      }
    }

