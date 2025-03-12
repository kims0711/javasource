package api.string;

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {

        String str = "Hello";
        // 문자열 연결 : +
        str += "World";

        System.out.println(str);

        // concat() : 문자열을 뒤에 붙인다. (근데 +가 더 편하긴 한 듯?)
        String str2 = "안녕";
        str2 = str2.concat("하세요요요");
        System.out.println(str2);

        // endsWith(), startWith()
        System.out.println("지정된 문자열로 종료 여부" + str2.endsWith("요"));
        System.out.println("지정된 문자열로 시작 여부" + str2.startsWith("안"));

        // 예제 1 (if문 이용)
        String file = "test.txt";
        // 이미지 : png or gif or jpg

        if (file.endsWith("g") || file.endsWith("f")) {
            System.out.println("이미지 파일입니다");
        } else {
            System.out.println("이미지 파일이 아닙니다");
        }
        // 예제 2 (삼항연산자로 그냥 해봄)
        System.out.println(file.endsWith("g") || file.endsWith("f") ? "이미지파일임" : "이미지파일이 아님");

        // replace(), replaceAll(), replaceFirst()
        // 원본은 변경 불가 -> 새로운 문자열로 반환하는 것
        System.out.println("replace()(old,new) : " + str.replace("Hello", "안녕하세요"));
        System.out.println(str); // 여기서는 helloworld 출력됨
        // 일시적으로 바뀔 뿐 값 자체를 바꾸지는 않음

        // 원본 변경 방법
        str = str.replace("Hello", "안녕");
        System.out.println(str);

        // replaceAll() : 정규식 사용이 가능
        System.out.println(str.replaceAll("[a-z]", "1")); // 알파벳 소문자 전부 1로 바꿈
        // regex의 대괄호 안에 있는 조건에 맞는 것들을 replacement로 바꿈

        // replaceFirst() :
        str2 = "Hellollo";
        System.out.println(str2.replaceFirst("ll", "LL"));
        // regex에 있는 조건에 맞는 것들 중에서 처음 것을 replacement로 바꿈

        // substring()
        str2 = "java.lang.Object";
        System.out.println("특정 위치의 문자열 얻기 : " + str2.substring(10)); // Object
        // : 10번 index 이후의 문자열만 출력
        System.out.println("특정 위치의 문자열 얻기 : " + str2.substring(10, 12)); // Ob
        // : 시작과 끝 index 모두 설정 가능 (11,12 출력됨)

        // split()
        str2 = "dog,cat,bear";
        System.out.println("지정한 분리자로 나누어 배열로 반환" + Arrays.toString(str2.split(",")));
        // 배열로 반환하기 때문에 출력할때 Arrays.toString()쓴 것
        String[] arr = str2.split(",", 2); // 분리는 하는데 2개로 나눠라
        for (String string : arr) {
            System.out.println(string);
        }

        // 대문자/소문자 변경
        str2 = "HELLO world";
        System.out.println("소문자로 변경" + str2.toLowerCase());
        System.out.println("대문자로 변경" + str2.toUpperCase());

        // trim() : 양쪽 끝에 있는 공백 제거
        // 공백도 문자이다! 따라서 " hello".equals("hello") => false 임!
        String str3 = "   Hello world     ";
        System.out.println(str3);
        System.out.println(str3.trim());

        // valueOf() : 문자열로 반환
        int i = 5;
        String str4 = String.valueOf(i); // "5"
        str4 = i + ""; // 근데 이렇게도 문자열로 바꿀 수 있으니까 방법은 선택하면 됨
        // * 기본타입 + 문자열타입 = 문자열타입

    }

}
