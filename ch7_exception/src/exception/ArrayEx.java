package exception;

public class ArrayEx {
    public static void main(String[] args) {
        int arr[] = new int[2];

        // 1) catch 각각 해주기
        // try {
        // System.out.println(arr[0]); //얘가 2보다 커지면 ArrayIndexOutOfBoundsException 뜨고
        // int num = 100 / 0; // 얜 ArithmeticException
        // } catch (ArrayIndexOutOfBoundsException e) {
        // e.printStackTrace();
        // System.out.println("배열 인덱스를 확인해주세요");
        // } catch (ArithmeticException e) {
        // e.printStackTrace();
        // System.out.println("0으로 나눌 수 없습니다");
        // }

        // 2) Exception이 부모니까 한 번에 받기
        try {
            System.out.println(arr[0]); // 얘가 2보다 커지면 ArrayIndexOutOfBoundsException 뜨고
            int num = 100 / 0; // 얜 ArithmeticException
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("오류 발생. 관리자에게 문의해주세요"); // catch가 하나니까 애매모호하게 출력
        }

        // 3) 멀티캐치블럭 (or로 아래처럼 잡기도 함)
        try {
            System.out.println(arr[0]); // 얘가 2보다 커지면 ArrayIndexOutOfBoundsException 뜨고
            int num = 100 / 0; // 얜 ArithmeticException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            e.printStackTrace();
            System.out.println("오류 발생. 관리자에게 문의해주세요"); // catch가 하나니까 애매모호하게 출력
        }
    }
}
