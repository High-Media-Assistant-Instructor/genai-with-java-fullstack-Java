package dbc1;

import java.sql.*;

public class FirstJDBC {
	public static void main(String[] args) {
		try {
			// mariadb 드라이버 설치
			//Class.forName("org.mariadb.jdbc.Driver");
			// mysql 드라이버 설치
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success!");


			// Connection객체 생성
			//String url = "jdbc:mariadb://localhost:3306/hi";
			String url = "jdbc:mysql://localhost:3306/hi";
			String user = "root";
			String pw = "1111";
			Connection conn = DriverManager.getConnection(url, user, pw);
			System.out.println("DB Connected Success!");
			
			// Statement객체 생성(명령문담고 실행할 수 있는 객체 생성)
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM DEPT WHERE DEPTNO=20 AND DNAME = 'RESEARCH' ");
			while(rs.next()) {
				int dno = rs.getInt(1);
				String dnm = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println(dno +", "+ dnm +", "+ loc);
			}
			System.out.println("\n===============\n");

			// PreparedStatement => prepareStatement()
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM DEPT WHERE DEPTNO = ? and DNAME = ?"); // 동적 SQL문 => 바인드변수 ?로 기술
			ps.setInt(1, 20);
			ps.setString(2, "RESEARCH");
			rs = ps.executeQuery();

			while(rs.next()) {
				int dno = rs.getInt(1);
				String dnm = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println(dno +", "+ dnm +", "+ loc);
			}
			System.out.println("\n===============\n");

			ps.setInt(1, 30);
			ps.setString(2, "SALES");
			rs = ps.executeQuery();
			
			while(rs.next()) { 
				int dno = rs.getInt(1);
				String dnm = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println(dno +", "+ dnm +", "+ loc);
			}
			
			rs = st.executeQuery("SELECT * FROM emp WHERE deptno=10"); //에러
//			ps = conn.prepareStatement("SELECT e.*, d.dname FROM emp e, dept d WHERE e.DEPTNO = d.deptno AND d.DEPTNO = ?");
//			ps.setInt(1, 10);
//			rs = ps.executeQuery();
			while(rs.next()) {
				int empno = rs.getInt("EMPNO");
				String ename = rs.getString("ename");
				String job = rs.getString("JOB");
				int mgr = rs.getInt("MGR");
				String hiredate = rs.getString("HIREDATE");
				double sal = rs.getDouble("SAL");
				double comm = rs.getDouble("COMM");
				int deptno = rs.getInt("DEPTNO");
				String dname = rs.getString("DNAME");
				System.out.println(empno +", "+ ename+", "+ hiredate+", "+ sal);
			}
			
			rs.close();
			st.close();
			ps.close();
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 오류입니다.");
		} catch (SQLException e) {
			System.out.println("SQL명령 오류 및 Connection객체 오류입니다.");
		}
	}
}
