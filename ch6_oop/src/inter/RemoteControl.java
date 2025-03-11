package inter;

public interface RemoteControl {
    // 상수((public) final static), 추상 메서드((public) abstract), default, static 만 가능
    // 상수랑 추상메서드 기본적으로 public임
    int MAX_VOLUME = 10; // final static 안 붙여줘도 어차피 상수밖에 못 들어오니까 안 붙여도 됨
    int MIN_VOLUME = 0;

    // 상수와 같이 굳이 public abstract 안 붙여줘도 추상메서드임
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다");
        } else {
            System.out.println("무음 해제합니다");
        }
    }

    static void changeBattery() {
        System.out.println("건전지를 교체합니다");
    }
}
