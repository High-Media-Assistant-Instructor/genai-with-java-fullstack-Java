package dbc5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	//싱글톤조건 1 : private static 객체 선언 (외부 접근 불가)
    private static Connection connec; 

    //싱글톤 조건 2 : public static getter메소드 선언 (객체 생성 없이 클래스명으로 외부 접근 가능)
    public static Connection getConnection() throws ClassNotFoundException, SQLException 
    {
    	//싱글톤 조건 3 : 객체(인스턴스=클래스복제본)를 한 번만 생성할 수 있는 조건
        if(connec == null) { 
            String url = "jdbc:mysql://localhost:3306/hi";
            String user = "root";
            String pw = "1111";

            Class.forName("com.mysql.cj.jdbc.Driver");
            connec = DriverManager.getConnection(url, user, pw);
        }
        //싱글톤 조건 4 : 멤버필드로 만든 객체 반환(무조건 한 개의 동일한 객체만 반환됨)
        return connec;
    }
    
    // DB 연결 해제(닫기)
    public static void close() throws SQLException {        
        if (connec != null) {
            if (!connec.isClosed()) {
                connec.close();
            }
        }

        connec = null;
    }
}
