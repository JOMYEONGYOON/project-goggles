package manager.db;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import manager.PathManager;

public class DBManager {
	private static final String DATABASE_CREATE_TABLE_ERROR = "테이블 생성에 실패";
	private static final String DATABASE_SQL_ERROR = "데이터베이스 SQL 오류";
	private static final String DATABASE_CLASS_NOT_FOUND_ERROR = "데이터베이스 클래스를 찾지 못한 오류";
	private static final String DATABASE_CREATE_SUCCESS_INFO = "데이터베이스생성 작업을 성공하였습니다.";
	private static final String DATABASE_INIT_ERROR = "데이터베이스 생성 오류";
	private static final String DATABASE_SETTING_SUCCESS = "데이터베이스 설정 완료";
	private static final String DATABASE_USE_ERROR = "데이터베이스 사용 오류";
	private static final String SQL_DROP_TABLE = "DROP TABLE ";
	private static final String MEMBER = "member";
	private static final String WORD = "word";

	// 데이터베이스 연결 객체
	public static Connection connection;

	private final static String SQL_CREATE_DATABASE_IF_NOT_EXISTS = "CREATE DATABASE if not exists dictionary DEFAULT CHARSET=utf8";

	// 데이터베이스 접속 주소, 자신의 컴퓨터
	private final static String MYSQL_DATABASE_URL = "jdbc:mysql://localhost:3306/dictionary";
	private final static String MYSQL_DICTIONARY_PROPERTY = "?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
	// MySQL 접속할 떄 필요한 드라이버 이름
	private final static String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
	// 데이터베이스 접속 아이디
	private static String MYSQL_ID = "root";
	// 데이터베이스 비밀번호
	private static String MYSQL_PASSWORD = "1234";
	// 데이터베이스 접속 주소, 자신의 컴퓨터
	private static String MYSQL_URL = "jdbc:mysql://localhost:3306";

	public DBManager() {
		setDatabase();
	}

	private void newDatabase() throws Exception {
		PreparedStatement prepareStatement = connection.prepareStatement(SQL_CREATE_DATABASE_IF_NOT_EXISTS);
		prepareStatement.execute();
	}

	private void setDatabase() {
		try {
			Class.forName(MYSQL_DRIVER);
			connection = DriverManager.getConnection(MYSQL_URL + MYSQL_DICTIONARY_PROPERTY, MYSQL_ID, MYSQL_PASSWORD);
			newDatabase();
			useDatabase();
			createTable();
			System.out.println("데이터베이스 셋팅 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이터베이스 셋팅 실패");
		}
	}

	private void createTable() throws Exception {

		createTable(PathManager.CREATE_MEMBER_SQL_PATH);
		createTable(PathManager.CREATE_WORD_SQL_PATH);
		insertRows(PathManager.INSERT_WORD_SQL_PATH);
	}

	private void useDatabase() throws Exception {
		Class.forName(MYSQL_DRIVER);
		connection = DriverManager.getConnection(MYSQL_DATABASE_URL + MYSQL_DICTIONARY_PROPERTY, MYSQL_ID,
				MYSQL_PASSWORD);

	}

	private void createTable(String sqlPath) throws Exception {
		Scanner sc = null;
		try {
			System.out.println(PathManager.CREATE_SQL_PATH);
			sc = new Scanner(new File(sqlPath));
			String sql = "";

			while (sc.hasNext()) {
				sql += sc.nextLine() + "\n";
			}
			System.out.println(sql);
			PreparedStatement prepareStatement = null;
			try {
				prepareStatement = connection.prepareStatement(sql);
				prepareStatement.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		sc.close();
	}

	private void dropTable(String tableName) {
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = connection.prepareStatement(SQL_DROP_TABLE + tableName);
			prepareStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void insertRows(String sqlPath) {
		Scanner sc = null;
		try {
			System.out.println(PathManager.INSERT_WORD_SQL_PATH);
			sc = new Scanner(new File(sqlPath));
			String sql = "";

			while (sc.hasNext()) {
				PreparedStatement prepareStatement = null;
				try {
					sql = sc.nextLine();
					prepareStatement = connection.prepareStatement(sql);
					prepareStatement.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println(sql);
					return;
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		sc.close();
	}

	public static void main(String[] args) {
		DBManager dbManager = new DBManager();

	}

}