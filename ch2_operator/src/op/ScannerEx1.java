package op;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        //키보드로 입력받기 
        Scanner scanner = new Scanner(System.in); //키보드로 사용자에게 입력받기
        // System.in : 키보드   /   System.out : 화면

        System.out.println("두자리 정수 입력");
        // 사용자가 입력한 값을 input 변수에 담기
        // nextLine() : 문자열로 받아옴
        String input = scanner.nextLine(); // nextLine은 값을 문자로 받기 때문에 정수값이 아닌 "정수"의 문자열로 받은 것
        //각 형태의 원하는 변수로 input 받을 수는 있기는 함

        
        int num = Integer.parseInt(input);   // 문자열로 받아온 "정수"를 정수값으로 바꾸기 (필요한 경우)
        System.out.println("입력값: " +num);

        scanner.close();
    }
}
