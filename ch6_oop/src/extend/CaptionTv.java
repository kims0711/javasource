package extend;

public class CaptionTv extends Tv {
    boolean caption; // 인스턴스 변수

    void displayCaption(String text) { // 메소드
        if (caption) { // caption이 true 일때 (caption이 boolean 변수니까)
            System.out.println(text);
        }
    }
}
