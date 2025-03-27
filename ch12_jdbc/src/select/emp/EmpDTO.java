package select.emp;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class EmpDTO {
    // 테이블 한 행과 똑같은 구조로 생성 -> rs내용 담으려고
    private int empNo;
    private String eName;
    private String job;
    private int mgr;
    private String hirDate;
    private int sal;
    private int comm;
    private int deptNo;
}
