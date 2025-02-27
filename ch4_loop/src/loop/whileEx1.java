package loop;

// 반복문 : 반복적으로 실행해야 하는 코드를 간단하게 처리
// for , while, do~while 있음

public class whileEx1 {
    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        // System.out.println("안녕");
        // }


        // 무한루프 : 반복문이 멈추지 못하는 경우


        // 기본 while 구조
        int i = 0; //while은 변수가 밖에서 선언됨
        while (i < 5) {
            System.out.println("안녕하세요");
            i++;
        }

    }

}
