package test.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import function.dao.RootDAO;
import model.Word;

public class WordSelectDAO extends RootDAO {
	public static Vector<Word> select() {
		Vector<Word> words = null;
		String sql = "";
		try {
			sql = "select id,name,def,category from word";
			PreparedStatement pstmt = open().prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			words = new Vector<Word>();
			while (rs.next()) {
				Word word = new Word();
				word.setId(rs.getInt(1));
				word.setName(rs.getString(2));
				word.setDef(rs.getString(3));
				word.setCatagory(rs.getString(4));
				words.add(word);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return words;
	}
}