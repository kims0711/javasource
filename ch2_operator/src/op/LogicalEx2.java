package op;

import java.util.Scanner;

public class LogicalEx2{
    public static void main(String[] args) {
      //사용자로부터 문자를 입력받은 후 그 문자가 숫자인지 영문자인지 판별하는 프로그램
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("문자를 하나 입력하시오");

      String input = scanner.nextLine();
      char ch = input.charAt(0); //index:0 의 뜻은 입력한 문자열 중에서 첫번째 글자를 가져온다는 것 (1은 두번째~~~)
      //charAt(index) : 문자열을 문자로 분해해서 돌려받기
      //index는 0부터 시작
      System.out.println("ch값은 = " + ch); //ch가 뭔지 확인 해보기
      
      if('0'<= ch && ch <='9'){ //if 문에서 조건문이 true라면 아래 코드 실행됨
        System.out.println("입력하신 문자는 숫자입니다.");
      }

      if(('a'<=ch && ch <='z') ||('A'<=ch && ch<='Z')){
        System.out.println("입력하신 문자는 영문자입니다.");
      }
      scanner.close();
 
    }
}