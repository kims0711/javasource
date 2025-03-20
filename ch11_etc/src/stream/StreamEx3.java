package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        // Member => 남자 멤버의 나이 평균
        List<Member> memberes = Arrays.asList(new Member("김민성", Member.MALE, 23),
                new Member("세리", Member.FEMALE, 22),
                new Member("이예준", Member.MALE, 37),
                new Member("김수현", Member.FEMALE, 19));

        // 기존 방법으로
        int age = 0, count = 0;
        for (Member member : memberes) {
            if (member.getGender() == Member.MALE) {
                age += member.getAge();
                count++;
            }
        }
        System.out.println("남자 멤버 나이 평균 : " + age / count);

        // 스트림으로 처리 해보기
        // filter(Predicate<Member> predicate)
        double ageAvg = memberes.stream()
                .filter((member) -> member.getGender() == Member.MALE) // filter -> 남자만 골라내고
                .mapToInt(Member::getAge) // 위의 member.getAge();와 같은 개념 (getAge호출)
                // age를 int 형태로 모아서 더한 것임 (map은 원래 모아주는 개념)
                .average() // 모은 값을 평균 내는 코드
                .getAsDouble(); // 평균을 double로 리턴하기
        System.out.println("남자 멤버 나이 평균 : " + ageAvg);
    }
}
