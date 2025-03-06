package oop;

//static이 붙은 메서드 : 클래스 메서드 
public class PrimitiveParamEx {
    public static void main(String[] args) {
        // main 메서드
        // change();
        Data d = new Data(); // 객체 생성
        d.x = 100; // 초기화
        System.out.println("main() : x= " + d.x);
        // change(d.x); // change 라는 메서드 호출

        // 값 복사
        change(d.x); // 얘는 값만 넘긴 것
        // 주소 복사
        change2(d); // d는 주소, 주소를 넘긴 것
        System.out.println("Atfer change() ");
        System.out.println(d.x);

        // PrimitiveParamEx obj = new PrimitiveParamEx();
        // obj.change();
        // }
    }

    static void change(int x) { // 값만 복사해서 가져옴
        x = 10000;
        System.out.println("change() : x = " + x);
    }

    static void change2(Data d) { // 주소를 복제하여 변수 자체를 지정해서 가져옴
        d.x = 10000;
        System.out.println("change() : x = " + d.x);
    }

}
