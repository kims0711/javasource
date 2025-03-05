package oop;

public class GoodsStock {
    // 속성 : code(상품코드), stockNum (재고수량)

    String code;
    int stockNum;

    // 생성자
    @Override
    public String toString() {
        return "GoodsStock [code=" + code + ", stockNum=" + stockNum + "]";
    }

    // default 생성자 (괄호 안에 아무 것도 없는 것) : 초기화 필요함(값 넣기)
    // public GoodsStock() {
    // }

    // 기능 : 재고 추가한다, 재고 감소한다
    void substractStock(int num) {
        this.stockNum -= num;
    }

    public GoodsStock(String code, int stockNum) {
        this.code = code;
        this.stockNum = stockNum;
    }

    void addStock(int num) {
        this.stockNum += num;
    }

}
