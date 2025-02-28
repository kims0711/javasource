package loop;

public class breakEx2 {
    public static void main(String[] args) {
        // 주사위 눈이 6이 나올 때 까지 굴리기

        int num = 0;
        int cnt = 0;
        while (true) {
            num = (int) (Math.random() * 6) + 1;
            System.out.printf("주사위 : %d \n", num);

            if (num != 6) {
                cnt++;
            } else {
                cnt++;
                break;
            }
        }
        System.out.printf("6이 나올 때 까지 %d회 걸렸음\n", cnt);
    }
}
