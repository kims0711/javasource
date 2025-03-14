package api.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import api.object.Person;

public class SetEx3 {
    public static void main(String[] args) {

        Set<Person> set = new HashSet<>();
        set.add(new Person("kim123", "김민성"));
        set.add(new Person("seri123", "세리"));
        set.add(new Person("lee123", "이경원"));
        set.add(new Person("roh123", "노태욱"));
        set.add(new Person("jun123", "이예준"));
        set.add(new Person("roh123", "노태욱"));

        for (Person person : set) {
            System.out.println(person);
        }
        System.out.println(new Person("Kim", "김민성").hashCode());
        System.out.println(new Person("Kim", "김민성").hashCode());

    }
}