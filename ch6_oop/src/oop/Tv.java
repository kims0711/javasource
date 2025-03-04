package oop;

// TV 클래스를 이용하여 TV(인스턴스)를 생성
// 객체 구성요소
// 1. 속성(특성) => 멤버변수 (클래스 내에서 선언한 변수들)
// 2. 기능(동작) => 멤버메소드

public class Tv {
    // 크기(int), 색상(String), 보유채널(int), 볼륨(int)
    int size;
    String color;
    int channel;
    int volume;
    boolean power;

    // 채널변경, 볼륨조절, 전원 켜기/끄기
    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    void power() {
        power = !power; // 메소드 호출하면 실행되어 상태가 flase에서 true로 바뀜 (여기서 얘 호출하면 : false <-> true)
    }

    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                + power + "]";
    }

}
