package select.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
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

    // DML + SELECT
    // INSERT, DELETE, UPDATE : int 리턴
    // select : ~~DTO(where pk 지정) or List<~~DTO>
    public List<MemberDTO> getNameList(String name) {
        List<MemberDTO> list = new ArrayList<>();
        try {
            con = getConnection();
            String sql = "select * from member where name like ?";
            psmt = con.prepareStatement(sql);
            psmt.setString(1, "%" + name + "%");
            rs = psmt.executeQuery();
            while (rs.next()) {
                MemberDTO memberDTO = new MemberDTO();

                memberDTO.setNo(rs.getInt("no"));
                memberDTO.setId(rs.getString("id"));
                memberDTO.setName(rs.getString("name"));
                memberDTO.setAddr(rs.getString("addr"));
                memberDTO.setEmail(rs.getString("email"));
                memberDTO.setAge(rs.getInt("age"));
                list.add(memberDTO);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, psmt, rs);
        }
        return list;
    }

    public List<MemberDTO> getlist() {
        List<MemberDTO> list = new ArrayList<>();

        try {
            con = getConnection();
            String sql = "select * from member";
            psmt = con.prepareStatement(sql);

            rs = psmt.executeQuery();
            // rs에 있는 값을 dto로 옮겨야 함
            while (rs.next()) {
                MemberDTO memberDTO = new MemberDTO();

                memberDTO.setNo(rs.getInt("no"));
                memberDTO.setId(rs.getString("id"));
                // 컬럼명을 써서 가져오는 것, index 넘버로도 가져올 수는 있음
                // 컬럼명이기 때문에 따옴표 써주기
                memberDTO.setName(rs.getString("name"));
                memberDTO.setAddr(rs.getString("addr"));
                memberDTO.setEmail(rs.getString("email"));
                memberDTO.setAge(rs.getInt("age"));
                list.add(memberDTO);
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, psmt, rs);
        }
        return list;
    }

    public MemberDTO getRow(String id) {
        MemberDTO memberDTO = null;
        try {
            con = getConnection();
            String sql = "select * from member where id = ? ";
            psmt = con.prepareStatement(sql);
            psmt.setString(1, id);

            rs = psmt.executeQuery();
            // rs에 있는 값을 dto로 옮겨야 함
            if (rs.next()) {
                memberDTO = new MemberDTO();

                memberDTO.setNo(rs.getInt("no"));
                memberDTO.setId(rs.getString("id"));
                // 컬럼명을 써서 가져오는 것, index 넘버로도 가져올 수는 있음
                // 컬럼명이기 때문에 따옴표 써주기
                memberDTO.setName(rs.getString("name"));
                memberDTO.setAddr(rs.getString("addr"));
                memberDTO.setEmail(rs.getString("email"));
                memberDTO.setAge(rs.getInt("age"));
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, psmt, rs);
        }
        return memberDTO;
    }

    // insert, update : 전달인자 ~~DTO 설정
    public int update(MemberDTO memberDTO) {
        // meberDTO
        // 1. id, addr
        // 2. id, email

        int result = 0;

        try {
            con = getConnection();
            String sql = "update member ";

            if (memberDTO.getAddr() != null) {
                sql += "set addr = ? ";
                sql += "where id =?";
                psmt = con.prepareStatement(sql);
                psmt.setString(1, memberDTO.getAddr());
                psmt.setString(2, memberDTO.getId());
            } else {
                sql += "set email = ? ";
                sql += "where id =?";
                psmt = con.prepareStatement(sql);
                psmt.setString(1, memberDTO.getEmail());
                psmt.setString(2, memberDTO.getId());
            }

            result = psmt.executeUpdate();

            result = psmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, psmt);

        }
        return result;
    }

    // delete : 전달인자로 pk 사용함
    public int delete(String id) {
        int result = 0;

        try {
            con = getConnection();
            String sql = "delete from member where id = ? ";
            psmt = con.prepareStatement(sql);
            // 물음표 해결
            psmt.setString(1, id);
            result = psmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, psmt);
        }
        return result;
    }

    public int insert(MemberDTO mDto) {
        int result = 0;

        try {
            con = getConnection();
            String sql = "insert into member(no,id,name,addr,email,age)";
            sql += "values(member_seq.nextval,?,?,?,?,?)"; // 시퀀스 no 사용

            psmt = con.prepareStatement(sql);

            // 물음표 해결
            psmt.setString(1, mDto.getId());
            psmt.setString(2, mDto.getName());
            psmt.setString(3, mDto.getAddr());
            psmt.setString(4, mDto.getEmail());
            psmt.setInt(5, mDto.getAge());

            result = psmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, psmt);

        }
        return result;
    }
    // select * from member where name like "%홍%"

}
