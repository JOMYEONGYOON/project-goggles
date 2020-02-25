package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import impl.vo.MySQLVO;
import impl.vo.StringVO;

public class RootDAO implements MySQLVO,  StringVO {
	private static Connection connection;

	public static Connection getConnection() {
		return connection;
	}

	public static Connection open() {
		if (connection == null) {

			try {
				Class.forName(MYSQL_DRIVER);
				connection = DriverManager.getConnection(MYSQL_DICTIONARY_URL, MYSQL_ID, MYSQL_PASSWORD);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(EXSIST);
		}
		return connection;

	}

	public static void close() {
		try {
			connection.close();
			System.out.println(MYSQL +__ +CLOSED);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}