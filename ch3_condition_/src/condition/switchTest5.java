package condition;

import java.util.Scanner;

public class switchTest5 {
    public static void main(String[] args) {
        //점수 입력받아서 등급 출력하는 프로그램

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하십시오 (0~100)");
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);

        
        switch(score/10){  //score을 10으로 나눠버려서 int로 캐스팅해봄 // but 어차피 나눗셈은 몫만 가져오기 때문에 int 캐스팅 할 필요 없었음
            case 10: case 9:
            System.out.println("A등급 입니다");
            break; 
            case 8:
            System.out.println("B등급 입니다");
            break; 
            case 7:
            System.out.println("C등급 입니다");
            break; 
            default:
            System.out.println("F등급 입니다");
            break;
        }
      
    }
    
}
