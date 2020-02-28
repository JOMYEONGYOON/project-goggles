package manager.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBManager {
	// 데이터베이스 연결 객체
	public static Connection connection;

	private final static String CREATE_DATABASE_IF_NOT_EXISTS_SQL = "CREATE DATABASE if not exists dictionary DEFAULT CHARSET=utf8";

	private static final String DATABASE_CLASS_NOT_FOUND_ERROR = "데이터베이스 클래스를 찾지 못한 오류";

	private static final String DATABASE_CREATE_SUCCESS_INFO = "데이터베이스생성 작업을 성공하였습니다.";

	private static final String DATABASE_INIT_ERROR = "데이터베이스 생성 오류";

	private static final String DATABASE_SETTING_SUCCESS = "데이터베이스 설정 완료";

	private static final String DATABASE_USE_ERROR = "데이터베이스 사용 오류";

	// 데이터베이스 접속 주소, 자신의 컴퓨터
	private final static String MYSQL_DATABASE_URL = "jdbc:mysql://localhost:3306/dictionary";
	private final static String MYSQL_DICTIONARY_PROPERTY = "?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
	// MySQL 접속할 떄 필요한 드라이버 이름
	private final static String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
	// 데이터베이스 접속 아이디
	private final static String MYSQL_ID = "root";
	// 데이터베이스 비밀번호
	private final static String MYSQL_PASSWORD = "1234";
	// 데이터베이스 접속 주소, 자신의 컴퓨터
	private final static String MYSQL_URL = "jdbc:mysql://localhost:3306";
	private static final String PROGRAM_SHUTDOWN = "프로그램을 종료합니다";
	private static final String USER_DATABASE_SQL_ERROR = "데이터베이스 SQL 오류";
	public static void main(String[] args) {
		new DBManager();
	}

	public DBManager() {
		if (setDatabase()) {
			System.out.println(DATABASE_SETTING_SUCCESS);
		}
	}

	private boolean newDatabase() {
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(CREATE_DATABASE_IF_NOT_EXISTS_SQL);
			prepareStatement.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	private boolean setDatabase() {
		try {
			Class.forName(MYSQL_DRIVER);
			connection = DriverManager.getConnection(MYSQL_URL + MYSQL_DICTIONARY_PROPERTY, MYSQL_ID, MYSQL_PASSWORD);
			if (newDatabase()) {
				if (useDatabase()) {
					System.out.println(DATABASE_CREATE_SUCCESS_INFO);
					return true;
				} else {
					System.err.println(DATABASE_USE_ERROR);
					return false;
				}
			} else {
				System.err.println(DATABASE_INIT_ERROR);
				System.err.println(PROGRAM_SHUTDOWN);
				System.exit(0);
				return false;
			}

		} catch (SQLException e) {
			System.err.println(USER_DATABASE_SQL_ERROR);
			return false;
		} catch (ClassNotFoundException e) {
			System.err.println(DATABASE_CLASS_NOT_FOUND_ERROR);
			return false;
		}
	}

	private boolean useDatabase() {
		try {
			Class.forName(MYSQL_DRIVER);
			connection = DriverManager.getConnection(MYSQL_DATABASE_URL + MYSQL_DICTIONARY_PROPERTY, MYSQL_ID,
					MYSQL_PASSWORD);

		} catch (SQLException e) {
			System.err.println(USER_DATABASE_SQL_ERROR);
			return false;
		} catch (ClassNotFoundException e) {
			System.err.println(DATABASE_CLASS_NOT_FOUND_ERROR);
			return false;
		}
		return true;
	}
}