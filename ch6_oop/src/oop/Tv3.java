package oop;

// TV 클래스를 이용하여 TV(인스턴스)를 생성
// 객체 구성요소
// 1. 속성(특성) => 멤버변수 (클래스 내에서 선언한 변수들)
// 2. 기능(동작) => 멤버메소드

public class Tv3 {
    // private : 외부 클래스에서 접근 불가 : 멤버변수에 붙이기
    // <-->
    // public : 접근 제한 없음 (private의 반대) : 생성자, 메서드에 붙이기
    private int size;
    private String color;
    private int channel;
    private int volume;
    private boolean power;

    // 초기화를 위해 생성자를 제공해야함
    public Tv3() {
    } // default 생성자 //

    public Tv3(int size, String color) {
        this.size = size;
        this.color = color;
    }

    // < setter, getter >
    // setter: 인스턴스 변수 값 변경할 때
    // getter: 인스턴스 변수 사용할 때 getter로 가져오기

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    // 채널변경, 볼륨조절, 전원 켜기/끄기
    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                + power + "]";
    }

}
