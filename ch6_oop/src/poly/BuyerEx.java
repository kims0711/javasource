package poly;

public class BuyerEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        // buyer Tv를 산다
        // Tv tv = new Tv()
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Audio());
        buyer.summary();
        // System.out.println("남은 돈은 : " + buyer.money);
        // System.out.println("현재 보너스 포인트 : " + buyer.bonusPoint);

        // 여러 객체를 한 번에 다루기 - 배열객체
        // *상속관계가 없을 때의 코드 작성
        // Computer computer[] = new Computer[3];
        // Tv tv[] = new Tv[3];
        // Audio audio[] = new Audio[3];

        // computer[0] = new Computer();
        // computer[1] = new Computer();
        // computer[2] = new Computer();

        // tv[0] = new Tv();

        // audio[0] = new Audio();

        // buyer.buy(computer);
        // buyer.buy(tv);
        // buyer.buy(audio);

        // 상속관계가 있을 때의 코드 작성 => 매개변수 다형성

    }
}
