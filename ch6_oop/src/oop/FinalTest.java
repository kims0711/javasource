package oop;

// public final class FinalTest {}

// class Test extends FinalTest{
// }

public class FinalTest {
    final int MAX_SIZE = 10;

    final void getMaxSize() {
        // MAX_SIZE = 20; // final 붙은 변수 값 변경 ㅂㄱㄴ (상수 취급임)
        final int Lv = MAX_SIZE;
        // Lv=20; // 지역변수도 불가능 final이 변수에 붙으면 그걸로 끝임

    }
}

class Test extends FinalTest {

}