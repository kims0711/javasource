package inter;

import java.util.Scanner;

public class Fighter extends Unit implements Fightable { // 보통 이러한 형태로 클래스들이 많이 구성 됨

    @Override
    public void move(int x, int y) {
        Math.random();
        throw new UnsupportedOperationException("Unimplemented method 'move'");

    }

    @Override
    public void attack(Unit uni) {
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

}
