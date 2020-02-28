package manager.db;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import manager.ResourceManager;
import object.MySQL;

public class DictionaryDatabaseManager {

	// 데이터베이스 연결 객체
	protected static Connection connection;
	protected MySQL mySQL;

	public void connect(MySQL mySQL) throws Exception {
		this.mySQL = mySQL;
		Class.forName(ResourceManager.MYSQL_DRIVER);
		connection = DriverManager.getConnection(ResourceManager.MYSQL_JDBC_URL + mySQL.getIp() + ":"
				+ ResourceManager.MYSQL_PORT + mySQL.getProperties(), mySQL.getId(), ResourceManager.MYSQL_PASSWORD);
	}

	public void createDatabase() {
		if (connection == null) {
			System.err.println("데이터베이스 접속(연결)부터 해야합니다.");
			return;
		} else {
			try {

				Scanner sc = new Scanner(System.in);
				System.out.print(ResourceManager.YES_NO_CREATE_DATABASE_DICTIONARY);
				String answer = sc.nextLine();
				if (answer.equals("y") || answer.equals("Y")) {
					PreparedStatement prepareStatement = connection
							.prepareStatement(ResourceManager.SQL_CREATE_DATABASE_IF_NOT_EXISTS);
					prepareStatement.execute();
					useDatabase();

				} else {
					System.err.println(ResourceManager.PROGRAM_SHUTDOWN);
					System.exit(0);
				}

				sc.close();
			} catch (SQLException e) {
				System.err.printf("%s %s %s", getClass().getName(), ResourceManager.ERROR);
				System.err.println(ResourceManager.PROGRAM_SHUTDOWN);
				System.exit(0);
			} catch (Exception e) {
				e.printStackTrace();
				System.err.printf("%s %s %s", getClass().getName(), ResourceManager.SET_DATA_BASE,
						ResourceManager.ERROR);
				System.err.println(ResourceManager.PROGRAM_SHUTDOWN);
				System.exit(0);
			}
			System.out.println(ResourceManager.DATABASE_SETTING_SUCCESS);
		}

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

	public void insertRows(String sqlPath) {
		Scanner sc = null;
		try {
			System.out.println(ResourceManager.INSERT_WORD_SQL_PATH);
			sc = new Scanner(new File(sqlPath));
			String sql = "";
			while (sc.hasNext()) {
				PreparedStatement prepareStatement = null;
				try {
					System.out.println(sql);
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
			System.err.println(ResourceManager.ALREADY_INSERTED_TABLE_DATA);
		}
		sc.close();
	}

	public static void main(String[] args) {

	}

}