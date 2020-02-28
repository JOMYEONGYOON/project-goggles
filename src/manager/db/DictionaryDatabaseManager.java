package manager.db;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import manager.PathManager;
import manager.StringManager;

public class DictionaryDatabaseManager {

	// 데이터베이스 연결 객체
	public static Connection connection;

	public DictionaryDatabaseManager() {
		setDatabase();
	}

	private void newDatabase() throws Exception {
		PreparedStatement prepareStatement = connection
				.prepareStatement(StringManager.SQL_CREATE_DATABASE_IF_NOT_EXISTS);
		prepareStatement.execute();
	}

	private void setDatabase() {
		try {
			Class.forName(StringManager.MYSQL_DRIVER);
			connection = DriverManager.getConnection(StringManager.MYSQL_URL + StringManager.MYSQL_DICTIONARY_PROPERTY,
					StringManager.MYSQL_ID, StringManager.MYSQL_PASSWORD);
			
			Scanner sc = new Scanner(System.in);
			System.out.print(StringManager.YES_NO_CREATE_TABLE_WORD);
			String answer = sc.nextLine();
			if (answer.equals("y") || answer.equals("Y")) {
				System.out.println(answer);
			}else {
				System.out.println(answer);
			}
			sc.close();
			newDatabase();
			useDatabase();
			createTable();
		} catch (SQLException e) {
			System.err.printf("%s %s %s",getClass().getName(), StringManager.ERROR);
			System.err.println(StringManager.APP_EXIT);
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.printf("%s %s %s",getClass().getName(), StringManager.SET_DATA_BASE,StringManager.ERROR);
			System.err.println(StringManager.APP_EXIT);
			System.exit(0);
		}
		System.out.println(StringManager.DATABASE_SETTING_SUCCESS);
	}

	private void createTable() {
		try {
			createTable(PathManager.CREATE_MEMBER_SQL_PATH);
			createTable(PathManager.CREATE_WORD_SQL_PATH);
		} catch (SQLException e) {
			dropTable(StringManager.MEMBER);
			dropTable(StringManager.WORD);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void useDatabase() throws Exception {
		Class.forName(StringManager.MYSQL_DRIVER);
		connection = DriverManager.getConnection(
				StringManager.MYSQL_DATABASE_URL + StringManager.MYSQL_DICTIONARY_PROPERTY, StringManager.MYSQL_ID,
				StringManager.MYSQL_PASSWORD);

	}

	private void createTable(String sqlPath) throws Exception {
		Scanner sc = null;
		System.out.println(PathManager.CREATE_SQL_PATH);
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

	private void dropTable(String tableName) {
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = connection.prepareStatement(StringManager.SQL_DROP_TABLE + tableName);
			prepareStatement.execute();
		} catch (SQLException e) {
			System.err.printf("%s %s %s",getClass().getName(), Exception.class.getName(), StringManager.ERROR);
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
		DictionaryDatabaseManager dbManager = new DictionaryDatabaseManager();

	}

}