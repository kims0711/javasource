package oop;

public class StudentEx1 {
    public static void main(String[] args) {
        // Student 인스턴스 생성, 사용
        // 인스턴스를 생성할 때 생성자를 사용한다(무조건 무조건 호출됨)
        Student student1 = new Student();
        Student student2 = new Student(1, 5);
        Student student3 = new Student("s1234567", "김민성", 2, 3, "010-1234-5678", "kim@gmail.com");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

    }
}
