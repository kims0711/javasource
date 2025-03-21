package stream;

import java.lang.StackWalker.Option;
import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcdef");
        Optional<Integer> optInt = optStr.map(String::length);

        // Optional 값 가져오기 -> get()
        System.out.println("optStr = " + optStr.get());
        System.out.println("optInt = " + optInt.get());

        // orElse() : 만약에 null 이면 빈 문자열 반환해라
        // optStr.orElse("");
        int result = Optional.of("").filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);
        System.out.println("result : " + result);

        // isPresent() / ifPresent(Consumer)
        Optional.of("456").map(Integer::parseInt)
                .ifPresent(x -> System.out.printf("result = %d\n", x));

        OptionalInt optInt1 = OptionalInt.of(0);
        OptionalInt optInt2 = OptionalInt.empty();
        System.out.println("optInt1= " + optInt1.isPresent());
        System.out.println("optInt2= " + optInt2.isPresent());
    }
}
