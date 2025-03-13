package api.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // 2025-03-13T14:37:34.653189100

        LocalDate date = LocalDate.now();
        System.out.println(date); // 2025-03-13
        System.out.println("년도 : " + date.getYear()); // 년도만 가져오기
        System.out.println("월: " + date.getMonthValue()); // 월 가져오기
        System.out.println("일 : " + date.getDayOfMonth()); // 일 가져오기
        System.out.println("날짜 더하기 : " + date.plusDays(5)); // 더하기도 가능

        LocalTime time = LocalTime.now();
        System.out.println(time); // 14:39:34.477270700

        System.out.println("시 : " + time.getHour());
        System.out.println("분 : " + time.getMinute());
        System.out.println("초 : " + time.getSecond());
        System.out.println("5시간 더하기 : " + time.plusHours(5));
        System.out.println("2시간 빼기 : " + time.minusHours(2));

    }
}
