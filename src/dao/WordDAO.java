package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import dto.WordDTO;

public class WordDAO extends RootDAO {
	public static Vector<WordDTO> select() {
		Vector<WordDTO> words = null;
		String sql = "";
		try {
			sql = "select id,name,def,category from word";
			PreparedStatement pstmt = open().prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			words = new Vector<WordDTO>();
			while (rs.next()) {
				WordDTO word = new WordDTO();
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

	public static WordDTO selectById(int id) {
		WordDTO word = null;
		String sql = "";
		try {
			sql = "select id,name,def,category from word WHERE id=?";
			PreparedStatement pstmt = open().prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				word = new WordDTO();
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

	public static WordDTO selectByName(String name) {
		String sql = "";
		WordDTO word = null;
		try {
			sql = "select id,name,def,category from word WHERE name=?";
			PreparedStatement pstmt = open().prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				word = new WordDTO();
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

	public static void insert(WordDTO word) {
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
		WordDTO word = new WordDTO();
		word.setName("java");
		word.setDef("프로그래밍");
		word.setCatagory("IT");
		WordDAO.insert(word);

	}

}
