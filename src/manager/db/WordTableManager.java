package manager.db;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

import manager.ResourceManager;
import object.Word;

public class WordTableManager extends DictionaryDatabaseManager {
	private static final String INSERT_WORD_AUTO_INCREMENT_ID_SQL = "INSERT INTO word(name, def, category) VALUES(?, ?, ?)";
	private static final String SELECT_WORD_ALL_SQL = "SELECT * FROM word";
	private static final String SELECT_WORD_BY_ID_SQL = "select id,name,def,category from word WHERE id=?";
	private static final String SELECT_WORD_BY_NAME_SQL = "select id,name,def,category from word WHERE name=?";
	public WordTableManager() {
		useDatabase();
	}
	public void createWordTable() {
		Scanner sc = null;
		String sql = "";
		try {
			sc = new Scanner(new File(ResourceManager.CREATE_WORD_SQL_PATH));
			while (sc.hasNext()) {
				String temp = sc.nextLine() + " ";
				if (temp.equals("")) {
					continue;
				}
				sql += temp;
			}
			PreparedStatement prepareStatement = null;
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.execute();
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Vector<Word> select() {
		Vector<Word> words = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(SELECT_WORD_ALL_SQL);
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

	public Word selectById(int id) {
		Word word = null;
		try {

			PreparedStatement pstmt = connection.prepareStatement(SELECT_WORD_BY_ID_SQL);
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

	public Word selectByName(String name) {
		Word word = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(SELECT_WORD_BY_NAME_SQL);
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

	public void insert(Word word) {

		try {
			PreparedStatement pstmt = connection.prepareStatement(INSERT_WORD_AUTO_INCREMENT_ID_SQL);

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

	}

}
