package oop;

// 호출할때 new 선언 하지 않고 이름만으로도 호출 가능 (같은 클래스 안에 있으니까)
// 근데 static이 붙은 애들은 또 이름만으로 호출이 안 됨

// 메서드 종류 
// 1) 인스턴스 메서드 : 클래스 영역 / 인스턴스가 생성되었을 때 (new Card())
// 2) 클래스 메서드 : 클래스 영역 / 클래스가 메모리에 올라갔을 때 (클래스 작성 완료되면)

// 같은 클래스 내에서 다른 메소드 호출 가능 - 이름 사용
// static / non-static : 생성되는 시기가 다르기 때문에 호출 시점을 따져야 함
// non-static : static, non-static 둘 다 사용 가능

public class MiniCalc {
    static int k;
    int a, b;

    // 클래스 메서드
    static void print() {
        // 여기서 plus 등등 이하는 호출이 안 됨 (why? : 아직 생성이 안 되어서 -> new MiniCalc()로 생성하면 호출 가능)
        // this.a = 7; // 당연히 얜 여기서 사용 불가능
        k = 45;
    }

    int plus(int x, int y) {
        this.a = 7; // 인스턴스 메서드는 클래스 변수 사용 가능하다
        k = 45; // =
        print();
        return x + y;
    }

    double avg(int x, int y) {
        double sum = plus(x, y); // 여기서 plus와 avg는 생성시기가 같기 때문에 써놔도 오류 없는 것
        return sum / 2;
    }

    void execute() {
        double result = avg(07, 10);
        println("실행 결과 : " + result);
    }

    void println(String msg) {
        System.out.println(msg);
    }

}
