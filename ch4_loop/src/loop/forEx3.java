package loop;

// 반복문 : 반복적으로 실행해야 하는 코드를 간단하게 처리
// for , while, do~while 있음

public class forEx3 {
    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        // System.out.println(i);
        // }

        // 반복문 중단 : 강제 중단(break) or 조건이 false
        // 1) int =0; 초기화(한 번만 실행 됨)
        // 2) 조건검사 i < 5;
        // 3) 루프 안으로 진입 - "안녕"출력
        // 4) 증감연산자 실행 i++ (i=1)
        // 5) 조건검사
        // 6) 루프 안으로 다시 진입 - "안녕" 출력
        // 7) 증감연산자 실행되어 i=2가 되고 계속 반복 (i가 5가 되어 5<5 false가 될 때 까지)

        for (int i = 0; i < 11; i++) {
            System.out.print(i + "   "); // 0부터 시작이기 때문에 0~10 찍고 싶으면 i<11이다
        }
        System.out.println();

        // 1에서 10까지의 합 반복문으로 구하기

        int sum = 0; //sum을 for문 밖에서 출력하고 싶으니까 여기에서 선언하는 것
        for (int i = 0; i < 11; i++) {
            //sum = sum + i;
            sum += i; //복합대입연산자(위와 같음)
        }
        System.out.println(sum);


        // 1~100까지의 수 중에서 3의 배수만 더하기

        int sum3 = 0;
        for (int i = 0; i < 101; i++) {
            if(i % 3 == 0){
                System.out.print(i+"  ");
                sum3 += i;
            } 
        }
        System.out.println("sum3= " + sum3);
    }

}
