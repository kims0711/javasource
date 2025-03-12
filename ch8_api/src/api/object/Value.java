package api.object;

public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        Value v = (Value) obj; // Object를 가져왔기 때문에 Value v에 넣기 위해 캐스팅
        // Value 클래스로 만듦

        return this.value == v.value; // 원래 Object의 주소비교를 .value 로 값 비교로

    }

    // toString() : 멤버 변수의 값을 출력하는 용도로 재정의 (그렇게 많이 씀)
    // @Override
    // public String toString() {
    // return value + ""; // value를 String으로 만들기 ( + 문자열)
    // }

    @Override
    public String toString() {
        return "Value [value=" + value + "]";
    }

}
