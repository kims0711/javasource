package poly;

public class CaptionTvEx {
    public static void main(String[] args) {
        // 조상 타입의 참조변수로 자식 자식 인스턴스 참조
        Tv2 tv = new Tv2();

        tv.channel = 10; // 부모가 내려준 것
        tv.channelUp();
        System.out.println("현재 채널" + tv.channel);

        // 캐스팅을 통해 자손의 멤버에 접근한다.
        CaptionTv cTv = (CaptionTv) tv;

        cTv.displayCaption("Hello "); // 얘는 안 나옴 초기화값 false 니까
        cTv.caption = true; // true 바꿔주고
        cTv.displayCaption("bye"); // 얘는 true 니까 출력

    }

}
