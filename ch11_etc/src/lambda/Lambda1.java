package lambda;

public class Lambda1 {
    int max(int a, int b) {
        return a > b ? a : b;

    }
    // 람다식
    // (a,b) -> a > b ? a : b;

    void print(String name, int i) {
        System.out.println(name + i);
    }
    // 람다식
    // (name,i) -> System.out.println(name + i);

    int sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
    // 람다식
    // (int[] arr) -> {
    // int sum = 0;
    // for (int i : arr) {
    // sum += i;
    // }
    // return sum;
    // }
}
