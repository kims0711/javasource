package loop;

public class forEx8 {
    public static void main(String[] args) {
        // 삼각형 별 찍기 (5개 까지)

        // *
        // **
        // ***
        // ****
        // *****

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
