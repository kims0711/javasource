package condition;

import java.util.Scanner;

public class ifTest6 {
    public static void main(String[] args) {
        // if 구문은 중첩이 가능하다 (아래와 같이)

    // it(){
    //     if(){

    //     }else{

    //     }
    // }else{
    //     if(){

    //     }else{

    //     }
    // }
      
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수입력: ");
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);

        char grade = ' ',opt='0';
        if(score>=90){
            grade ='A';
            if(score>=98){
                opt = '+';
            }else if(score<94){
                opt = '-';
            }
        }else if(score>=80){
            grade = 'B';
            if(score>=88){
                opt = '+';
            }else if(score<84){
                opt = '-';
            }
        }else if(score>=70){
            grade = 'C';
            if(score>=78){
                opt = '+';
            }else if(score<74){
                opt = '-';
            }
        }else if(score>=60){
            grade = 'D';
            if(score>=68){
                opt = '+';
            }else if(score<64){
                opt = '-';
            }       
        }else{
            grade = 'F';
        }
        
        System.out.printf("당신의 학점은 %c%c입니다", grade, opt);
     
        scanner.close();

    }
}
