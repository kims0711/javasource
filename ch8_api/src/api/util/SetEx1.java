package api.util;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("사과");
        set1.add("바나나");
        set1.add("망고");
        set1.add("귤");
        set1.add("딸기");
        set1.add("포도");
        set1.add("사과");

        System.out.println(set1); // 마지막의 중복 "사과"는 출력 안 됨 -> set은 중복 불가능
        // [포도, 망고, 귤, 사과, 바나나, 딸기] 그리고 왼쪽처럼 순서는 무작위로 나옴

        String str1 = "사과";
        String str2 = "사과";
        String str3 = new String("사과");
        System.out.println("str1.hashCode() " + str1.hashCode());
        System.out.println("str2.hashCode() " + str2.hashCode());
        System.out.println("str3.hashCode() " + str3.hashCode());

    }
}
