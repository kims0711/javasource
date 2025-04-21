package ch2;

// LgTv에 선언된 멤버 변수 초기화
// 1 - 생성자
// 2 - setter
public class LgTv implements Tv {

    private Speaker speaker; // 객체이기 때문에 초기값 null
    // 따라서 밑에 null값에 . 찍고 접근해서 오류 생긴 것 ∴ 초기화를 해야 함

    public LgTv(Speaker speaker) {
        this.speaker = speaker;
    }

    public LgTv() {
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void powerOn() {
        System.out.println("LgTv - 전원 On");

    }

    @Override
    public void powerOff() {
        System.out.println("LgTv - 전원 Off");
    }

    @Override
    public void volumeUp() {
        // System.out.println("LgTv - 볼륨 Up");
        speaker.volumeUp();
    }

    @Override
    public void volumeDown() {
        // System.out.println("LgTv - 볼륨 Down");
        speaker.volumeDown();
    }

}
