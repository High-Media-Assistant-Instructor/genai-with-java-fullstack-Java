package dbc4;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class MemberInsertPstmt4 {
	public static void main(String[] args) {
		try {
			Connection conn = DBConnec.getConnection();
			String userid = "orange";
			String pwd = "3333";
			String email = "orange@sun.com";
			String hp = "010-3333-4444";

			String sql = "INSERT INTO TB_MEMBER (m_userid, m_pwd, m_email, m_hp)"
				+ " VALUES (?,  ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, pwd);
			pstmt.setString(3, email);
			pstmt.setString(4, hp);
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행 입력");

			pstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			try {
				DBConnec.close();
			} catch (Exception e) {
			}
		}
	}
}
