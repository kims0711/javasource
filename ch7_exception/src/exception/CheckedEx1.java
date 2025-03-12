package exception;

public class CheckedEx1 {
    public static void main(String[] args) {
        try {
            Class.forName("");
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // 어느 코드에서 오류가 생겼는지 알려주도록 출력하는 코드
            // 실행하면 터미널에서 확인 가능 // exception.CheckedEx1.main(CheckedEx1.java:6)
        }
    }
}
