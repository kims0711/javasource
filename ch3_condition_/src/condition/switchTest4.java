package condition;

import java.util.Scanner;

public class switchTest4 {
    public static void main(String[] args) {
        // 가위(1)바위(2)보(3) 프로그램

        // 컴퓨터의 패를 하나 결정 (랜덤으로)
        int computer = (int) (Math.random() * 3) + 1; // 1~3 랜덤한 수 나오게 ifTest5 참조
        
        
        // 사용자의 패도 하나 결정 
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위(1) 바위(2) 보(3) 중에서 하나 입력 (숫자)");
        String input = scanner.nextLine();
        int user = Integer.parseInt(input);

        // 2(바위) - 1(가위) = 1 (컴퓨터)과 같이 빼기 연산으로 상황 구분하기
        int num = computer-user;

        // 이렇게 해도 되기는 하지만 더 간단하게 가능
        // switch(num){
        //     case 1 :
        //     System.out.println("패배하였습니다");
        //     break;
        //     case 0 :
        //     System.out.println("무승부입니다");
        //     break;
        //     case -1 :
        //     System.out.println("승리하였습니다");
        //     break;
        //     case 2 :
        //     System.out.println("승리하였습니다");
        //     break;
        //     case -2 :
        //     System.out.println("패배하였습니다");
        //     break;

        switch(num){  //이와 같이 케이스 여러가지 조건걸기 가능
            case 1 : case -2:
            System.out.println("패배하였습니다");
            break;
            case 0 :
            System.out.println("무승부입니다");
            break;
            case -1 : case 2:
            System.out.println("승리하였습니다");
            break;
           
        }
    }
    
}
