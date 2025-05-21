package dbc2;
import java.sql.*;

public class Ex01 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			
			// 1. 드라이버 설치
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Connection객체 생성
			String url = "jdbc:mysql://localhost:3306/hi";
			String username = "root";
			String password = "1111";
			conn = DriverManager.getConnection(url, username, password);
			// 3. 명령문 객체 생성
			String sql = "SELECT empno, ename, job, hiredate FROM emp where deptno = 10";
			st = conn.createStatement();

			String sql1 = "SELECT empno, ename, job, hiredate FROM emp where deptno = ?";
			ps = conn.prepareStatement(sql1);
			// 4. 명령문 객체 실행
			rs = st.executeQuery(sql);

			ps.setInt(1, 10);
			rs = ps.executeQuery();

			while (rs.next()) {
				System.out.printf("%d \t %s \t %s \t %s \n", rs.getInt("EMPNO"), rs.getString("ename"),
						rs.getString("job"), rs.getString("hiredate"));
			}

		} catch (ClassNotFoundException e) {
			System.out.println("DB 드라이버 오류");
		} catch(SQLException e) {
			System.out.println("sql오류");
		} finally {
			// 5. 객체 닫기
			try {
				if (rs != null) rs.close();
				if (ps != null) ps.close();
				if (st != null) st.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				System.out.println("객체 닫기 오류");
			}
		}

	}
}