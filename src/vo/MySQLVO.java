package vo;

public interface MySQLVO {
	final String MYSQL_DB_NAME = "dictionary";
	final String MYSQL_ID = "root";
	final String MYSQL_PASSWORD = "1234";
	final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
//	final String MYSQL_URL = "jdbc:mysql://localhost:3306/?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
	final String MYSQL_DICTIONARY_URL = "jdbc:mysql://localhost:3306/dictionary?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
}
