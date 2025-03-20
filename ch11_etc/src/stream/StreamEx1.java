package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("김민성", "세리", "노태욱");

        // Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
        }

        // Stream
        Stream<String> stream = list.stream();
        // 아래의 괄호 안이 Consumaer<String> action; 얘와 같은 뜻
        // forEach(Consumer<? super String> action) : void
        stream.forEach(s -> System.out.println(s));
        // stream.forEach(s -> System.out.println(s)); // Stream이 일회용이라서 이거 또 쓰면 에러 뜸

        List<Student> students = Arrays.asList(
                new Student("김민성", 90),
                new Student("세리", 85));

        Stream<Student> stream2 = students.stream();
        stream2.forEach(student -> {
            String name = student.getName();
            int math = student.getMath();
            System.out.println(name + " : " + math);
        });

        students.stream()
                .forEach(stu -> System.out.println(stu));
    }
}
