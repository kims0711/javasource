package poly;

public class Buyer {
    int money = 10000;
    int bonusPoint = 0;

    // new Product(), new Audio(), nuw Computer(), new Tv() 를 모두 담을 수 있게 됨
    // 구입한 제품을 담을 수 있는 배열
    Product[] products = new Product[10];

    // products 배열에 사용할 인덱스
    int i = 0;

    // 매개변수의 다형성
    // void buy(Product product) {
    // // 물건구매
    // if (money < product.price) {
    // System.out.println("잔액이 부족합니다. 구매 불가능");
    // return;
    // }
    // // 잔액 = 잔액 - 상품가격
    // this.money -= product.price;
    // // 보너스포인트 추가
    // this.bonusPoint += product.bonusPoint;
    // System.out.println(product + " 을(를) 구매 하셨습니다.");
    // }

    // 여러 객체를 한 번에 다루기 - 배열객체
    // *상속관계가 없을 때의 코드 작성
    // void buy(Computer[] computer){ }
    // void buy(Tv[] tv){ }
    // void buy(Audio[] audio){ }

    void buy(Product product) {
        // 물건구매
        if (money < product.price) {
            System.out.println("잔액이 부족합니다. 구매 불가능");
            return;
        }
        // 잔액 = 잔액 - 상품가격
        this.money -= product.price;
        // 보너스포인트 추가
        this.bonusPoint += product.bonusPoint;
        // 구매한 물건을 products 배열 추가
        products[i++] = product;

        System.out.println(product + " 을(를) 구매 하셨습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        // products 구매한 물건의 총 가격과 상품 목록 만들기
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                break;
            }
            sum += products[i].price;
            itemList += products[i] + ", ";
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + " 원 입니다");
        System.out.println("구입하신 물품들은 " + itemList + " 입니다");
    }
}

// 아래처럼 각각 해줘도 되는데 이럴 때 변수가 많아지면 불가능하니까
// 위 방법으로 ㄱㄱ(상속 관계를 만들고 8번째 줄 처럼 부모로 다 받아내기)
// void buy(Tv tv) {
// // 물건구매
// // 잔액 = 잔액 - 상품가격
// // 보너스포인트 추가
// }

// void buy(Computer computer) {
// // 물건구매
// // 잔액 = 잔액 - 상품가격
// // 보너스포인트 추가
// }
