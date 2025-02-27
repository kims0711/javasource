package loop;

// 반복문 : 반복적으로 실행해야 하는 코드를 간단하게 처리
// for , while, do~while 있음

public class forEx5 {
    public static void main(String[] args) {
      // 1) 3의 배수의 총합
      int sum1 = 0;
      for (int i = 0; i < 101; i++) {
        if(i % 3 ==0){
            sum1 += i;
        }
      }
      System.out.println("1~100 중 3의 배수의 총합 = " + sum1);


      // 2) 9의 배수를 제외한 3의 배수의 총합
      int sum2 = 0; //아니면 sum1=0; 으로 다시 써도 됨
      for (int i = 0; i < 101; i++) {
        if(i % 3 ==0 && i % 9 != 0){
            sum2 += i;
        }
      }
      System.out.println("1~100 중 9의 배수를 제외한 3의 배수의 총합 = " + sum2);


      // 3) 3의 배수와 5의 배수의 총합
      int sum3 = 0;
      for (int i = 0; i < 101; i++) {
        if(i % 3 ==0 || i % 5 ==0){
            sum3 += i ;
        }
      }
      System.out.println("1~100 중 3의 배수와 5의 배수의 총합 = " + sum3);

      //그냥 검산
    //   int sum4 = 0;
    //   for (int i = 0; i < 101; i++) {
    //     if(i % 5 == 0){
    //         sum4 +=i;
    //     }
    //   }
    //   System.out.println(sum4);

    //   int sum5 = 0;
    //   for (int i = 0; i < 101; i++) {
    //     if(i % 5 == 0 && i % 3 == 0){
    //         sum5 +=i;
    //     }
    //   }
    //   System.out.println(sum5);
    }

}
