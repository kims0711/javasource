package condition;

public class switchTest1 {
    public static void main(String[] args) {
        // switch : 조건문에서 if~else if~else 와 비슷한 기능으로 골라쓰기 가능

        int num = (int) (Math.random() * 6) + 1; // 1~6 주사위 ifTest5 참조
   

        switch (num) {
            case 1: //num이 1 과 같다면 이라는 뜻
                System.out.println("주사위 1 번이 나왔습니다");
                break;
            case 2:
                System.out.println("주사위 2 번이 나왔습니다");
                break;
            case 3:
                System.out.println("주사위 3 번이 나왔습니다");
                break;
            case 4:
                System.out.println("주사위 4 번이 나왔습니다");
                break;
            case 5:
                System.out.println("주사위 5 번이 나왔습니다");
                break;
            case 6:
                System.out.println("주사위 6 번이 나왔습니다");
               break;

        }

    }

}
