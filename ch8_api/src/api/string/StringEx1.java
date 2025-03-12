package api.string;

import java.util.Arrays;

public class StringEx1 {
    public static void main(String[] args) {

        String str1 = new String("안녕하세요");
        String str4 = new String("안녕하세요");
        String str2 = "안녕"; // 이걸 더 많이 씀(누가봐도 간단하잖아)
        String str3 = "안녕";
        // str3는 기존의 str2 때문에 생긴 pool에 있는 "안녕"을 같이 지시함
        char[] charr = { 'h', 'e', 'l', 'l', 'o' };
        String str5 = new String(charr);
        System.out.println("str5 : " + str5);

        System.out.println(str1 == str4 ? "같음" : "다름"); // 새로 생성이니까 다름 출력됨
        System.out.println(str1 == str4); // 이렇게 출력해도 true or false로 출력되기는 함
        System.out.println(str2 == str3 ? "같음" : "다름"); // 재사용이라서 같음 출력됨
        System.out.println(str2 == str3);

        // 문자열 비교 : .equals()를 쓰자 (그냥 == 은 주소비교 되니까)
        System.out.println(str1.equals(str3) ? "같다" : "다르다");
        System.out.println(str1.equals(str4) ? "같다" : "다르다");

        // 빈 문자열 -> 무엇으로 초기화 할 것이냐
        str1 = "";
        System.out.println(str1.length()); // 0
        str2 = null;
        System.out.println(str2.length()); // NullPointerException

    }

}
