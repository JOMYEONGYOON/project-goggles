package manager;

import java.sql.Connection;
import java.sql.DriverManager;

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

}
