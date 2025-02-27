package ch1;

public class ScopeEx1 {
    public static void main(String[] args) {
        // 변수의 유효범위 
        // {} 안에서 선언된 변수는 그 범위 밖에서는 사용이 불가능하다

        int a = 100;

        {
            int x =10; 
            System.out.println("x= "+ x);
            System.out.println("a= "+ a); // a는 가능 main 안에서 선언되었기 때문
        }
        //System.out.println("x= "+ x); // x라는 변수는 위 블럭 안에서 선언 되었기 때문에 블럭 밖에서는 사용 불가능

        if (a<200){
            int sum = 0;
        }
        //System.out.println(sum); //얘도 당연히 ㅂㄱㄴ

        for (int i = 0; i < args.length; i++) {
            
        }
        //System.out.println(i);  i또한 for문 안에서만 쓰이는 변수이다


       
    }
    
}
