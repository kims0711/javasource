package oop;

public class PersonEx {
    public static void main(String[] args) {

        Person p1 = new Person();

        p1.setName("김민성");
        p1.setPno("123");
        p1.setTel("010-9757-4654");
        System.out.println(p1); // Person(pno=123, name=김민성, tel=010-9757-4654) 출력

        Person2 p2 = new Person2();
        p2 = new Person2(null); // @RequiredArgsConstructor

        Person2 person2 = Person2.builder() // @Builder
                .pno("4243")
                .name("김민성")
                .build(); // 끝맺음

    }

}
