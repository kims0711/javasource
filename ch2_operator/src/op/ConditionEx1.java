package op;

import java.util.Scanner;

public class ConditionEx1 {
    public static void main(String[] args) {
     //삼항연산자 : 조건 ? 참일때 : 거짓일때 ;

     int x, y, z;
     x=10;
     y=5;
     z=0;

     //x의 값이 음수일 때 양수로 만들기 
     int result = x >= 0 ? x : -x;
     System.out.println("x = "+result);
     System.out.println(x>=0? x : -x);

     //y의 값이 0보다 크면 'A' 아니면 'B'
     char ch = y > 0 ? 'A' : 'B';
     System.out.println("y = "+ch);

     //z의 값이 0보다 크면 "A" 아니면 "B"
     String str = z > 0 ? "A" : "B";
     System.out.println("z = " + str);

    }
}
