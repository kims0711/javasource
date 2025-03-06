package oop;

public class SingletonEx {
    public static void main(String[] args) {
        // Singleton : 객체를 하나만 만들어서 사용 (new를 막고 static을 이용)
        // new 를 쓰며 계속 객체를 새로 만드는 것과 다름

        // Singleton singleton = new Singleton -> 생성자가 private라서 인스턴스 생성 불가능
        Singleton singleton1 = Singleton.getInstacne();
        Singleton singleton2 = Singleton.getInstacne();
        System.out.println(singleton1 == singleton2 ? "같은 객체" : "다른 객체"); // 같은 객체임 why? ->

        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1 == student2 ? "같은 객체" : "다른 객체"); // 다른 객체임 (다른 인스턴스니까)

    }

}
