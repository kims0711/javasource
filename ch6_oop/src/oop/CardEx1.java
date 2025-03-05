package oop;

public class CardEx1 {
    public static void main(String[] args) {

        // static 으로 선언된 변수와 메서드는 "클래스이름.~" 으로 접근 (Ex. 아래의 "Card.width/height")
        System.out.println("카드 너비" + Card.width);
        System.out.println("카드 높이" + Card.height);

        // 인스턴스 불러왔기 때문에 이제 클래스의 멤버 변수 사용 가능
        Card card = new Card();
        card.kind = "Heart";
        card.number = 7;

        Card card2 = new Card();
        card.kind = "Spade";
        card.number = 3;

    }

}
