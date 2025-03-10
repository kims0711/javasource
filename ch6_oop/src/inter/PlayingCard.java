package inter;

public interface PlayingCard {
    // 멤버변수 가질 수 없음
    // boolean pause;

    // 상수의 형태로만 가질 수 있음
    public static final int SPADE = 4; // (상수는 주로 대문자로 선언함~)
    // public static final 생략 가능
    int CLOVER = 1;
    // 일반메서드 가질 수 없음
    // void pause(){}

    // public abstrict 생략 가능
    void pause(); // 추상 메서드만 가질 수 있음 (중괄호 가지면 안 됨)

    // static, default 가 붙는다면 일반메소드도 허용
    static void display() {
    }

    default void print() {
    }
}
