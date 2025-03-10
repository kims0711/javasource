package abstractClass;

public abstract class Player { // 추상 클래스 선언 (여기서 abstract 빼면 오류 생김)
    boolean pause;
    int currentPos;

    // 추상메서드 선언
    abstract void play();

    void pause() {

    }

    public Player() { // 자손클래스 만들기 위해서 있는 거
        pause = false;
        currentPos = 0;
    }

}

class CdPlayer extends Player {

    @Override
    void play() {
        System.out.println("Cd플레이어");
    }

}

class AudioPlayer extends Player {

    @Override
    void play() {
        System.out.println("Audio플레이어");
    }

}
