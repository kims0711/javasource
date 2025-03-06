package oop;

public class TvEx {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.size = 50;
        tv.color = "black";

        // tv2.size = 10; // private로 선언했기 때문에 다른 클래스에서 사용 불가능하다.
        // --> 따라서 값의 변화(초기화)를 위해서 생성자를 만들거나 메소드를 이용해야 한다.

        Tv2 tv2 = new Tv2(60, "blue"); // 생성자 이용
        // tv2.size = 60; , color ="blue"
        // tv2 켜기
        tv2.power();
        // 채널 변경
        tv2.changeChannel(7);

        // 확인
        System.out.println(tv2);

        Tv2 tv3 = new Tv2();
        tv3.power();
        tv3.changeChannel(11);

        Tv3 obj1 = new Tv3();
        System.out.println("처음 상태");
        System.out.println(obj1.toString()); // Tv [size=0, color=null, channel=0, volume=0, power=false]

        obj1.setSize(60);
        obj1.setColor("Green");
        System.out.println("색상 : " + obj1.getColor());
        System.out.println("사이즈 : " + obj1.getSize());

    }

}
