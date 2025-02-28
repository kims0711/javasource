package loop;

public class continueEx1 {
    public static void main(String[] args) {
        // continue : 반복문에서만 사용
        // 반복이 진행되는 도중에 continue문을 만나면 반복문의 끝으로 이동하여 다음 반복으로 넘어감
        // (continue 이후 해당 반복문 안의 나머지 부분 스킵하고 다음 반복으로)

        for (int i = 0; i < 11; i++) {
            if (i % 3 == 0)
                continue;
            System.out.println(i);
        }

        // 1~10 중에서 짝수만 출력
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0)
                continue;
            System.out.print(i + "  ");
        }
    }

}
