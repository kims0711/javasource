package inter;
// 관계없는 두 클래스 인터페이스로 관계 만들어주기 (의존성을 약화시켜주기) 

interface I { // 인터페이스 선언
    void methodB(); // 추상메서드
}

class AA {
    public void methodA(I i) { // 인터페이스로 매개변수 처리
        i.methodB(); // 여기도 i로 호출
    }
}

class BB implements I { // BB가 구현하는 클래스 (반드시 methodB를 구현해야함) -> 오버라이딩 필수
    @Override
    public void methodB() {
        System.out.println("methodB()");

    }
}

class InterfaceTest2 {
    public static void main(String[] args) {
        AA obj1 = new AA();
        obj1.methodA(new BB());
    }
}

// interfaceTest1과 무엇이 다른가?
// A가 직접 B를 참조하는 것이 아닌 인터페이스를 참조하게 만듦 (B도 인터페이스와 관계가 있으니까)
// 인터페이스 I만 참조하여 개발 할 수 있게 하는 것
