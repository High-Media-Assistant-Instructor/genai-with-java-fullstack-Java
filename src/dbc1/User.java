package dbc1;

public class User {
	private String url = "jdbc:mysql://localhost:3306/hi";
	private String user = "root";
	private String pwd = "1111";
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	public String getUrl() {
		return url;
	}
	public String getUser() {
		return user;
	}
	public String getPwd() {
		return pwd;
	}
	public String getDriver() {
		return driver;
	}
	
}
