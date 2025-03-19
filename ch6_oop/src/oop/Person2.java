package oop;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 클래스 위에 작성하면 모든 멤버변수가 사용 가능
@NoArgsConstructor
@RequiredArgsConstructor // 하단의 @NonNull과 같이 사용됨
// * @NonNull이 이정하는 변수를 포함하는 생성자를 쓸 수 있게 함 (NonNull 여러개도 지정 가능)
@AllArgsConstructor
@Getter
@ToString
@Builder // 인스턴스를 생성하는 또 다른 방법을 제공함

public class Person2 {
    @Setter // 특정 멤버변수 위에 붙이면 해당 멤버변수만 접근 가능하다
    private String pno;
    // @Setter // 이렇게 하면 name도 접근 가능 (클래스 안에서는 따로따로 붙여야 함)
    @NonNull // *
    private String name;
    // @NonNull // *
    private String tel;

}
