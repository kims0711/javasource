package oop;

import java.time.LocalDate;

public class ProductEx1 {
    public static void main(String[] args) {

        // 인스턴스 생성
        // = 생성자 호출
        Product product1 = new Product(); // 클래스에서 생성자 따로 선언하지 않았지만 컴파일러가 자동으로 default 생성자 만들어주기 때문에 오류가 안 생김
        // 초기화 (생성자의 목적)
        product1.pCode = "p1024";
        product1.pName = "운동화";
        product1.price = 124000;
        product1.regiDate = LocalDate.now();

        System.out.println(product1);
    }

}
