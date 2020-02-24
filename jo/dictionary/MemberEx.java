package dictionary;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.corba.se.pept.transport.Connection;

import dao.MemberDAO;
import dao.RootDAO;
import model.Member;
import model.Word;

public class MemberEx extends MemberDAO {
	public static void Select(int id) {
		Member mem = null;
		String sql = "";

		try {
			sql = "SELECT id,birth,eamil,etc,gender,no,password,phone,name FROM member WHERE id=?";
			PreparedStatement pstmt = open().prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
//			while (rs.next()) {
//				mem = new mem();
//				mem.setBirth(birth);
//				mem.setEmail(email);				
//				mem.setEtc(etc);
//				mem.setGender(gender);
//				mem.setId(id);
//				mem.setNo(no);
//				mem.setPassword(password);
//				mem.setPhone(phone);
//				mem.setName(name);
//				
//			}
		

			

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public static Word selectById(int id) {
//		Word word = null;
//		String sql = "";
//		try {
//			sql = "select id,name,def,category from word WHERE id=?";
//			PreparedStatement pstmt = open().prepareStatement(sql);
//			pstmt.setInt(1, id);
//			ResultSet rs = pstmt.executeQuery();
//			while (rs.next()) {
//				word = new Word();
//				word.setId(rs.getInt(1));
//				word.setName(rs.getString(2));
//				word.setDef(rs.getString(3));
//				word.setCatagory(rs.getString(4));
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return word;
//	}
//}
//}
	public static void main(String[] args) {

	}
}
