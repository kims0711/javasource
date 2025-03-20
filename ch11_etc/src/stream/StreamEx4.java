package stream;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김민성", "세리", "황대준", "이예준", "이경원", "김민성", "이예준");

        // 중복 제거 후 출력
        // 1) Set, 2) Stream
        Set<String> set = new HashSet<>(names);
        System.out.println(set);

        names.stream().distinct().forEach(n -> System.out.println(n));

        System.out.println();
        System.out.println("< 이씨만 출력 >");
        // 이씨 성을 가진 사람만 출력하기
        names.stream().filter(name -> name.startsWith("이"))
                .forEach(n -> System.out.println(n));

        System.out.println();
        System.out.println("< 중복 제거 후에 이씨만 출력 >");
        // 중복 제거 후에 이씨만 출력
        names.stream()
                .distinct()
                .filter(name -> name.startsWith("이"))
                .forEach(n -> System.out.println(n));

        System.out.println();

        List<String> fruits = Arrays.asList("apple", "grape", "melon", "watermelon", "banana");
        // 대문자로 변경 후 출력
        for (String f : fruits) {
            System.out.println(f.toUpperCase());
        }
        // 대문자로 변경한 것을 새로운 리스트로 생성
        List<String> bigFruits = new ArrayList<>();
        for (String f : bigFruits) {
            bigFruits.add(f.toUpperCase());
        }
        System.out.println(bigFruits);

        // 위 작업을 stream으로
        // map 괄호 안에 : Function<String, ? extends Object> mapper (String은 내가 잡아서 그런거)
        List<String> list = fruits.stream()
                .map(f -> f.toUpperCase())
                .collect(Collectors.toList());

        // Stream으로 처음부터 생성
        // IntStream.range(0, 0)
        // of(T... values) : 가변
        // of(T t)
        Stream<File> stream = Stream.of(
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3"),
                new File("file4.bak"),
                new File("file5.java"));

        // 확장자를 출력 (중복된 확장자는 제외) - txt, bak, java
        // 내가 한 거
        // for (String string : list) {
        // System.out.println(string.substring(string.indexOf(".")));
        // }

        // 강사님 코드
        // 추출된 확장자 담기
        Set<String> exSet = new HashSet<>();
        stream.forEach(f -> {
            // 확장자 추출하기
            int pos = f.getName().indexOf(".");
            if (pos != -1) {
                String ext = f.getName().substring(pos + 1);
                exSet.add(ext);
            }
        });
        System.out.println(exSet);

        Stream<File> stream2 = Stream.of(
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3"),
                new File("file4.bak"),
                new File("file5.java"));

        // stream
        stream2.map(f -> f.getName()) // 이름 모으기 (파일 객체를 스트림으로 이름만 남기기)
                // ["file1.txt", "file2.txt"...]
                .filter(f -> f.indexOf(".") > -1) // 확장자 있는 애들만 고르기
                // indexOf 못 찾으면 -1 이라서 위처럼 된 것
                .map(f -> f.substring(f.lastIndexOf(".") + 1)) // 모으기 txt, txt, bak, java
                .distinct() // 중복 제거
                .forEach(f -> System.out.println(f)); // 출력
    }
}
