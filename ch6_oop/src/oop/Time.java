package oop;

public class Time {
    // 속성 : 시, 분, 초

    private int hour;
    private int minute;
    private float second;

    // setters, getters
    public int getHour() {

        return hour;
    }

    public void setHour(int hour) {
        if (hour > 23 || hour < 0) {
            return; // 조건 안 맞으면 여기서 끝낸다는 뜻
        }
        this.hour = hour;

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute > 59 || minute < 0) {
            return;
        }
        this.minute = minute;
    }

    public float getSecond() {
        return second;
    }

    public void setSecond(float second) {
        if (minute > 59.99f || minute < 0.0f) {
            return;
        }
        this.second = second;
    }

}
