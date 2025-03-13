package api.string;

public class StringBuilderEx1 {
    public static void main(String[] args) {
        String str1 = "안녕하세요";
        str1 += " 반갑습니다";
        str1 += " 저는 김민성 입니다";
        System.out.println(str1);
        // 위와 같은 상황에서,
        // String은 원본 문자열 변경이 불가능하여 매번 기존의 메모리를 해제하고 재생성하는 개념이다

        StringBuffer sb = new StringBuffer("얘는 StringBuffer"); // 얘는 인스턴스 선언처럼 해야함
        sb.append(" append로 연결해야함");
        sb.append(" 계속 연결 가능");
        sb.append(" (1)연결을").append(" (2)이렇게도 바로 가능").append(" (3)안녕하세요");
        System.out.println(sb);

        // String에서 equals 확인
        String str2 = new String("Hello");
        String str3 = new String("Hello");

        System.out.println(str2.equals(str3) ? "같은 문자열" : "다른 문자열"); // 같은 문자열

        // StringBuffer에서 equals 확인
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");

        System.out.println(sb1.equals(sb2) ? "같은 sb문자열" : "다른 sb문자열"); // 다른 sb문자열
        // why? : StringBuffer의 equals는 부모(Object)가 상속해준 그대로 사용중이라서 주소 비교중

        // String의 equals를 사용하기 위해 변환
        //
        // <방법 1> : toString() 메소드 이용
        // String sbTostr1 = sb1.toString();
        // String sbTostr2 = sb2.toString();
        //
        // <방법 2> : 생성자 이용
        String sbTostr1 = new String(sb1);
        String sbTostr2 = new String(sb2);
        System.out.println(sbTostr1.equals(sbTostr2) ? "(변환 후) 같은 문자열" : "(변환 후) 다른 문자열");

        // str1 거꾸로 출력하기
        for (int i = str1.length() - 1; i >= 0; i--) { // length는 정수로 반환하고 index는 0부터 시작이라 -1
            System.out.print(str1.charAt(i));
        }
        System.out.println();

        // SB에는 문자열 거꾸로 찍는 메소드 있음 (reverse)
        System.out.println(sb.reverse());

        // str1을 StringBuffer로 변경 (메소드 없으니 new 쓰자)
        StringBuffer strTosb1 = new StringBuffer(str1);
        System.out.println("str1을 StringBuffer로 바꿔서 거꾸로 : " + strTosb1.reverse());

        // <StringBuffer의 메소드들 >
        // 1) delete()
        System.out.println(sb2.delete(0, 2)); // index범위 지정하여 지우기 : Hello 에서 0~2번 index의 글자 지움
        System.out.println(sb2.deleteCharAt(2)); // 해당 index의 글자만 지움 : llo에서 2번 index의 o지워짐
        //
        // 2) insert()
        System.out.println(sb1.insert(0, "H")); // 해당 index에 원하는 글자 삽입 (타입에 따라 insert 종류 여러개 있음)
        //
        // 3) replace
        System.out.println("sb1.replace(0,2,java) : " + sb1.replace(0, 2, "java"));
        System.out.println("원본 바뀐지 확인 : " + sb1); // 원본 바뀜

    }
}
