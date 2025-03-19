package thread;

public class BigLetters {
    public static void main(String[] args) {

        // 2) 방법 : Thread t1 = new Thread(new SmallLetters()); ->Runnable 사용할 때

        // 익명구현객체
        // - 인터페이스, 추상클래스 : 구현객체를 무조건 생성한 후 사용
        // - 한 번만 사용한다면 익명구현객체를 이용한다. 아래처럼 SmallLetters 따로 만들지 않고 익명구현객체 만들기
        Thread t3 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (char ch = 'a'; ch < 'z'; ch++) {
                    System.out.print(ch + "\t");
                }
            }
        });
        t3.start();

        // 람다식 이용하여 나타내기
        Runnable r = () -> {
            for (char ch = 'a'; ch < 'z'; ch++) {
                System.out.print(ch + "\t");
            }
        };
        Thread t4 = new Thread(r);

        // Thread t4 = () -> {} : 람다식 구조

        Thread t1 = new SmallLetters2(); // 1) 방법 : Thread 클래스 이용 (상속개념 이용하여 SmallLetters2 접근)
        System.out.println("쓰레드 t1 name : " + t1.getName()); // 현재 실행중인 쓰레드 이름도 출력하기 *

        t1.start(); // 대기
        // 스케줄러가 조정하여 여러 쓰레드를 실행시킴
        Thread t2 = new NumPrint();
        System.out.println("쓰레드 t2 name : " + t2.getName()); // * =
        t2.start();

        // main 쓰레드명
        Thread mainThread = Thread.currentThread();
        System.out.println("쓰레드 main name : " + mainThread.getName());// * =
        // 대문자 출력
        for (char ch = 'A'; ch < 'Z'; ch++) {
            System.out.print(ch + "\t");
        }
    }
}
