package op;

import java.util.Scanner;

public class test {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("0~9 사이의 정수 입력");

    String input = scanner.nextLine();
    int num = Integer.parseInt(input);

    if(num>=0 && num<=9){
        System.out.println("입력하신 숫자가 0~9입니다\n");
        System.out.printf("입력한 숫자 : %d", num);
    }else{
        System.out.println("입력하신 숫자가 범위 밖에 있습니다");
    }
}
    
}
