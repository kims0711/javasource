package poly;

public class Tire {
    int maxRotation; // 최대 회전수
    int acuumulateRotation; // 누적 회전수
    String location; // 타이어 위치

    public boolean roll() {
        ++acuumulateRotation;

        if (acuumulateRotation < maxRotation) {
            System.out.println(location + "Tire 수명" + (maxRotation + acuumulateRotation) + "회");
            return true;
        } else {
            System.out.println("****" + location + "Tire 펑크 ***");
            return false;
        }
    }

    public Tire(int maxRotation, String location) { // 생성자
        this.maxRotation = maxRotation;
        this.location = location;
    }
}
