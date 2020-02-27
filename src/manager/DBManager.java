package manager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	// 데이터베이스 연결 객체
	public static Connection connection;


	// 데이터베이스 접속 아이디
	private final static String MYSQL_ID = "root";

	// 데이터베이스 비밀번호
	private final static String MYSQL_PASSWORD = "1234";

	// MySQL 접속할 떄 필요한 드라이버 이름
	private final static String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";

	// 데이터베이스 접속 주소, 자신의 컴퓨터
	private final static String MYSQL_URL = "jdbc:mysql://localhost:3306";
	private final static String MYSQL_DICTIONARY_PROPERTY = "?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";

	public static void init() {
		try {
			Class.forName(MYSQL_DRIVER);
			connection = DriverManager.getConnection(MYSQL_URL + MYSQL_DICTIONARY_PROPERTY, MYSQL_ID, MYSQL_PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	public static void main(String [] args) {
		init();
	}

}