package api.math;

public class MathEx1 {
    public static void main(String[] args) {

        double val = 90.752;

        System.out.println("randome() 0 ~ 1 : " + Math.random());
        // 올림, 버림, 반올림
        System.out.println();
        System.out.println("Math.ceil(val) : " + Math.ceil(val)); // 올림 : 91.0
        System.out.println("Math.floor(val) : " + Math.floor(val)); // 버림 : 90.0
        System.out.println("Math.round(val) : " + Math.round(val)); // 반올림 : 91.0
        System.out.println("Math.min(x,y) : " + Math.min(val, 95.52));
        System.out.println("Math.max(x,y) : " + Math.max(val, 95.52));

    }
}
