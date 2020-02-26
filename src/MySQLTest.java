
import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLTest {
	// 데이터베이스 연결 객체
	public static Connection connection;

	// 데이터베이스 접속 아이디
	final static String MYSQL_ID = "root";

	// 데이터베이스 비밀번호
	final static String MYSQL_PASSWORD = "1234";

	// MySQL 접속할 떄 필요한 드라이버 이름
	final static String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";

	// 데이터베이스 접속 주소, 자신의 컴퓨터
	final static String MYSQL_URL = "jdbc:mysql://localhost:3306";
	final static String MYSQL_DICTIONARY_PROPERTY = "?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";

	// MySQL 생성자
	public static void main(String[] args) {
		System.out.println("#데이터베이스 연결시작");
		try {
			// MySQL 로드
			Class.forName(MYSQL_DRIVER);

			// 연결
			connection = DriverManager.getConnection(MYSQL_URL + MYSQL_DICTIONARY_PROPERTY, MYSQL_ID, MYSQL_PASSWORD);

			// 연결 확인
			System.out.println("#데이터베이스 연결성공" + connection);

			// 데이터베이스 생성

		} catch (Exception e) {
			// 연결 실패 예외;
			System.err.println("#데이터베이스 연결 실패");
			System.err.println("#데이터베이스 연결 실패 원인 시작");
			e.printStackTrace();
			System.err.println("#데이터베이스 연결 실패 원인 종료");
			System.err.println("#프로그램종료");
			return;
		}
		System.out.println("데이터 생성을  3초뒤에 시작합니다.");
		int count = 3;
		while (count > 0) {
			try {
				System.out.println(count--);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		createDictionaryDatabase();
	}

	public static void createDictionaryDatabase() {
		System.out.println("\n#데이터베이스생성시작");
		System.out.println("데이터베이스를 생성하기 위해\ndictionary_create.sql" + "파일을 읽습니다.");

	}

}