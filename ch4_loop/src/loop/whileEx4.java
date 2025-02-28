package loop;

// 반복문 : 반복적으로 실행해야 하는 코드를 간단하게 처리
// for , while, do~while 있음

public class whileEx4 {
    public static void main(String[] args) {
        // 구구단 출력하기 (7단)
        // for (int i = 1; i < 10; i++) {
        // System.out.printf("7 * %d = %d\n", i, 7*i);
        // }

        int i = 1;
        while (i < 10) {
            System.out.printf("7 * %d = %d", i, 7 * i);
            i++;
        }

    }

}
