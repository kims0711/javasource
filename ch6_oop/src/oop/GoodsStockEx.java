package oop;

public class GoodsStockEx {
    public static void main(String[] args) {
        // new GoodsStock() : default 생성자를 호출하면서 인스턴스 생성

        // GoodsStock goodsStock = new GoodsStock();
        // goodsStock.code = "p103";
        // goodsStock.stockNum = 50;

        GoodsStock goodsStock = new GoodsStock("p103", 50); // 이렇게 가능
        System.out.println(goodsStock);

        // 판매 -5
        goodsStock.substractStock(5);
        System.out.println(goodsStock);

        // 제품 입고 10
        goodsStock.addStock(10);
        System.out.println(goodsStock);

    }

}
