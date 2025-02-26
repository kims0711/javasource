package op;

public class ArthmeticEx3{
    public static void main(String[] args) {
        char c1 = 'a'; // char은 문자 하나 //정수는 int
        char c2 = c1;
        char c3 = ' ';
        //byte,short,char 연산 수행 시 연산의 결과가 int형으로 변경 됨
        //c3 = c1 + 1;

        //해결 방법1 (int로 받기)
        int result = c1 + 1; //정수 98이 출력 됨 (아스키코드: 문자가 약속된 숫자에 대응되기 때문(인코딩))
                            //A=65 a=97 두 개는 외우기
        
        //해결 방법2 (캐스팅 하기)
        c3 = (char)(c1 + 1);
        c2++; //c2= c2+1;
        c2++;

        int result2 = c2;  
        
        System.out.println("c1 = "+c1);
        System.out.println("result= "+result);
        System.out.println("c3= "+c3);
        System.out.println("c2= "+ c2);
        System.out.println("result2 = "+ result2);
    }
}