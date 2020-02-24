package function.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import model.Word;

public class WordDAO extends RootDAO {
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

	public static Word selectById(int id) {
		Word word = null;
		String sql = "";
		try {
			sql = "select id,name,def,category from word WHERE id=?";
			PreparedStatement pstmt = open().prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				word = new Word();
				word.setId(rs.getInt(1));
				word.setName(rs.getString(2));
				word.setDef(rs.getString(3));
				word.setCatagory(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return word;
	}

	public static Word selectByName(String name) {
		String sql = "";
		Word word = null;
		try {
			sql = "select id,name,def,category from word WHERE name=?";
			PreparedStatement pstmt = open().prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				word = new Word();
				word.setId(rs.getInt(1));
				word.setName(rs.getString(2));
				word.setDef(rs.getString(3));
				word.setCatagory(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return word;
	}

	public static void insert(Word word) {
		String sql = "";

		try {
			sql = "INSERT INTO word(name, def, category) VALUES(?,?,?)";
			PreparedStatement pstmt = open().prepareStatement(sql);

			System.out.println("---");

			pstmt.setString(1, word.getName());

			pstmt.setString(2, word.getDef());
			pstmt.setString(3, word.getCatagory());
			pstmt.execute();

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Word word = new Word();
		word.setName("java");
		word.setDef("프로그래밍");
		word.setCatagory("IT");
		WordDAO.insert(word);

	}

}
