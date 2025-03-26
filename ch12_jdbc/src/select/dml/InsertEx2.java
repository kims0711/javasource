package select.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import select.dto.DeptDto;

public class InsertEx2 {

    private static Scanner scanner = new Scanner(System.in);

    public static DeptDto data(Scanner scanner) {
        // 테이블에 저장할 데이터 입력받기
        System.out.println("------dept 테이블 데이터 입력------");
        System.out.print("deptno >> ");
        int deptno = Integer.parseInt(scanner.nextLine());
        System.out.print("dname >> ");
        String dname = scanner.nextLine();
        System.out.print("loc >> ");
        String loc = scanner.nextLine();

        DeptDto dto = new DeptDto(deptno, dname, loc);

        return dto;

    }

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement psmt = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String passward = "tiger";
            con = DriverManager.getConnection(url, user, passward);

            DeptDto dto = data(scanner);

            String sql = "insert into dept_temp(deptno, dname,loc) values(?, ?, ?)";
            psmt = con.prepareStatement(sql);
            // ? 세팅
            psmt.setInt(1, dto.getDeptno());
            psmt.setString(2, dto.getDname());
            psmt.setString(3, dto.getLoc());

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
