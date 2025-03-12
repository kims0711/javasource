package exception;

public class NullEx {
    public static void main(String[] args) {
        String str = null;

        System.out.println(str.length()); // null 값인 변수에 접근하면 -> NullPointerException 뜸

    }
}
