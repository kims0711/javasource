package generics;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [naem=]" + name + "]";
    }
}

class Worker extends Person {
    public Worker(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class HighStudent extends Student {
    public HighStudent(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Course<T> { // <T> -> 특정 객체 타입으로 와야해
    private String name;
    private List<T> students;

    public Course(String name, int capacity) {
        this.name = name;
        this.students = new ArrayList<>(capacity);
    }

    public void add(T t) {
        this.students.add(t);
    }

    public String getName() {
        return name;

    }

    public List<T> getStudents() {
        return students;
    }

}

class CousreEx {
    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인 과정", 20);
        personCourse.add(new Person("김민성"));
        personCourse.add(new Worker("세리"));
        personCourse.add(new Student("이예준"));
        personCourse.add(new HighStudent("이경원"));
        registerCourse(personCourse); // 얘는 모든 타입 가능이니까 얘로 등록시키기

        Course<Person> WorkerCourse = new Course<>("직장인 과정", 10);
        WorkerCourse.add(new Worker("세리"));
        registerCourse(WorkerCourse);

        Course<Student> StudentCourse = new Course<>("학생 과정", 5);
        StudentCourse.add(new Student("이예준"));
        registerCourse(StudentCourse);
        registerCourseStudent(StudentCourse);

        Course<HighStudent> HightStudentCourse = new Course<>("고등학생 과정", 5);
        HightStudentCourse.add(new HighStudent("이경원"));
        registerCourse(HightStudentCourse);
        registerCourseStudent(HightStudentCourse);

    }

    static void registerCourse(Course<?> course) { // 메소드에 제한을 걸어야 함 (여기서 얜 제한 X, 모든 타입 가능)
        // 모든 과정을 등록할 수 있는사람
        System.out.println(course.getName() + " 수강생 " + course.getStudents());
    }

    static void registerCourseStudent(Course<? extends Student> course) { // 메소드에 제한을 걸어야 함 (여기선 Student와 자식만 ㄱㄴ)
        // Student와 HighStudent만 등록
        System.out.println(course.getName() + " 수강생 " + course.getStudents());
    }

    static void registerWorker(Course<? super Worker> course) { // 메소드에 제한을 걸어야 함 (여기선 Worker와 부모(Person)만 ㄱㄴ)
        // Worker이거나 Person만 가능
        System.out.println(course.getName() + " 수강생 " + course.getStudents());
    }
}