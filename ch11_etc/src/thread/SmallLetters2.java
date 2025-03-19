package thread;

public class SmallLetters2 extends Thread { // Thread클래스 상속

    public SmallLetters2() { // 생성자
        setName("SmallLetters2");
    }

    @Override
    public void run() { // BigLetters의 main과 함께 작동할 코드를 이곳 run에 작성
        // 소문자 출력
        for (char ch = 'a'; ch < 'z'; ch++) {
            System.out.print(ch + "\t");
        }
    }
}
