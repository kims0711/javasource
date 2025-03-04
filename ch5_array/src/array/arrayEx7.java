package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayEx7 {
    public static void main(String[] args) {
        char[] abc = { 'a', 'b', 'c', 'd' };
        char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        // abc + num 합친 후 하나의 배열로 생성하기
        // char[] result = new char[14];
        char[] result = new char[abc.length + num.length]; // 굳이 세지 않고

        // abc 옮기기
        System.arraycopy(abc, 0, result, 0, abc.length);
        // num 옮기기
        System.arraycopy(num, 0, result, abc.length, num.length); // index가 0부터 시작이니까 abc.length+1 이 아닌 그냥 abc.length

        System.out.println(Arrays.toString(result)); // 확인
    }

}
