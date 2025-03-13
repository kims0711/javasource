package api.util;

import java.util.ArrayList;
import java.util.List;

import api.object.Person;

public class ListEx3 {
    public static void main(String[] args) {
        // Person 객체 리스트로 <>안에는 담고 싶은 것
        List<Person> list = new ArrayList<>();
        list.add(new Person("kim123", "김민성"));
        list.add(new Person("seri123", "세리"));
        list.add(new Person("lee123", "이경원"));
        list.add(new Person("jun123", "이예준"));
        list.add(new Person("roh123", "노태욱"));

        for (Person person : list) {
            System.out.println(person); // person.toString()
        }
        // 아이디 이름
        // --------------------
        // kim123 김민성
        System.out.println("아이디\t 이름");
        System.out.println("---------------");
        for (Person person : list) {
            System.out.printf("%s\t%s\n", person.getId(), person.getName());
        }
        System.out.println("---------------");
    }
}
