package thread;

public class AccountEx {
    public static void main(String[] args) {
        AccUser accUser = new AccUser(); // 인스턴스 만들고
        Thread t1 = new Thread(accUser); // 쓰레드 만들어서 넘김
        Thread t2 = new Thread(accUser); // 똑같은거 넘김

        t1.start();
        t2.start();
    }

}
