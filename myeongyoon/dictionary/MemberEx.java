package dictionary;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.corba.se.pept.transport.Connection;

import dao.MemberDAO;
import dao.RootDAO;
import dto.MemberDTO;
import dto.WordDTO;

public class MemberEx extends MemberDAO {
	public static void select(int no) {
		MemberDTO mem = null;
		String sql = "";

		try {
			sql = "SELECT * FROM member WHERE no=?";
			PreparedStatement pstmt = open().prepareStatement(sql);
			System.out.println("연결");
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				mem = new MemberDTO();
				mem.setNo(rs.getInt(1));
				mem.setId(rs.getString(2));
				mem.setName(rs.getString(3));
				mem.setPhone(rs.getString(4));
				mem.setEtc(rs.getString(5));
				mem.setBirth(rs.getString(6));
				mem.setEmail(rs.getString(7));
				mem.setGender(rs.getString(8));
				mem.setPassword(rs.getString(9));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		
		
	}


	public static void main(String[] args) {
		select(1);
	}
}
