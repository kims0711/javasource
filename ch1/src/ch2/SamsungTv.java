package ch2;

public class SamsungTv implements Tv {
    @Override
    public void powerOn() {
        System.out.println("SamsungTv - 파워 On");
    }

    @Override
    public void powerOff() {
        System.out.println("SamsungTv - 파워 Off");
    }

    @Override
    public void volumeUp() {
        System.out.println("SamsungTv - volumeUp");
    }

    @Override
    public void volumeDown() {
        System.out.println("SamsungTv - volumeDown");
    }
}
