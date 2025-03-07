package extend;

public class CaptionTvEx {
    public static void main(String[] args) {
        // 부모 인스턴스 생성
        Tv tv = new Tv();

        // 자식 인스턴스 생성
        CaptionTv captionTv = new CaptionTv();
        captionTv.channel = 10; // 부모가 내려준 것
        captionTv.channelUp();
        System.out.println("현재 채널" + captionTv.channel);
        captionTv.displayCaption("Hello "); // 얘는 안 나옴 초기화값 false 니까
        captionTv.caption = true; // true 바꿔주고
        captionTv.displayCaption("bye"); // 얘는 true 니까 출력

    }

}
