package dbc1;

import java.sql.*;

public class DeleteTest {
	public DeleteTest(int empno) {
		
		try {
			User user = new User();
			Class.forName(user.getDriver());
			
			Connection conn = DriverManager.getConnection(user.getUrl(),user.getUser(), user.getPwd());
			Statement st = conn.createStatement();
			int rowCount = st.executeUpdate("delete from emp where empno=" + empno);
			
//			PreparedStatement ps = conn.prepareStatement("delete from emp where empno=? ");
//			ps.setInt(1, empno);
//			rowCount = ps.executeUpdate();
			if(rowCount > 0) {
				System.out.println("데이터 삭제 완료");
			}else {
				System.out.println("데이터 삭제 실패");
			}
			
			st.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new DeleteTest(8888);
	}

}
