package poly;

public class Parent {
    String field1;

    public void method1() {
        System.out.println("parent method1()");
    }

    public void method2() {
        System.out.println("parent method2()");
    }
}

class Child extends Parent {
    String field2;

    @Override // 오버라이딩 : 부모가 내려준 것을 조금 변경하여 쓰고 싶을 때
    public void method2() {
        System.out.println("child method2()");
    }

    public void method3() {
        System.out.println("child method3()");
    }
}
