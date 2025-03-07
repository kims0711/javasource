package extend;

public class SubStringEx {
    public static void main(String[] args) {
        SubString obj = new SubString(); // 1) 부모 인스턴스가 생성 / 2) 자식 인스턴스가 생성

        System.out.println("오버라이딩 안 했을 때 이름 : " + obj.name); // 부모(ListString)클래스에서도 name(홍길동)을 선언하고
        // 자식(본인=SubString) 클래스에서도 name(성춘향)을 선언함
        // 이때 name을 찍으면 성춘향이 출력됨 -> "본인 멤버 변수가 우선이다"
        // 부모와 본인 클래스에 같은 이름의 변수 존재 -> 본인우선
        // but 오버라이딩 하면 부모 클래스의 변수도 출력 가능

        obj.list(); // 성춘향 하위 클래스 이름도 출력을 원한다면?

    }

}
