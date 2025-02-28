package loop;

// 반복문 : 반복적으로 실행해야 하는 코드를 간단하게 처리
// for , while, do~while 있음

public class forEx2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // 반복문 중단 : 강제 중단(break) or 조건이 false
        // 1) int =0; 초기화(한 번만 실행 됨)
        // 2) 조건검사 i < 5;
        // 3) 루프 안으로 진입 - "안녕"출력
        // 4) 증감연산자 실행 i++ (i=1)
        // 5) 조건검사
        // 6) 루프 안으로 다시 진입 - "안녕" 출력
        // 7) 증감연산자 실행되어 i=2가 되고 계속 반복 (i가 5가 되어 5<5 false가 될 때 까지)

        for (int i = 0; i < 11; i++) {
            System.out.println(i); // 0부터 시작이기 때문에 0~10 찍고 싶으면 i<11이다
        }

        // 그냥 일자로 칸 띄워서 찍기 (print=줄바꿈 없음)
        for (int i = 0; i < 11; i++) {
            System.out.print(i + "   ");
        }

        System.out.printf("\n"); // 줄바꿈

        // 10~1 역순으로 찍기
        for (int i = 10; i > 0; i--) {
            System.out.print(i + "   ");
        }

        System.out.printf("\n"); // 줄바꿈

        // 짝수만 출력 1~10
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "   ");
            }
        }
        System.out.println(); // 줄바꿈

        // 짝수만 출력 1~10 다른 방식
        for (int i = 0; i < 11; i += 2) { // i+= : 복합대입연산자 (i = i+2)
            System.out.print(i + "   ");
        }

        int j = 0;
        for (; j < args.length; j++) {

        } // for문도 while문과 같이 변수를 밖에서 선언해도 되기는 함. 다만 for조건문 안에 ;은 남겨야 함

        j = 0;
        for (int k = 0, q = 1; j < args.length; j++) { // 이처럼 여러개도 선언 가능
        }

        for (;;) {
            // 얘도 가능은 하나 무한루프이기 때문에 멈추는 코드는 필요
        }

    }

}
