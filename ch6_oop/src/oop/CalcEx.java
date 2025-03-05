package oop;

public class CalcEx {
    public static void main(String[] args) {
        Calc calc = new Calc();

        // +
        // return 타입이 있다면(void 제외)
        // 1) 변수에 담기 : 재사용 가능
        // 2) 출력문 사용 : 결과만 보고 싶을 때 (일회성?)
        long result1 = calc.add(45, 15); // 1의 경우

        System.out.println(calc.add(45, 15)); // 2의 경우

        int num1 = 45, num2 = 15;
        long result = calc.add(num1, num2); // 자동형변환 (int로 받아도 long이 더 크니까)

        System.out.printf("%d + %d = %d\n", num1, num2, result);
        System.out.printf("%d + %d = %d\n", num1, num2, calc.add(num1, num2));
        System.out.printf("%d - %d = %d\n", num1, num2, calc.subtract(num1, num2));
        System.out.printf("%d * %d = %d\n", num1, num2, calc.multiply(num1, num2));
        System.out.printf("%d / %d = %.2f\n", num1, num2, calc.divide(num1, num2));

        double d1 = 35.5, d2 = 10;
        System.out.printf("%.2f / %.2f = %.2f\n", d1, d2, calc.divide(d1, d2));

        // long 타입의 입력 값 2개
        // max/min 출력하기
        System.out.println(calc.max(10, 9));
        System.out.println(calc.min(10, 9));
    }

}
