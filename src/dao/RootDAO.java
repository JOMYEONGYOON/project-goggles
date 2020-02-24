package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RootDAO {
	protected static Connection connection;

	public Connection getConnection() {
		return connection;
	}
	public static Connection open() {
		if (connection == null) {
			String dbName = "dictionary";
			String id = "root";
			String password = "1234";
			String selected_dbType = "mysql";
			String properties = "?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
			String selected_driver = "com.mysql.cj.jdbc.Driver";
			String selected_url = "jdbc:mysql://localhost:3306/";
			try {
				Class.forName(selected_driver);
				connection = DriverManager.getConnection(selected_url + dbName + properties, id, password);
				System.out.println(selected_dbType + " connected");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(selected_dbType + " error");
			}
		}else {
			System.out.println("already connected mysql");
		}
		return connection;
		
	}

	public static void close() {
		try {
			connection.close();
			System.out.println("mysql closed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
//		open();
//		close();
	}
}
