package select.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateEx1 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement psmt = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String passward = "tiger";

            con = DriverManager.getConnection(url, user, passward);

            String sql = "UPDATE dept_temp SET loc = 'SEOUL' WHERE deptno = 10";
            psmt = con.prepareStatement(sql);
            System.out.println(psmt.executeUpdate() > 0 ? "수정성공" : "수정실패");

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
