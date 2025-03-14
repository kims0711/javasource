package api.util;

// 정렬
import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx1 {
    public static void main(String[] args) {
        Integer[] arr = { 33, 4, 17, 62, 7 };
        System.out.println(arr); // 주소 출력됨
        System.out.println("정렬 전 : " + Arrays.toString(arr)); // 값 출력
        // Arrays.toString(args);
        // Arrays.asList("");

        // 정렬
        Arrays.sort(arr); // 원본을 정렬함
        System.out.println("정렬 후 : " + Arrays.toString(arr));

        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr));
        // arr을 객체타입으로 담아야 해서 처음에 배열 선언할 때 Integer로 해야함
        // (Integer가 int의 객체타입이니까)

        // 문자 정렬
        Character[] cahracters = { 'a', 'k', 'b', 'w', 'g' };
        System.out.println(Arrays.toString(cahracters)); // 오름차순
        Arrays.sort(cahracters, Comparator.reverseOrder()); // 내림차순 (원본 변경)
        System.out.println(Arrays.toString(cahracters)); // 내림차순 출력
    }

}
