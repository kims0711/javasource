package abstractClass;

public class PlayerEx {
    public static void main(String[] args) {
        // Player player = new Player() {};
        // 인스턴스 생성 불가
        Player player = new CdPlayer();
        player.play();
        player = new AudioPlayer();
        player.play();
    }
}
