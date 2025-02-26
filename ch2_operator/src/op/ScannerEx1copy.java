package op;

import java.util.Scanner;

public class ScannerEx1copy {
    public static void main(String[] args) {
        //키보드로 입력받기 
        Scanner scanner = new Scanner(System.in); //키보드로 사용자에게 입력받기
        // System.in : 키보드   /   System.out : 화면

        System.out.println("두자리 정수 입력");
        // 사용자가 입력한 값을 input 변수에 담기
        // nextLine() : 문자열로 받아옴
        //String input = scanner.nextLine(); // nextLine은 값을 문자로 받기 때문에 정수값이 아닌 "정수"의 문자열로 받은 것
        int input = scanner.nextInt(); // input을 처음부터 정수값으로 받기
        //각 형태의 원하는 변수로 input 받을 수는 있기는 함

        
        //int num = Integer.parseInt(input);   // 이 경우에는 필요없어짐 (정수로 받으니까)
        //System.out.println("입력값: " +num);
        System.out.println("입력값: " +input);

        


        scanner.close();
    }
}
