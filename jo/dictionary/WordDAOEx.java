package dictionary;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.RootDAO;

//WordInsertDAOTest �����ͺ��̽� ������ �����ϴ� 
//�Է� �޼ҵ� �ۼ�
//class WordInsertDAOTest extends RootDAO {
//	public void insert(Word word) {
//		String sql;
//
//		try {
//			sql = "INSERT INTO word(name,category,def) VALUES(?,?,?)";
//			PreparedStatement pstmt = open().prepareStatement(sql);
//
//			System.out.println("---");
//
//			pstmt.setString(1, word.getName());
//			pstmt.setString(2, word.getCatagory());
//			pstmt.setString(3, word.getDef());
//			pstmt.executeUpdate(sql);
//
//		}
//
//		catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//}

public class WordDAOEx extends RootDAO {
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
		WordDAOEx.insert(word);


	}

}
