package ch1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekEx {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now); // 오늘 날짜 나옴
        // Week.FRIDAY

        // 요일에 따라 특정 숫자를 반환해줌
        // 월(1)~~일(7)
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek.getValue()); // 2 출력됨

        Week today = null;

        // Week.SATURDAY
        switch (dayOfWeek.getValue()) {
            case 1:
                today = Week.MONDAY;
                break;
            case 2:
                today = Week.TUESDAY;
                break;

            case 3:
                today = Week.WEDNESDAY;
                break;

            case 4:
                today = Week.THURSDAY;
                break;

            case 5:
                today = Week.FRIDAY;
                break;

            case 6:
                today = Week.SATURDAY;
                break;
            case 7:
                today = Week.SUNDAY;
                break;

            default:
                break;
        }
        System.out.println("오늘은 " + today + " 입니다.");

        if (today == Week.SUNDAY) {
            System.out.println("게임을 한다");
        } else {
            System.out.println("공부를 한다");
        }
    }

}
