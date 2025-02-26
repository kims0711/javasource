package op;

public class CompareEx2{
    public static void main(String[] args) {
      // 비교연산자 : 결과가 true 혹은 false 로 출력
      //대소비교 : < , > , <= , >= 
      //등가비교 : == (equal) , != (not equal)
      float f1 = 0.1f;
      double d1 = 0.1;
      double d2 = (double)f1;

      //19.17f : 19자리로 표현하되 소수점 17자리까지 나오게 하라 

      System.out.printf("10.0 == 10.0f %b\n", 10.0 == 10.f); //ture
      System.out.printf("0.1 == 0.1f %b\n", 0.1 == 0.1f); // false -> 타입을 변환시켜도 f1 값 그대로 저장되기  때문
      System.out.printf("f1 = %19.17f\n", f1); //0.10000000149011612
      System.out.printf("d1 = %19.17f\n", d1); //0.10000000000000000
      System.out.printf("d2 = %19.17f\n", d2); //0.10000000149011612
      System.out.printf("f1 == d1 %b\n", f1==d1);
      System.out.printf("d1 == d2 %b\n", d1==d1);
      System.out.printf("d2 == f1 %b\n", d2==f1);
      System.out.printf("(float)d1 == f1 %b\n",(float)d1==f1); //얘는 반대로 float를 변환시키기 때문에 true 출력됨

      //따라서 자바에서 보통 실수를 계산할때 double을 사용하는 편이 안전함 
 
    }
}