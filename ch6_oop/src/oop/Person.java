package oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 클래스 위에 작성하면 모든 멤버변수가 사용 가능
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Person {
    private String pno;
    private String name;
    private String tel;

}
