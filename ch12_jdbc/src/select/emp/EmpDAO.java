package select.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
    private Connection con;
    private PreparedStatement psmt;
    private ResultSet rs;

    // static : 인스턴스변수, 인스턴스메서드 앞에 붙이면 => 공유(생성되는 모든 인스턴스가 같은 것을 사용)
    // : 로드 시점이 가장 처음에 로드됨
    static {
        // 1. 드라이버 로드
        try {
            Class.forName("oracle.jdbc.OracleDriver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public Connection getConnection() {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String passward = "tiger";

        try {
            con = DriverManager.getConnection(url, user, passward);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public void close(Connection con, PreparedStatement psmt) {
        try {
            psmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close(Connection con, PreparedStatement psmt, ResultSet rs) {
        try {
            rs.close();
            psmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // select, insert, update, delete 처리 메서드

    public int delete(int empNo) {
        con = getConnection();

        String sql = "delete from emt_temp where empno = ?";
        int result = 0;
        try {
            psmt = con.prepareStatement(sql);
            // 물음표 해결
            psmt.setInt(1, empNo);
            result = psmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, psmt);
        }
        return result;
    }

    public int update(EmpDTO eDto) {
        con = getConnection();
        int result = 0;

        try {
            String sql = "UPDATE emt_temp SET sal = ? where empno = ?";
            psmt = con.prepareStatement(sql);
            psmt.setInt(1, eDto.getSal());
            psmt.setInt(2, eDto.getEmpNo());

            result = psmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, psmt);
        }
        return result;
    }

    public int insert(EmpDTO eDto) {
        con = getConnection();
        int result = 0;
        try {
            String sql = "insert into emt_temp(empno, ename, job, mgr, hiredate, sal, comm, deptno)";
            sql += "values(?,?,?,?,?,?,?,?)";
            psmt = con.prepareStatement(sql);

            psmt.setInt(1, eDto.getEmpNo());
            psmt.setString(2, eDto.getEName());
            psmt.setString(3, eDto.getJob());
            psmt.setInt(4, eDto.getMgr());
            psmt.setString(5, eDto.getHirDate());
            psmt.setInt(6, eDto.getSal());
            psmt.setInt(7, eDto.getComm());
            psmt.setInt(8, eDto.getDeptNo());

            result = psmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, psmt);
        }
        return result;
    }

    public void select() {
    }
}
