import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	// 데이터베이스 연결 객체
	private Connection connection;

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	// 데이터베이스 접속 아이디
	private final String MYSQL_ID = "root";

	// 데이터베이스 비밀번호
	private final String MYSQL_PASSWORD = "1234";

	// MySQL 접속할 떄 필요한 드라이버 이름
	private final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";

	// 데이터베이스 접속 주소, 자신의 컴퓨터
	private final String MYSQL_URL = "jdbc:mysql://localhost:3306";
	private final String MYSQL_DICTIONARY_PROPERTY = "?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";

	public DBManager() {
		try {
			Class.forName(MYSQL_DRIVER);
			connection = DriverManager.getConnection(MYSQL_URL + MYSQL_DICTIONARY_PROPERTY, MYSQL_ID, MYSQL_PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}