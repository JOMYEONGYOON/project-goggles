package manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import object.MySQL;

public class DatabaseManager {
	protected MySQL mySQL;

	// 데이터베이스 연결 객체
	protected Connection connection;

	public void connect(MySQL mySQL) throws Exception {
		this.mySQL = mySQL;
		Class.forName(ResourceManager.MYSQL_DRIVER);
		connection = DriverManager.getConnection(
				ResourceManager.MYSQL_JDBC_URL + mySQL.getIp() + ":" + mySQL.getPort() + mySQL.getProperties(),
				mySQL.getId(), mySQL.getPassword());

	}

	public void executeQueryByFile(File file) throws Exception {
		
		String sql= "";
		Scanner sc = new Scanner(file);
		System.out.println("test");
		while(sc.hasNext()) {
			sql += sc.nextLine()+"\n";
		}
		System.out.println(sql);
		PreparedStatement prepareStatement = connection
				.prepareStatement(sql);
		prepareStatement.execute();
		sc.close();
	}
	public void executeUpdateQueryByFile(File file) throws Exception {
//		PreparedStatement prepareStatement = connection
//				.prepareStatement(ResourceManager.SQL_CREATE_DATABASE_IF_NOT_EXISTS);
//		prepareStatement.executeUpdate();
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
		} catch (Exception e) {
			e.printStackTrace();
		} 
		sc.close();

	}

	public void useDatabase() {
		PreparedStatement prepareStatement = connection
				.prepareStatement("use"+ this.mySQL.getDatabase() );
		prepareStatement.execute();

	}

	public void createTable(String sqlPath) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(sqlPath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "";

		while (sc.hasNext()) {

			String temp = sc.nextLine() + " ";
			if (temp.equals("")) {
				continue;
			}
			sql += temp;

		}
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = connection.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prepareStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
