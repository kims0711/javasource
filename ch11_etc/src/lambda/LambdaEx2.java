package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx2 {
    public static void main(String[] args) {
        // void accept(T t);
        // 숫자를 하나 전달인자로 받아 출력하기

        // Consumer<Integer> consumer = (i) -> System.out.println(i); // * 얘는 먼저 출력문 쓰고
        // comnumer.accept를 소비하는 개념이고
        Consumer<Integer> consumer = System.out::println; // 이렇게도 가능하다 (람다.txt 참고)
        consumer.accept(50);

        // 문자를 하나 전달인자로 받아 출력
        Consumer<String> consumer2 = (str) -> System.out.println(str);
        consumer2.accept("안녕");

        BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + " " + u); // 똑같은 개념인데 걍 두개 가능임
        biConsumer.accept("이건", "BiConsumer");

        DoubleConsumer doubleConsumer = (d) -> System.out.println(d); // 객체가 아닌 기본타입으로 받기
        doubleConsumer.accept(15.5); // double 말고 int, long, 등등 다 있음

        ObjDoubleConsumer<String> objDoubleConsumer = (str, d) -> System.out.println(str + " " + d);
        // 인자 객체 하나로 받고 객체랑 기본타입 하나씩
        objDoubleConsumer.accept("안녕", 15.7); // 얘도 double 말고 int 등등 다 있음 : ObjIntConsumer, ObjLongConsumer...

        // Math.random() : 1~6 리턴

        Supplier<Integer> supplier = () -> (int) (Math.random() * 6) + 1; // * 얘는 값을 공급하고
        System.out.println("랜덤 1~6 : " + supplier.get()); // * 출력문으로 supplier.get()을 출력하는 개념

        // IntSupplier 등등도 있고 얜 리턴값이 int 라는 뜻 (기본 타입 각각 있고 같은 의미)
        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1; // 기본타입이니까 <> 당연히 필요없고
        System.out.println("랜덤 1~6 by IntSupplier : " + intSupplier.getAsInt());

        // 전달인자로 받은 문자열의 길이가 0인지 테스트한 후 0이라면 "빈 문자열입니다" 출력하기
        Predicate<String> predicate = (str) -> str.length() == 0;
        if (predicate.test("")) {
            System.out.println("빈 문자열 입니다");
        } else {
            System.out.println("빈 문자열이 아닙니다");
        }

        // 전달인자로 받은 숫자가 짝수인지 테스트 한 후 짝수라면 짝수입니다. 아닌 경우 홀수입니다.
        Predicate<Integer> predicate2 = (i) -> i % 2 == 0;
        if (predicate2.test(5)) {
            System.out.println("짝수입니다");
        } else {
            System.out.println("홀수입니다");
        }

        // Function<T, R> -> 둘 다 대문자니까 객체이고, T는 타입, R은 리턴 타입의 의미이다.
        // 숫자를 문자로 반환
        Function<Integer, String> function = (i) -> String.valueOf(i);
        System.out.println(function.apply(5)); // 문자로 넘어옴

        // BiFunction<T, U, R> : 객체 타입 두 개 받아서 객체로 반환
        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x + y;
        System.out.println("biFunction 예제 : " + biFunction.apply(5, 8));

    }
}
