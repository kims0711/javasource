package shop;

public abstract class Product { // 추상클래스 : 추상메서드 하나 가지고 있어야 함
    // TV와 스마트폰의 공통 속성들
    private String pname; // 상품명
    private int price; // 가격

    public Product(String pname, int price) {
        this.pname = pname;
        this.price = price;
    }

    public void pirntDetail() {
        System.out.println("제품명 : " + this.pname);
        System.out.println("    가격 : " + this.price);
        printExtra();
    }

    public String getPname() {
        return pname;
    }

    public int getPrice() {
        return price;
    }

    // 추상메서드
    public abstract void printExtra(); // Tv와 스마트폰의 해상도, 통신사 각각 출력하려고

}
