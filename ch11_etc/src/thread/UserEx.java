package thread;

public class UserEx {
    public static void main(String[] args) {
        // User1, User2
        Calc calc = new Calc(); // calc를 하나만 생성하여 thread1,2에 각각 넣어줌
        // thread1,2가 calc에 동일하게 접근중,
        Thread thread1 = new User1(calc);
        Thread thread2 = new User2(calc);

        thread1.start();
        thread2.start();

    }
}
