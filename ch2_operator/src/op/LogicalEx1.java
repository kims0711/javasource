package op;

public class LogicalEx1{
    public static void main(String[] args) {
      //논리연산자 : 비교연산자 여러개 연결 => 비교연산자와 같이 true/false로 결과 출력됨
      // x가 4보다 작거나 10보다 크다
      // &&(and), ||(or), !(not)
      //true && true => true (둘 다)
      //true || flase => true (둘 중 하나만)
      //!true => false
      //!false => true
    
      // x는 10보다 크고 20보다 작다
      // x>10 && x<20
      
      // y는 2의 배수 또는 3의 배수이다
      // y % 2 == 0 || y % 3 == 0

      // y는 2의 배수 또는 3의 배수이지만 6의 배수는 아니다
      // (y % 2 == 0 || y % 3 == 0) && y % 6 !=0
      // 순서 혼용되지 않게 괄호 잘 사용하기 

      int x = 0;
      char ch = ' ';
     
      x = 15;
      // x는 10보다 크고 20보다 작다
      System.out.printf("x=%2d, 10 < x && x < 20 = %b", x, 10< x && x < 20);
      
      x = 6;
      //y는 2의 배수 또는 3의 배수이지만 6의 배수는 아니다
      System.out.printf("x=%2d, x %%  2 ==0 || x %% 3==0 && x %% 6 !=0 %b\n", x, (x % 2 ==0 || x%3==0)&& x%6!=0);
      
      ch = 1;
      // '0' ~ '9' : 사이 숫자인지 확인
      System.out.printf("ch=%c, '0' <=ch && ch<='9' = &b\n",ch, '0'<= ch && ch <='9');
      
      ch = 'a';
      // 소문자인지 확인
      System.out.printf("ch=%c, 'a' <=ch && ch<='z' = &b\n",ch, 'a'<= ch && ch <='z');
      
      ch = 'A';
      // 대문자인지 확인
      System.out.printf("ch=%c, 'A' <=ch && ch<='Z' = &b\n",ch, 'A'<= ch && ch <='Z');

      ch = 'q';
      // 소문자 q 이거나 대문자 Q 인지 
      System.out.printf("ch=%c, 'q' ==ch && ch=='Q' = &b\n",ch, ch=='q' || ch =='Q');
      
      System.out.printf("ch=%c, 'q' ==ch && ch=='Q' = &b\n",ch, !(ch=='q' || ch =='Q'));

      //&nd가 뭔지 궁금해서
      // System.out.printf("테스트%d\n",123);
      // System.out.printf("테스트%5d\n",123);
      // System.out.printf("테스트%10d\n",123);
    }
}