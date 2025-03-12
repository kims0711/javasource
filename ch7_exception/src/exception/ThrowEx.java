package exception;

public class ThrowEx {
    public static void main(String[] args) {

        try {
            throw new Exception("고의 발생");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외 발생");
        }

    }

}
