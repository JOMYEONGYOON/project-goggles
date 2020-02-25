package model.vo;

public interface MemberQueryVO {
	final String SELECT_MEMBER_BY_ID_SQL= "SELECT id,name,def,category FROM word WHERE id=?";
	final String SELECT_MEMBER_BY_NAME_SQL = "SELECT id,name,def,category FROM word WHERE name=?";
	final String INSERT_MEMBER_AUTO_INCREMENT_NO_SQL = "INSERT INTO member(id,name,phone,birth,email,gender,password, etc) VALUES(?,?,?,?,?,?,?,?)";
	final String SELECT_MEMBER_CHECK_ID_PASSWORD_SQL = "SELECT * FROM member WHERE id=? AND password=?";
	
}
