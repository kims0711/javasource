package stream;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "grape", "melon", "watermelon", "banana");

        Stream<String> stream = fruits.stream(); // stream으로 바꾸기
        stream.map(s -> s.toUpperCase()).peek(s -> System.out.println("확인 : " + s))
                .forEach(s -> System.out.println("최종처리 : " + s)); // peak : Consumer<? super String> action

        // "클래스이름::메서드이름 or 참조변수 :: 메서드" 형식 써보기
        fruits.stream().map(String::toUpperCase).forEach(System.out::println);

        // -----------------------------------------------------------------------------------------------------------------
        // peak로 어제 예제 중간 확인해보기
        System.out.println();

        Stream<File> stream2 = Stream.of(
                new File("file1.txt"),
                new File("file2.txt"),
                new File("file3"),
                new File("file4.bak"),
                new File("file5.java"));

        stream2.map(f -> f.getName()) // 이름 모으기 (파일 객체를 스트림으로 이름만 남기기)
                .peek(s -> System.out.println("확인 : " + s + "  "))
                // ["file1.txt", "file2.txt"...] : 이거 진짜 이런 상태인지 peak로 확인해보기
                .filter(f -> f.indexOf(".") > -1) // 확장자 있는 애들만 고르기
                // indexOf 못 찾으면 -1 이라서 위처럼 된 것
                .map(f -> f.substring(f.lastIndexOf(".") + 1)) // 모으기 txt, txt, bak, java
                .distinct() // 중복 제거
                .forEach(f -> System.out.println(f)); // 출력

        // ------------------------------------------------------------------------------------------------------------------
        // skip, limit
        // skip으로 2개 건너뛰고, 2개로 limit 걸어서 3,4번째 두개만 출력되는 것
        System.out.println();

        fruits.stream().skip(2).limit(2).forEach(s -> System.out.println(s));
        System.out.println();
        fruits.stream().skip(2).limit(2).forEach(System.out::println); // 이렇게도 가능 (람다식 표현)

        // ------------------------------------------------------------------------------------------------------------------
        // 스트림 연결
        System.out.println();

        String[] arr1 = { "123", "456", "789" };
        String[] arr2 = { "abc", "def", "hij" };

        // <배열->스트림>
        // 방법1 -> Arrays
        // Arrays.stream(arr1);
        // 방법2 -> of
        // Stream.of(arr1);

        Stream<String> stream3 = Stream.of(arr1);
        Stream<String> stream4 = Stream.of(arr2);

        // 위에 두개 연결하여 새로운 스트림으로 만들기
        Stream<String> stream5 = Stream.concat(stream3, stream4);

    }
}
