package api.wrapper;

public class WrapperEx1 {
    public static void main(String[] args) {

        Integer i = 10; // new 안 쓰고 기본 담기 가능
        int j = 10;

        System.out.println("숫자 => int : " + Integer.parseInt("10"));
        System.out.println("int => 문자 : " + i.toString());
        System.out.println("(5,8) max : " + Integer.max(5, 8));
        System.out.println("(5,8) min : " + Integer.min(5, 8));

    }

}
