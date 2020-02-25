package test.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import dao.RootDAO;
import dto.WordDTO;

public class WordSelectDAOTest extends RootDAO {
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
	
	public static void updateWordById() {
		String sql = "";
		WordDTO word = null;
		try {
			sql = "update word set id=?,name,def,category from word WHERE id=?";
			PreparedStatement pstmt = open().prepareStatement(sql);
//			pstmt.setString(1, name);
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
//		return word;
	}
	
	

	public static void main(String[] args) {
		Vector<WordDTO> vector = WordSelectDAOTest.select();
		System.out.println(vector.size());
		for (int i = 0; i < vector.size(); i++) {
			WordDTO word = vector.get(i);
			
			
		}
		WordDTO word = WordSelectDAOTest.selectById(1);
		System.out.println(word.getCatagory());
		System.out.println(word.getDef());
		System.out.println(word.getId());
		System.out.println(word.getName());
	}
}