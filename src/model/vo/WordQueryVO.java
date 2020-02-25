package model.vo;

public interface WordQueryVO {	
	final String INSERT_WORD_AUTO_INCREMENT_ID_SQL = "INSERT INTO word(name, def, category) VALUES(?, ?, ?)";
	final String SELECT_WORD_ALL_SQL = "SELECT id,name,def,category FROM word";
}
