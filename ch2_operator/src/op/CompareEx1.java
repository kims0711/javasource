package op;

public class CompareEx1{
    public static void main(String[] args) {
      // 비교연산자 : 결과가 true 혹은 false 로 출력
      //대소비교 : < , > , <= , >= 
      //등가비교 : == (equal) , != (not equal)

      // \t (tab)
      // %b (boolen 값 출력)
      // 두 변수의 타입이 다른 경우 타입을 맞춘 후 비교
        System.out.printf("10 == 10.0f\t %b\n", (10==10.0f));
        System.out.printf("'0' == 0\t %b\n", ('0'==0)); //(문자 0과 숫자 0의 비교) 문자 0은 48에 대응되기 때문에 false가 출력된 것
        System.out.printf("'A' == 65\t %b\n", ('A'==65)); //위와 같음
        System.out.printf("'A' > 'B' \t %b\n", ('A'>'B')); //같은 이유로 false
        System.out.printf("'A'+ 1 != 'B' \t %b\n", ('A'+1 != 'B')); //65+1 != 66 의 의미이기 때문에 false가 출력되는 것
    }
}