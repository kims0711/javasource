package array;

public class arrayEx8 {
    public static void main(String[] args) {
        // 배열에 저장된 값 중에서 최대값과 최소값을 구하기

        int[] score = { 21, 32, 52, 73, 81, 97 };

        int max = score[0], min = score[0];

        for (int i = 1; i < score.length; i++) { // int i = 0 부터 해도 상관은 없지만 중복 비교이니 굳이 (그래서 1부터)
            if (max < score[i]) {
                max = score[i];
            } else if (min > score[i]) {
                min = score[i];
            }
        }

        System.out.printf("max 값 = %d / min 값 = %d\n", max, min);
    }

}
