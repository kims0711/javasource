package select.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertEx1 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement psmt = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String passward = "tiger";
            con = DriverManager.getConnection(url, user, passward);
            String sql = "insert into dept_temp(deptno, dname,loc) values(10, 'ACCOUNTING', 'NEW YORK')";

            psmt = con.prepareStatement(sql);
            int result = psmt.executeUpdate();

            System.out.println(result > 0 ? "입력성공" : "입력실패");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                psmt.close();

                con.close();
            } catch (Exception e) {
            }

        }
    }

}
