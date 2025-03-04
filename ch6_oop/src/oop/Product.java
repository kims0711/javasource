package oop;

import java.time.LocalDate;

public class Product {
    // 속성
    // 제품번호(p10124), 제품명(운동화), 가격(129000), 제조년월(2025-02-25)
    String pCode;
    String pName;
    int price;
    LocalDate regiDate;

    // 기능 - 가격 변경
    void changePrice() {
    }

    @Override
    public String toString() {
        return "Product [pCode=" + pCode + ", pName=" + pName + ", price=" + price + ", regiDate=" + regiDate + "]";
    }

}
