package dbc1;

import java.sql.*;

public class InsertTest {
	//멤버필드들
	private Connection con; //null
	private Statement st; //null
	private PreparedStatement ps; //null
	private ResultSet rs; //null

	//main()메소드 
	public static void main(String[] args) {
		new InsertTest(1, "Tom", 100);
		new InsertTest(2, "Javaking", 500);
	}

	//기타생성자
	public InsertTest(int empno, String ename, double sal) {  //1, "Tom", 100
		try { 
			User user = new User();
			Class.forName(user.getDriver());
			con = DriverManager.getConnection(
					user.getUrl(), user.getUser(), user.getPwd()
			);
			System.out.println("DB 연결 성공");

			String sql = "INSERT INTO EMP(EMPNO, ENAME, SAL) "
					+ "values"
					+ "(" + empno + ",'" + ename + "'," + sal + ")";
			
			//"INSERT INTO EMP (EMPNO, ENAME, SAL) VALUES (?, ?, ?)"
			
			
			st = con.createStatement();
			
			int result = st.executeUpdate(sql);
			System.out.println("처리된 레코드 개수: " + result);
			st.close();
			
			
			sql = "INSERT INTO EMP(EMPNO, ENAME, SAL) values ( ? ,  ?  ,  ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, 8888);
			ps.setString(2, "HAHA");
			ps.setDouble(3, 2500.0);			
			int rowCount = ps.executeUpdate();	
			ps.close();
			

		} catch (ClassNotFoundException e) {
			System.out.println(e + "=> 드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println(e + "=> Sql 예외 ");
		} catch (Exception e) {
			System.out.println(e + "=> 일반 예외");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("연결객체닫기 오류");
			}
		}
	}

}
