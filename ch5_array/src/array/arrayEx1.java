package array;

// 배열 
// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 개념
// 배열의 크기는 변경이 불가능하다
public class arrayEx1 {
    public static void main(String[] args) {
        // 학생 100명의 점수를 입력
        // 배열의 기본 구조
        // int[] 배열명 = new int[100]; -> 배열선언, 생성(공간만 설정한 것)

        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        int[] scores2 = { 85, 65, 82, 76, 100 }; // 값을 전부 알고 있으면 이렇게 중괄호에 넣어줌

        System.out.println("세번째 학생= " + scores2[2]); // 세번째 학생 점수만 출력(0부터니까 2번 index에 )
        System.out.println("배열길이 = " + scores2.length);

        // 다섯번째 학생 점수 수정
        scores2[4] = 98;
        System.out.println("다섯번째 학생 점수 = " + scores2[4]);

        System.out.println(scores2[5]); // 배열의 크기를 벗어나기 때문에 오류 생김 //ArrayIndexOutOfBoundsException

    }
}
