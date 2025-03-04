package oop;

// OOP (Object Oriented Programming - 객체 지향 프로그래밍)
// 재사용성이 높다
// 코드의 관리가 용이함
// 신뢰성 높은 프로그램 작성

// 클래스 : 객체 정의, 설계도, 툴
// 클래스 용도 : 객체 생성 

// 객체 : 사물, 개념

// 붕어빵 기계(클래스) - 붕어빵(객체)

// 객체와 인스턴스 
// 인스턴스 : 어떤 클래스로부터 만들어진 객체
// ex : 책상은 책상 클래스의 인스턴스이다. (책상 클래스로부터 만들어진 특정 인스턴스(객체)라는 뜻)
// 객체 : 모든 인스턴스들의 통칭 (엄밀히 다른 뜻이지만 혼용해서 쓰기도 함)

public class classEx1 {
    public static void main(String[] args) {

        // < 인스턴스 생성 >
        // 클래스명 변수명 = new 클래스명();

        Tv tv = new Tv(); // new 가 들어가면 생성
        Tv tv2 = new Tv();

        // 속성 확인
        System.out.println(tv);
        System.out.println(tv2);

        // 인스턴스 사용 (속성 변경 등등)
        tv.color = "black";
        tv.channelUp();
        System.out.println("tv 현재 채널 : " + tv.channel);
        System.out.println("tv 색깔 : " + tv.color);

        System.out.println();

        tv2.power(); // 메소드 호출 : 메소드를 실행한다
        tv2.channel = 8; // 직접 값 입력
        tv2.volume = 20; // 직접 값 입력
        System.out.println("tv2 전원 상태 : " + tv2.power);
        System.out.println("tv2 현재 채널 : " + tv2.channel);
        System.out.println("tv2 볼륨 크기 : " + tv2.volume);

    }

}
