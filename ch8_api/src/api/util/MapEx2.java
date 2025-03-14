package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import api.object.Person;

public class MapEx2 {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("1111", "김민성"));
        map.put(2, new Person("2222", "세리"));
        map.put(3, new Person("3333", "노태욱"));
        map.put(4, new Person("4444", "임성수"));
        map.put(5, new Person("5555", "최범석"));

        Set<Integer> set = map.keySet();
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            Integer key = iter.next();
            map.get(key);
            Person p = map.get(key);
            System.out.println(p);
        }

    }

}
