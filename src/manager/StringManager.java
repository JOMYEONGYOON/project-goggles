package manager;

public class StringManager {
	public static final String  APP_EXIT = "EXIT";
	public static final String PARTICLE = "Particle";
	public static final String INDIE_FLOWER = "Indie Flower";
	public static final String DICTIONARY = "Dictionary";
	public static final String ROUND_FONT = "굴림체";
	public static final String WORD = "word";
	public static final String YES_NO = "(y/n)";
	public static final String Y = "y";
	public static final String NO = "n";
	public static final String PROGRAM_SHUTDOWN = "프로그램을 종료합니다";

	public static final String DATABASE = "Database";

	public static final String SQL_DROP_TABLE = "DROP TABLE ";
	public static final String CHECK_DELETE_TABLE = "지우고 다시 테이블을 생성하시겠습니까?" + YES_NO;
	public static final String CHECK_DELETE_DATABASE = "지우고 다시 데이터베이스를 생성하시겠습니까?" + YES_NO;
	public static final String DATABASE_CREATE_TABLE_ERROR = "테이블 생성에 실패";
	public static final String DATABASE_SQL_ERROR = "데이터베이스 SQL 오류";
	public static final String DATABASE_CLASS_NOT_FOUND_ERROR = "데이터베이스 클래스를 찾지 못한 오류";
	public static final String DATABASE_CREATE_SUCCESS_INFO = "데이터베이스생성 작업을 성공하였습니다.";
	public static final String DATABASE_INIT_ERROR = "데이터베이스 생성 오류";
	public static final String DATABASE_SETTING_SUCCESS = "데이터베이스 설정 완료";
	public static final String DATABASE_USE_ERROR = "데이터베이스 사용 오류";
	public final static String MYSQL_DATABASE_URL = "jdbc:mysql://localhost:3306/dictionary";
	public final static String MYSQL_DICTIONARY_PROPERTY = "?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
	public final static String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
	public final static String SQL_CREATE_DATABASE_IF_NOT_EXISTS = "CREATE DATABASE if not exists dictionary DEFAULT CHARSET=utf8";

	public static final String DELETED_TABLE = "테이블을 삭제하였습니다.";
	public static final String MEMBER = "member";
	public static final String DATABASE_SETTING_FAIL = "데이터베이스 생성 실패";
	public static final String ERROR = "ERROR";
	public static final String SET_DATA_BASE = "setDatabase()";
	public static final String YES_NO_CREATE_DATABASE_DICTIONARY = "`dictinoary` 사전 데이터 베이스를 생성하시겠습니까? (y/n)";
	public static final String YES_NO_CREATE_TABLE_MEMBER = "`member` 회원 테이블을 생성하시겠습니까? (y/n)";
	public static final String YES_NO_CREATE_TABLE_WORD = "`word` 사전 테이블을 생성하시겠습니까? (y/n)";
	public static String MYSQL_ID = "root";
	public static String MYSQL_PASSWORD = "1234";
	public static String MYSQL_URL = "jdbc:mysql://localhost:3306";

}
