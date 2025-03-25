package select;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectEx2 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement psmt = null;
        ResultSet rs = null; // select 문 결과 담는 객체
        try {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 2. connection 객체 생성
            // jdbc:oracle:thin:@ => Oracle 연결문자열
            // @
            // localhost => 내 컴퓨터(== 127.0.0.1)
            // 1521 => 오라클 서버 포트번호
            // xe => 오라클 DB명
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String passward = "tiger";

            con = DriverManager.getConnection(url, user, passward);

            if (con != null) {
                System.out.println("연결되었습니다.");

                // emp 테이블 조회
                // empno가 7369인 사람
                String sql = "select * from emp where empno = 7369";

                // 3. Statement 객체 생성
                psmt = con.prepareStatement(sql);
                // 4. Query 수행
                rs = psmt.executeQuery();
                // 5. ResultSet 객체로부터 데이터 추출
                while (rs.next()) {
                    // 데이터가 number 타입 => int
                    int empno = rs.getInt(1);
                    // 데이터가 varchar => string
                    String ename = rs.getString("ename");
                    String job = rs.getString("job");
                    int mgr = rs.getInt("mgr");
                    String hireDate = rs.getString("hiredate");
                    int sal = rs.getInt("sal");
                    int comm = rs.getInt("comm");
                    int deptno = rs.getInt("deptno");

                    System.out.printf("%d   %s  %s  %d  %s  %d  %d  %d\n", empno, ename, job, mgr, hireDate, sal, comm,
                            deptno);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // 6.ResultSet close
                rs.close();
                // 7. Statment close
                psmt.close();
                // 8. Connection close
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
