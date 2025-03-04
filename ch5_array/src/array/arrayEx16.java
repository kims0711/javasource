package array;

import java.util.Scanner;

public class arrayEx16 {
    public static void main(String[] args) {

        // Q1. chair의 뜻은? -> 의자 입력하면
        // 정답입니다 출력 (words[0][1].equals(사용자 입력값))
        // Q2. computer의 뜻은 -> 의자 입력하면
        // 오답입니다. 정답은 컴퓨터 입니다 출력
        // Q3. words[2][0] 의 뜻은? -> 의자

        String[][] words = {
                { "chair", "의자" },
                { "computer", "컴퓨터" },
                { "integer", "정수" }
        };

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("%s 의 뜻은 무엇일까요?\n", words[i][0]); // 질문하기
            String input = sc.nextLine(); // 사용자 입력값 받기
            if (words[i][1].equals(input)) { // if로 판단해서 출력하고 반복
                System.out.println("정답입니다!");
            } else {
                System.out.printf("오답입니다! 정답은 %s 입니다!\n", words[i][1]);
            }
        }
        sc.close();
    }
}
