package api.util;

import java.util.TreeSet;

public class SetEx5 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        String from = "b", to = "d";

        set.add("abc");
        set.add("alien");
        set.add("bat");
        set.add("car");
        set.add("Car");
        set.add("dance");
        set.add("disc");
        set.add("dzzzz");
        set.add("dzzzz");
        set.add("elephant");
        set.add("elevator");
        set.add("fan");
        set.add("flower");

        System.out.println(set);
        // [Car, abc, alien, bat, car, dance, disc, dzzzz, elephant, elevator, fan,
        // flower]
        // 아스키코드 상 대문자 우선이라 Car가 먼저 온거고 정렬된 거 맞음(오름차순)
        System.out.println(set.subSet(from, to)); // to는 포함 안 됨 [bat, car]
        System.out.println(set.subSet("a", "e"));
        // [abc, alien, bat, car, dance, disc, dzzzz]
        System.out.println(set.subSet(from, to + "zzz")); // [bat, car, dance, disc]
    }

}
