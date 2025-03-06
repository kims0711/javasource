package oop;

public class StudentEx1 {
    public static void main(String[] args) {
        // Student 인스턴스 생성, 사용
        // 인스턴스를 생성할 때 생성자를 사용한다(무조건 무조건 호출됨)
        Student student1 = new Student();
        Student student2 = new Student(1, 5);
        Student student3 = new Student("s1234567", "김민성", 2, 3, "010-1234-5678", "kim@gmail.com");
        Student student4 = new Student("s1234568", "김세리", 1, 4, "010-1234-5578", "kimseri@gmail.com");

        // 그냥개발자 확인용
        // System.out.println(student1);
        // System.out.println(student2);
        // System.out.println(student3);
        // System.out.println(student4);

        studentInfo(student3);
        // System.out.println("==============================");
        // System.out.println("아이디 : " + student3.getStuId());
        // System.out.println("이름 : " + student3.getName());
        // System.out.println("학년 : " + student3.getGrade());
        // System.out.println("반 : " + student3.getClassNum());
        // System.out.println("전화번호 : " + student3.getPhoneNum());
        // System.out.println("이메일 : " + student3.getEmail());
        // System.out.println("==============================");

        System.out.println();

        studentInfo(student4);
        // System.out.println("==============================");
        // System.out.println("아이디 : " + student4.getStuId());
        // System.out.println("이름 : " + student4.getName());
        // System.out.println("학년 : " + student4.getGrade());
        // System.out.println("반 : " + student4.getClassNum());
        // System.out.println("전화번호 : " + student4.getPhoneNum());
        // System.out.println("이메일 : " + student4.getEmail());
        // System.out.println("==============================");

        // 전화번호 변경
        student3.changePhoneNum("010-9757-6779");
        System.out.println(student3);

    }

    public static void studentInfo(Student student) {
        System.out.println("==============================");
        System.out.println("아이디 : " + student.getStuId());
        System.out.println("이름 : " + student.getName());
        System.out.println("학년 : " + student.getGrade());
        System.out.println("반 : " + student.getClassNum());
        System.out.println("전화번호 : " + student.getPhoneNum());
        System.out.println("이메일 : " + student.getEmail());
        System.out.println("==============================");

    }
}
