package function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import option.DBOption;

public interface DBConnectable  {
	public static Connection connect() {
		Connection connection = null;
		try {
			Class.forName(DBOption.MYSQL_DRIVER);
			connection = DriverManager.getConnection(DBOption.MYSQL_URL, DBOption.MYSQL_ID, DBOption.MYSQL_PASSWORD);
			System.out.println(connection);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return connection;
	}
	public static void disconnect(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
