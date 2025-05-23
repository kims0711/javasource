package inter;

public class Television implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다");

    }

    @Override
    public void turnOff() {
        System.out.println("Tv를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.setVolume(RemoteControl.MAX_VOLUME);
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.setVolume(RemoteControl.MIN_VOLUME);
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Tv 볼륨 : " + this.volume);
    }

}
