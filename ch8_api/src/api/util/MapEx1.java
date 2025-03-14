package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        // Map<K(key)의 타입, V(value의 타입)> 의 구조임
        Map<String, String> map = new HashMap<>();

        // 추가
        map.put("id_0111", "김민성");
        map.put("id_0112", "세리");
        map.put("id_0113", "노태욱");
        map.put("id_0111", "임성수");
        map.put("id_0114", "최범석");
        map.put("id_0111", "김민성성");

        // key 값 가져오기
        Set<String> set = map.keySet(); // key를 가져오는데 key가 set 구조니까
        Iterator<String> iterator = set.iterator(); // set iterator를 가져와
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + " : " + value);
            // id_0111 : 임성수
            // id_0112 : 세리
            // id_0113 : 노태욱
            // id_0114 : 최범석
            // 중복된 것 저장 안 했고 나중걸로 덮음
        }
    }
}
