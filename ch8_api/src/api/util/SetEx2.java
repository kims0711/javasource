package api.util;

// 로또 번호 1 ~ 45 中 6개 무작위 추출
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {

        // 로또 중복 숫자 나오면 안 되니까 Set으로 해봄
        List<Integer> lotto1 = new ArrayList<>();
        Set<Integer> lotto2 = new HashSet<>();

        // 6개 숫자 무작위 추출
        for (int i = 0; lotto2.size() < 6; i++) {
            // 로또 번호 1 ~ 45
            int num = (int) (Math.random() * 45 + 1);
            // lotto1.add(num);
            lotto2.add(num);
        }
        System.out.println(lotto2);
    }
}
