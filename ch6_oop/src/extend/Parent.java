package extend;

// 자바에서의 관계
// <has a> 
// <is a> 
public class Parent { // * 여기에도 사실은 extends Object가 있는 것

    // Parent <-> Child : 상속(is a) 관계
    // : 부모 클래스가 준 코드도 쓰면서 자식 클래스는 추가도 가능
    // : 따라서 당연히 크기는 child가 큼
    // : 기차처럼 연쇄적으로 여러개 가능 (가장 밑에 있는게 가장 크겠지?)
    // 기존의 클래스를 재사용하여 새로운 클래스 작성
    // 자식 클래스가 여러개일 수 있는데 이때 자식들끼리는 독립적이다 (영향 X)
    // 단일 상속만 허용한다 : public class Trianle extnds 후에는 하나만 가능하다는 뜻
    // : public class Trianle extnds Parent, Tv 같은 거 안 된다는 뜻

    // * Object 클래스 - 모든 클래스들의 조상
    // 자동적으로 무조건 Object 클래스를 상속 받음 (무조건)

    // <장점>
    // 적은 양의 코드로 새로운 클래스 작성 가능
    // 코드를 공통적으로 관리 가능 -> 코드의 추가 및 변경 용이

    // 조상 클래스 (=) 부모, super, 상위, 기반(base) 클래스 등등으로 부르기도 함
    // 자손 클래스 (=) 자식, sub, 하위, 파생(derived) 클래스 등등으로 부르기도 함

    int age; // 인스턴스 변수

}
