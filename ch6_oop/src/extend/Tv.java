package extend;

// TV 클래스를 이용하여 TV(인스턴스)를 생성
// 객체 구성요소
// 1. 속성(특성) => 멤버변수 (클래스 내에서 선언한 변수들)
// 2. 기능(동작) => 멤버메소드

public class Tv {

    int channel;
    boolean power;

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    void power() {
        power = !power;
    }

    @Override
    public String toString() {
        return "Tv [channel=" + channel + ", power=" + power + "]";
    }

}
