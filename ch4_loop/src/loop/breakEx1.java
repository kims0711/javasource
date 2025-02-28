package loop;

public class breakEx1 {
    public static void main(String[] args) {
        // break : switch, 반복문 중지에 사용했었음 (break가 포함된 가장 가까운 반복문 탈출)

        int sum = 0, i = 0;

        while (true) { // 무한루프
            // if : 실행할 구문이 하나인 경우 {} 생략 가능하다 (그래도 쓰자)
            // sum >100이 되면 멈추고 싶음

            if (sum > 100) {
                break;
            }

            i++;
            sum += i;
        }

        System.out.printf("i = %d , sum = %d\n", i, sum);

    }

}
