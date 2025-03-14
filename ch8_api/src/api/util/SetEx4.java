package api.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
    public static void main(String[] args) {
        Set<Integer> lotto2 = new TreeSet<>();

        for (int i = 0; lotto2.size() < 6; i++) {
            // 로또 번호 1 ~ 45
            int num = (int) (Math.random() * 45 + 1);
            // lotto1.add(num);
            lotto2.add(num);
        }
        // hashSet : [33, 35, 37, 39, 24, 42]
        System.out.println(lotto2);
        // [11, 19, 20, 36, 42, 43] 얘는 정렬 되어있음

        // Set => List 변경
        List<Integer> list = new ArrayList<>(lotto2);
        list.sort(Comparator.reverseOrder()); // 내림차순 정렬
        // 오름차순 -> naturalOrder()

        System.out.println(list);
        // System.out.println(Comparator.reverseOrder());
        // System.out.println(Comparator.naturalOrder());
        // Collections.Order();

    }

}
