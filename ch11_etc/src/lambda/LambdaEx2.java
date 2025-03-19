package lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

public class LambdaEx2 {
    public static void main(String[] args) {
        // void accept(T t);
        // 숫자를 하나 전달인자로 받아 출력하기

        Consumer<Integer> consumer = (i) -> System.out.println(i); // * 얘는 먼저 출력문 쓰고 comnumer.accept를 소비하는 개념이고
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
    }
}
