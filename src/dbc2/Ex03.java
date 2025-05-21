package dbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.sql.Date;

public class Ex03 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/hi";
		String userid = "root";
		String passwd = "1111";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
 //입사일이 81-9-28일 이후인 사원의 empno, ename, hiredate를 출력하세요.
			String query = "SELECT empno, ename, HIREDATE FROM emp WHERE hiredate >= ?";
			pstmt = con.prepareStatement(query);
			Calendar c = Calendar.getInstance();
			c.set(1981,8,28);
			Date d = new Date(c.getTimeInMillis());
//			Date d = new Date(81,8,8);
			System.out.println(d);
			pstmt.setDate(1,  d );
//			pstmt.setString(1, "810928");
//			pstmt.setString(1, "19810928");
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				Date hiredate = rs.getDate("hiredate");
				System.out.println(empno + " " + ename + " " + hiredate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
