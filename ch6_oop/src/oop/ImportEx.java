package oop;

// import 구문 
// 구조 : import 패키지(java.util). 클래스(Scanner)
import java.text.SimpleDateFormat; // 얘도 마찬가지로 생김
import java.util.Date; // Date (util) 치니까 생겼음
import java.util.Scanner; //import 패키지(java.util). 클래스(Scanner)
import static java.lang.Math.*; // import 구문 자체를 static 으로 끌어올림 (Math클래스의 구문이 전부 static이기에 가능)

//==========예외===========
// import 구문 사용하지 않는 패키지가 있음 (자동으로 import 처리 해줌) 
// : java.lang * 

import extend.Parent; // 밑에 Parent parent = new Parent(); 치니까 생겼음

// 다른 패키지의 클래스 사용할 때 옴

public class ImportEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parent parent = new Parent();

        Date date = new Date();
        System.out.println(date); // Fri Mar 07 16:41:01 KST 2025

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // mm 소문자는 분이고 MM 대문자는 월
        System.out.println("오늘 날짜는 : " + sdf.format(date));

        // ==========예외===========
        // Math : static 메소드로 선언됨
        // System.out.println("더 작은 값은 : " + Math.min(15, 20)); // 얘는 import 구문 안 생김
        // why? : java.lang 이라서

        // 위에 import static java.lang.Math.*; 코드 덕분에 Math 생략 가능
        System.out.println(min(15, 18));
        // System.out.println(Math.random());
        System.out.println(random());
        String str; // 얘도 클래스인데 java.lang 소속이라서 import 안 생긴다

    }

}
