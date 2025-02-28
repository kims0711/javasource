package loop;

public class forEx12 {
    public static void main(String[] args) {
        // 4x + 5y = 60 에 해당하는 두 근의 값 x, y 각각 구해내기
        // 이때 x, y는 10 이하의 자연수

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if ((4 * x) + (5 * y) == 60) {
                    System.out.printf("(%d , %d)\n", x, y);
                }

            }
        }

    }
}
