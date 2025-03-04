package array;

import java.util.Arrays;

public class arrayEx10 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        // ball에 1~45 숫자 담기
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        // 1~6번째 수를 각각 차례대로 무작위 수와 교환
        for (int i = 0; i < 6; i++) {
            // 0~44 무작위 수
            int pos = (int) (Math.random() * 45);
            // 교환
            int temp = ball[i];
            ball[i] = ball[pos];
            ball[pos] = temp;
        }
        System.out.println(Arrays.toString(ball));
    }

}
