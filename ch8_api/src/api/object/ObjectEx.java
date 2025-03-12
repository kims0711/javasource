package api.object;

public class ObjectEx {
    public static void main(String[] args) {
        Object object1 = new Object(); // object -> 모든 클래스의 부모임
        Object object2 = new Object();

        // 주소값이 같니? (같은 인스턴스를 가리키고 있느냐)
        System.out.println(object1.equals(object2) ? "같음" : "다름"); // 삼항연산자
        System.out.println(object1 == object2 ? "같음" : "다름");

        System.out.println("Object toString()" + object1.toString()); // java.lang.Object@7a81197d (by toString())

        // new 할때마다 새로 만들고 주소도 새로 지정되니까
        Value value1 = new Value(10);
        Value value2 = new Value(10);

        // 여기서 !=이 출력 되는 것 (주소비교 개념임)
        // 부모로부터 상속받을 시 참조변수의 주소값 비교가 됨
        // 멤버변수의 값 비교로 equals 재정의 : 멤버변수 value의 값이 같은 값인지 비교
        System.out.println(value1.equals(value2) ? "value1 == value2" : "value1 != value2");
        System.out.println("value toString()" + value1.toString());

        Person p1 = new Person("kim123", "김민성");
        Person p2 = new Person("kim123", "김민성");

        System.out.println(p1.equals(p2) ? "p1 == p2" : "p1 != p2");
        System.out.println("person toString()" + p1.toString());

    }

}
