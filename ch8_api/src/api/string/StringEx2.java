package api.string;

import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {
        String str = "안녕하세요";

        // 문자열 길이
        System.out.println("문자열 길이 " + str.length());
        System.out.println("지정된 위치에 있는 문자 반환 : " + str.charAt(3));
        // n+1번째 글자 뭔지 출력 : 세
        for (int i = 0; i < str.length(); i++) {
            System.out.printf("%d : %s\n", i, str.charAt(i));
        }

        // char 배열로 변환 ['안','녕'~~]
        // 기존에 알던 방법으로
        char charArr[] = new char[str.length()];
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = str.charAt(i);
        }
        System.out.println("charArr : " + Arrays.toString(charArr));
        System.out.println(charArr);

        // String => char 배열 (메소드 이용) .찍고 필요한 메소드 있는지 찾아보자
        char[] result = str.toCharArray();

        // indexOf : 주어진 문자가 특정 문자열에 존재하는지의 여부를 따지는 메소드
        // > 0: 있음
        // > -1: 없음
        System.out.println("주어진 문자가 문자열에 존재하는지의 여부 : " + str.indexOf("안"));
        System.out.println("주어진 문자가 문자열에 존재하는지의 여부 : " + str.indexOf("주"));

        String subject = "자바의 정석"; // 자바 문자가 있으면 자바와 관련 있는 책입니다. / 아니면 자바와 관련없는 책입니다 출력하기

        System.out.println(subject.indexOf("자바"));

        if (subject.indexOf("자바") >= 0) {
            System.out.println("자바와 관련 있는 책입니다");
        } else {
            System.out.println("자바와 관련 없는 책입니다");
        }

        // contains 가 indexOf 보다 편하겠지 (true false 로 내보내주니까)
        System.out.println("주어진 문자가 문자열에 존재하는지의 여부 : " + str.contains("안"));

        if (subject.contains("자바")) {
            System.out.println("자바와 관련 있는 책입니다");
        } else {
            System.out.println("자바와 관련 없는 책입니다");
        }
        // 찾기 시작하는 위치 지정 가능
        System.out.println("찾는 시작위치 지정 " + str.indexOf("하", 4));
        System.out.println("문자열의 오른쪽 끝부터 찾기 " + str.lastIndexOf("하"));
        String str2 = "java.lang.String";
        System.out.println(str2.indexOf(".")); // 4
        System.out.println(str2.indexOf(".", 5)); // 9
        System.out.println(str2.lastIndexOf(".")); // 9 (찾는건 오른쪽부터 찾아도 index넘버는 왼쪽 기준이니까)
    }
}
