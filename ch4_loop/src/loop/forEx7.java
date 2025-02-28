package loop;

public class forEx7 {
    public static void main(String[] args) {
        // 중첩 for

        // for (int i = 0; i < 10; i++) {
        // System.out.print("* ");

        // }

        // EX 1)
        for (int i = 0; i < 5; i++) { // 이 파란색 블럭 안에 있는 반복문을 5회 반복한다는 뜻
            for (int j = 0; j < 10; j++) {
                System.out.print("*  ");
            }
            System.out.println(); // 줄바꿈
        }

        System.out.println();

        // EX 2)
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(j + "\t");
            }
            System.out.println(); // 줄바꿈
        }

    }

}
