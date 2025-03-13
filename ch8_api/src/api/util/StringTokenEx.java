package api.util;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenEx {
    public static void main(String[] args) {
        String str = "this is a test";
        StringTokenizer st = new StringTokenizer(str);

        // split() -> String[] (문자열 배열로 반환)
        System.out.println("String split()" + Arrays.toString(str.split("")));
        System.out.println("String split()" + Arrays.toString(str.split(" ")));
        System.out.println();

        // StringTokenizer -> String (문자열로 반환)
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println();
        str = "this/is/a/test";
        st = new StringTokenizer(str, "/"); // delim : 구분자가 없으면 공백으로 분리 (split과 다름)
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }
        System.out.println();

        String expression = "x=100*(200+300)/2";
        st = new StringTokenizer(expression, "+-*/=()", true); // returnDelims : 구분자도 return 할건지 true/false
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }
        System.out.println();
        System.out.println();

        String source = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
        st = new StringTokenizer(source, "|");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            StringTokenizer st2 = new StringTokenizer(token, ",");
            while (st2.hasMoreTokens()) {
                System.out.println(st2.nextToken());
            }
            System.out.println("---------------------------");
        }
        System.out.println();
    }
}
