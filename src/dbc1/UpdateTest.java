package dbc1;

import java.sql.*;

public class UpdateTest {
	public UpdateTest(int empno,String ename,double sal) {
		try {
			User user = new User();
			//mysql 드라이버 설치
			Class.forName(user.getDriver());
			//DB와 데이터를 주고 받기 위한 연결객체 생성(통로 open)
			Connection conn = DriverManager.getConnection(user.getUrl(), user.getUser(), user.getPwd());
			Statement st = conn.createStatement();
			String sql ="update emp set ename='" + ename + "', sal=" + sal + " where empno=" + empno;
			int rowCount = st.executeUpdate(sql);
			
			sql = "UPDATE EMP SET ENAME = ?, SAL = ? WHERE EMPNO = ? " ;
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,ename);
			ps.setDouble(2,sal);
			ps.setInt(3, empno);
			rowCount = ps.executeUpdate();
			
			if(rowCount > 0) {
				System.out.println("수정완료");
			}else {
				System.out.println("수정실패");
			}
			st.close();
			conn.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new UpdateTest(7844, "TURNER", 8000);
	}

}
