package condition;

import java.util.Scanner;

public class ifTest4 {
        public static void main(String[] args) {
        //score 점수 입력 받아서
        //score>=90 등급은 A : if()
        //score>=80 등급은 B : elseif()
        //score>=70 등급은 C : elseif()
        //score>=60 등급은 D : elseif()
        //score<60 등급은 F else

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수입력: ");
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);

        if(score>=90){
            System.out.println("점수가 90점 이상입니다");
            System.out.println("등급은 A 입니다");
        }else if(score>=80){
            System.out.println("점수가 80점 이상입니다");
            System.out.println("등급은 B 입니다");
        }else if(score>=70){
            System.out.println("점수가 70점 이상입니다");
            System.out.println("등급은 C 입니다");
        }else if(score>=60){
            System.out.println("점수가 60점 이상입니다");
            System.out.println("등급은 D 입니다");
        }else{
            System.out.println("점수가 60점 미만입니다");
            System.out.println("등급은 F 입니다");
        }
        scanner.close();
    }

}
