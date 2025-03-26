package select.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import select.dto.DeptDto;

public class DeleteEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Connection con = null;
        PreparedStatement psmt = null;

        try {// 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // connection 객체 생성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String passward = "tiger";

            con = DriverManager.getConnection(url, user, passward);

            System.out.print("삭제할 부서 번호를 입력하시오 >> ");
            int deptno = Integer.parseInt(sc.nextLine());

            String sql = "delete from dept_temp where deptno = ?";
            psmt = con.prepareStatement(sql);
            psmt.setInt(1, deptno);
            int result = psmt.executeUpdate();
            if (result > 0) {

                System.out.println("삭제 성공");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                psmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
