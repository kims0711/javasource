package loop;

// 반복문 : 반복적으로 실행해야 하는 코드를 간단하게 처리
// for , while, do~while 있음

public class whileEx2 {
    public static void main(String[] args) {

        // for (int i = 0; i < 11; i++) {
        // System.out.println(i); // 0부터 시작이기 때문에 0~10 찍고 싶으면 i<11이다
        // }

        // 그냥 일자로 칸 띄워서 찍기 (print=줄바꿈 없음)
        // for (int i = 0; i < 11; i++) {
        // System.out.print(i + " ");
        // }
        int i = 1;
        while (i < 11) {
            System.out.print(i + "   ");
            i++;
        }

        System.out.printf("\n"); // 줄바꿈

        // 10~1 역순으로 찍기
        // for (int i = 10; i > 0; i--) {
        // System.out.print(i + " ");
        // }
        int k = 10;
        while (k > 0) {
            System.out.print(k + "   ");
            k--;
        }

        System.out.printf("\n"); // 줄바꿈

        // 짝수만 출력 1~10
        // for (int i = 0; i < 11; i++) {
        // if (i % 2 == 0) {
        // System.out.print(i + " ");
        // }
        // }
        System.out.println(); // 줄바꿈

        // 짝수만 출력 1~10 다른 방식
        // for (int i = 0; i < 11; i+=2) { // i+= : 복합대입연산자 (i = i+2)
        // System.out.print(i + " ");
        // }
    }

}
