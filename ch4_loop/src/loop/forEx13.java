package loop;

public class forEx13 {
    public static void main(String[] args) {
        // 1~100 사이의 소수 구하기
        // 소수 : 1과 자기 자신만을 약수로 가지고 있는 수

        int cnt = 0;
        for (int i = 2; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                System.out.printf("%d \t", i);
            }
            cnt = 0;
        }

    }
}
