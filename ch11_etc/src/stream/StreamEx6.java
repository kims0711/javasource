package stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx6 {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 10);

        // 2의 배수 개수
        long cnt = stream.filter(i -> i % 2 == 0).count();
        System.out.println("2의 배수 개수  : " + cnt);

        IntStream stream2 = IntStream.rangeClosed(1, 10);
        // 2의 배수 평균
        OptionalDouble d = stream.filter(i -> i % 2 == 0).average(); // return이 OptionalDouble
        System.out.println("2의 배수 평균 : " + d);

        IntStream stream3 = IntStream.rangeClosed(1, 10);
        OptionalInt opt = stream.filter(i -> i % 2 == 0).max();
        System.out.println("2의 배수 중 최대 : " + opt);

        IntStream stream4 = IntStream.rangeClosed(1, 10);
        OptionalInt min = stream.filter(i -> i % 2 == 0).min();
        System.out.println("2의 배수 중 최소 : " + min);

        IntStream stream5 = IntStream.rangeClosed(1, 10);
        int sum = stream.filter(i -> i % 2 == 0).sum();
        System.out.println("2의 배수 합 : " + sum);

    }

}
