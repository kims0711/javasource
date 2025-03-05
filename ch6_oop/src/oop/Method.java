package oop;

public class Method {

    // 메소드 : 리턴타입 메소드명(){} / (메소드는 기능을 가지고 있음 like 엑셀의 함수)
    // 리턴(반환)타입 : 기본타입(정수형, 불린형, 문자형, 실수형 등등), 객체(대문자로 시작), 배열, void(리턴타입 없음)

    int method1() { // 리턴 타입이 void가 아닐 때는 (void는 리턴타입이 없으니까)

        int sum = 15;
        return 0; // 리턴 해줘야 함 : "return + 해당하는 타입의 값"
        // return sum; 이렇게도 가능
    }

    String method2() {
        // return "안녕"; //마찬가지로 맞는 타입의 값 혹은
        // return null; // 객체에서는 null값도 ㄱㅊ
        String str = "hello";
        return str; // 위와 같이 마찬가지로
    }

    double method3() {
        return 1.4;
    }

    char method4() {
        return 'd';
    }

    void method5() {
        // return; :이렇게 return;만 써주기도 함
    }

    // 매개변수가 있는 메서드
    // 매개변수 : 기본타입(정수형, 불린형, 문자형, 실수형 등등), 객체(대문자로 시작), 배열 가능 (void는 불가능)
    // -> 개수 상관 없음 1 ~ n 개
    int add(int x, int y) { // 두 개를 입력 받아서
        return x + y; // 얘를 출력 한다는 뜻
    }

    float add2(int x, float y) {
        // int + float = float 니까 리턴값이 float가 됨
        return x + y;
    }

    void print(String name, String id) {
        System.out.println(name + " : " + id);
    }

    int[] arr(int[] arr1) { // int형 배열이 들어오고 int형 배열이 출력 되어야 함
        return arr1;
    }

}
