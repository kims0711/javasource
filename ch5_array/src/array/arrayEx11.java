package array;

import java.util.Arrays;

public class arrayEx11 {
    public static void main(String[] args) {

        int[] score = { 52, 32, 72, 19, 92, 86 };

        // 정렬 (오름, 내림) : 나중에는 특정 메소드 이용하면 되기는 함 (원래는 직접 하지 않지만 지금은 연습으로)

        // 버블정렬
        for (int i = 0; i < score.length - 1; i++) {
            for (int j = 0; j < score.length - 1 - i; j++) { // 뒷자리부터 정렬이 끝나기 때문에 score.length - 1 - i 만큼 빼주는 것
                if (score[j] > score[j + 1]) {
                    int temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(score));

    }

}
