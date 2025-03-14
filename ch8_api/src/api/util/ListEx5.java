package api.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(200000);
        // ArrayList 는 공간 넉넉하게 잡고 시작해야함
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("===순차적으로 추가하기===");
        System.out.println("ArrayList : " + add1(arrayList));
        System.out.println("LinkedList : " + add1(linkedList));
        System.out.println();
        System.out.println("===중간에 추가하기===");
        System.out.println("ArrayList : " + add2(arrayList));
        System.out.println("LinkesList : " + add2(linkedList));
        System.out.println();
        System.out.println("===중간에 삭제하기===");
        System.out.println("ArrayList : " + remove2(arrayList));
        System.out.println("LinkedList : " + remove2(linkedList));
        System.out.println();
        System.out.println("===순차적으로 지우기===");
        System.out.println("ArrayList : " + remove1(arrayList));
        System.out.println("LinkedLIst : " + remove1(linkedList));
        System.out.println();
    }

    public static long add1(List<String> list) {
        long strat = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i + "");
        }
        long end = System.currentTimeMillis();
        return end - strat;

    }

    public static long add2(List<String> list) {
        long strat = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(500, "X");
        }
        long end = System.currentTimeMillis();
        return end - strat;

    }

    public static long remove1(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long remove2(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
