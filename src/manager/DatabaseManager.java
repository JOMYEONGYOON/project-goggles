package manager;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import object.MySQL;

public class DatabaseManager {
	protected MySQL mySQL;

	// 데이터베이스 연결 객체
	protected static Connection connection;

	public void connect(MySQL mySQL) throws Exception {
		this.mySQL = mySQL;
		Class.forName(ResourceManager.MYSQL_DRIVER);
		connection = DriverManager.getConnection(
				ResourceManager.MYSQL_JDBC_URL + mySQL.getIp() + ":" + mySQL.getPort() + mySQL.getProperties(),
				mySQL.getId(), mySQL.getPassword());

	}

	public void executeQueryByFile(File file) throws Exception {
		PreparedStatement prepareStatement = connection
				.prepareStatement(ResourceManager.SQL_CREATE_DATABASE_IF_NOT_EXISTS);
		prepareStatement.execute();
	}
	public void executeUpdateQueryByFile(File file) throws Exception {
		PreparedStatement prepareStatement = connection
				.prepareStatement(ResourceManager.SQL_CREATE_DATABASE_IF_NOT_EXISTS);
		prepareStatement.execute();
	}
	public void createTable() {
		Scanner sc = new Scanner(System.in);
		System.out.print(ResourceManager.YES_NO_CREATE_TABLE);
		String answer = sc.next();
		if (answer.equals("y") || answer.equals("Y")) {
			useDatabase();
		} else {
			System.err.println(ResourceManager.PROGRAM_SHUTDOWN);
			System.exit(0);
		}
		createTable();
		try {
			createTable(ResourceManager.CREATE_MEMBER_SQL_PATH);
			createTable(ResourceManager.CREATE_WORD_SQL_PATH);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();

	}

	public void useDatabase() {
		try {
			Class.forName(ResourceManager.MYSQL_DRIVER);
			connection = DriverManager.getConnection(
					ResourceManager.MYSQL_DATABASE_URL + ResourceManager.MYSQL_DICTIONARY_PROPERTY,
					ResourceManager.MYSQL_ID, ResourceManager.MYSQL_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void createTable(String sqlPath) throws Exception {
		Scanner sc = null;
		System.out.println(ResourceManager.CREATE_SQL_PATH);
		sc = new Scanner(new File(sqlPath));
		String sql = "";

		while (sc.hasNext()) {

			String temp = sc.nextLine() + " ";
			if (temp.equals("")) {
				continue;
			}
			sql += temp;

		}
		PreparedStatement prepareStatement = null;
		prepareStatement = connection.prepareStatement(sql);
		prepareStatement.execute();
		sc.close();
	}

	public void dropTable(String tableName) {
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = connection.prepareStatement(ResourceManager.SQL_DROP_TABLE + tableName);
			prepareStatement.execute();
		} catch (SQLException e) {
			System.err.printf("%s %s %s", getClass().getName(), Exception.class.getName(), ResourceManager.ERROR);
		}
	}

}
