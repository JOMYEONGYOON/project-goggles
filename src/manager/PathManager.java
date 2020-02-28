package manager;

public class PathManager {
	public static final String PATH_NOT_FOUND_ERROR = "파일을 찾지 못하였습니다."; 
	public static final String APP_PATH = System.getProperty("user.dir");
	public static final String PARTICLE_IMG_PATH = APP_PATH + "\\resources\\image\\particle.jpg";
	public static final String CREATE_SQL_PATH = APP_PATH+ "\\src\\sql\\create";
	public static final String CREATE_MEMBER_SQL_PATH = CREATE_SQL_PATH+"\\member.sql";
	public static final String CREATE_DICTIONARY_SQL_PATH = CREATE_SQL_PATH+"\\dictionary.sql";
	public static final String CREATE_WORD_SQL_PATH = CREATE_SQL_PATH+"\\word.sql";
	public static final String INSERT_SQL_PATH = APP_PATH+"\\src\\sql\\insert";
	public static final String INSERT_MEMBER_SQL_PATH = INSERT_SQL_PATH + "\\member.sql";
	public static final String INSERT_WORD_SQL_PATH = INSERT_SQL_PATH + "\\word.sql";

}