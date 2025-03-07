package extend;

// [ 오버라이딩 ]

// <조건>
// : 이름이 같아야 함
// : 매개변수가 같아야 함
// : 반환 타입이 같아야 함
// (그냥 똑같은 구조여야 함)

// <목적>
// : 재정의 -> 부모가 정의해 주는 내용을 자식에 맞춰서 변경하는 개념

// <오버로딩(overloading) vs 오버라이딩(overriding)>
// 오버라이딩 : 상속에서만 나오는 개념 -> 상속받은 메서드의 내용을 변경함
// 오버로딩 : 단일 클래스 내에서 동일한 메서드를 여러개 정의하는 것
public class SubString extends ListString {
    String name = "성춘향 ";

    @Override // 오버라이드 되었다는 뜻
    public void list() {
        super.list(); // 얘를 주석처리 하면 Ex에서 "홍길동상위클래스이름"은 출력 안 됨 super.list();가 부모 클래스를
        // 가져오는 거니까
        System.out.println(name + "하위 클래스 이름");
    }

    public void print() {
        list(); // 본인의 list 부르는 것
        super.list(); // 부모의 list 부르는 것
        // 어디서든 부모의 코드를 호출하려면 -> "super"
        exec();// super.exec();
    }

}
