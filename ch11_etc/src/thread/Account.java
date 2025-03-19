package thread;

public class Account {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    // 1) 메서드 앞에 synchronized 선언하는 방법 (동기화 메소드)
    // public synchronized void withdraw(int money) { // synchronized 동기화
    // if (balance >= money) {
    // try {
    // Thread.sleep(1000);
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    // balance -= money;
    // }
    // }

    // 2) 동기화 블럭으로 잡아서 동기화 하는 방법 (동기화 블럭)
    public void withdraw(int money) { // synchronized 동기화
        synchronized (this) {

            if (balance >= money) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance -= money;
            }
        }
    }
}
