package poly;

public class ChildEx {
    public static void main(String[] args) {
        // * 아래 두 방법의 차이 알기
        Child child1 = new Child(); // 1) 그냥 child 부르기
        // 아래는 허용되나 참조할 수 있는 범위는 부모로 제한됨 but : 오버라이딩 된 것이 있다면 그것은 참조 가능
        Parent parent = new Child(); // 2) 다형성 이용해서 parent로 부르기

        child1.method1();
        child1.method2();
        child1.method3();

        // parent로 접근 가능한 범위
        // parent.field1;
        parent.method1(); // parent method1() 출력됨
        parent.method2(); // child method2() 출력됨

        // method method3() is undefined
        // parent.method3();

        // method3 사용
        // 부모 = 자식 ( O )
        Child child2 = (Child) parent; // 캐스팅(형변환) 해줘야함
        child2.method3();

        // 자식 = 부모 ( X )
        // 실행하면 아래는 Exception 걸림
        Parent parent2 = new Parent(); // 부모를 자식으로 강제 캐스팅 못함 !!
        child2 = (Child) parent2; // 그래서 여기서 오류 생김
        child2.method3();
    }

}
