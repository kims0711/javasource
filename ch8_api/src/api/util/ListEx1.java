package api.util;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        // int
        List<Integer> list = new ArrayList<>();

        // 추가 (add)
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);
        list.add(55);
        list.add(3, 90); // 위치 지정하여 넣기

        System.out.println(list); // [15, 25, 35, 90, 45, 55]

        // 조회 (get)
        System.out.println("특정 위치 요소 조회 : " + list.get(3)); // get쓰면 됨~

        // 삭제 (romove)
        System.out.println("특정 위치 요소 제거 : " + list.remove(1)); // index number 입력해서 지우기
        System.out.println("특정 요소 제거: " + list.remove(Integer.valueOf(35))); // 내용 입력하여 지우기
        // ㄴ> 얘 자체는 true/false 로 출력됨 (여기의 remove가 boolean이라서)
        System.out.println(list); // [15, 90, 45, 55]

    }
}
