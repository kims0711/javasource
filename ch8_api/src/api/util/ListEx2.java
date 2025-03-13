package api.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 요소 추가
        list.add("사과");
        list.add("바나나");
        list.add("수박");
        list.add("자몽");
        list.add("포도");
        list.add("감");
        list.add("귤");

        // 제거
        System.out.println("index를 이용한 제거 : " + list.remove(3));
        System.out.println("아이템 제거" + list.remove("감")); // ture (제거됨)
        System.out.println(list);

        // for문으로 출력 해보기
        for (int i = 0; i < list.size(); i++) { // 리스트 크기 : size() , 배열 크기: lenghth()
            System.out.printf("%s\t", list.get(i));
        }
        // 향상된 for문으로 출력 해보기
        for (String str : list) {
            System.out.printf("%s\t", str);
        }
        System.out.println();

        System.out.println("리스트에 특정 단어 포함 여부 " + list.contains("키위"));
        System.out.println("리스트에 특정 단어의 index 출력 " + list.indexOf("포도"));

        // int[] arr = {}
        // 배열 => 리스트로 변환 (조회용)
        // Arrays : 배열에 필요한 유용한 메소드 제공
        String[] strArr = { "사과", "포도", "멜론", "수박", "참외", "바나나", "망고" };
        List<String> list2 = Arrays.asList(strArr);
        System.out.println("조회 : " + list2.get(3)); // 배열을 리스트로 변환했으니 이제 이런 것도 가능
        // System.out.println("삭제 : " + list2.remove(3)); //
        // UnsupportedOperationException
        // list2.add("딸기"); // UnsupportedOperationException
        // ㄴ> 이 방식으로 배열 -> 리스트 변환하면 조회만 가능! (조회 용도로 쓸거면 이렇게 해도 ㄱㅊ)

        // 배열 => 리스트 변환 (조회 + 변경)
        List<String> list3 = new ArrayList<>(Arrays.asList(strArr));
        list3.add("딸기");
        list3.remove(3);

        // 리스트 => 배열 변환
        Object[] arrs = list3.toArray();
        System.out.println(Arrays.toString(arrs));

    }
}
