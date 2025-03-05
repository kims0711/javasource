package oop;

public class Student {
    // 멤버 변수, 멤버 메소드, 생성자,

    // 속성 : 학번(s1024125), 이름(홍길동), 학년(1), 반(1), 전화번호(010-1234-5678),
    // 이메일(kim@gmail.com)

    // < 멤버 변수 >
    String StuId;
    String Name;
    int Grade;
    int ClassNum;
    String PhoneNum;
    String Email;

    // 생성자 : 개발자가 명시하지 않으면 컴파일러가 자동으로 default 생성자 만들어줌.
    // 클래스명(){}
    // 생성자 여러개 만들 수 있지만 소괄호 안의 개수가 달라야 함 0~n
    public Student() { // 소괄호 안에 아무 것도 없는 생성자 : default 생성자
    }

    // 생성자 목적 : 멤버 변수 초기화
    public Student(String stuId, String name, int grade, int classNum, String phoneNum, String email) { // 얘도 매개변수
                                                                                                        // (Method 클래스
                                                                                                        // 주석 참조)

        this.StuId = stuId;
        this.Name = name;
        this.Grade = grade;
        this.ClassNum = classNum;
        this.PhoneNum = phoneNum;
        this.Email = email;
        // this = 자기 자신(객체)
        // ex) this.Name = name; : 자기 자신(Name)한테 name 값 넣어라 여기서 말하는 this.Name은 위에 있는 멤버
        // 변수 Name을 말함
    }

    // int grade, int classNum : 지역변수 (전달인자)
    public Student(int grade, int classNum) {
        this.Grade = grade;
        this.ClassNum = classNum;
    }
    // 기본 생성자 (default)
    // Student(){}

    // 기능 : 전화번호를 변경한다. 이메일을 변경한다. 학년이 변경된다. 반이 변경된다.
    // 메소드 : 리턴타입 메소드명(){} / (메소드는 기능을 가지고 있음 like 엑셀의 함수)
    // 리턴(반환)타입 : 기본타입(정수형, 불린형, 문자형, 실수형 등등), 객체(대문자로 시작), 배열, void(리턴타입 없음)

    void changePhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    void changeEmail(String email) {
        // this.email = email;
    }

    void changeGrade(int classNum) {

    }

    void changeClassNum() {

    }

    @Override
    public String toString() {
        return "Student [StuId=" + StuId + ", Name=" + Name + ", Grade=" + Grade + ", ClassNum=" + ClassNum
                + ", PhoneNum=" + PhoneNum + ", Email=" + Email + "]";
    }

}
