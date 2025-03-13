package api.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d); // Thu Mar 13 13:03:00 KST 2025

        // yyyy: 년도 4자리로, yy: 년도 2자리로
        // MM: 월 2자리로,
        // dd: 일을 2자리로
        // hh: 시
        // mm: 분
        // ss: 초
        // a : AM / PM
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("원하는 형태로 날짜 보기 : " + sdf.format(d));

        sdf = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        System.out.println("원하는 형태로 날짜, 시간 보기 : " + sdf.format(d));

        sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss"); // AM / PM 도 출력
        System.out.println("원하는 형태로 날짜, 시간 보기 : " + sdf.format(d));

        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println("요일보기 : " + sdf.format(d));

    }
}
