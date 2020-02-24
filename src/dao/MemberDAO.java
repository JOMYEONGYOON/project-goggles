package dao;

import java.sql.PreparedStatement;

import model.Member;

public class MemberDAO extends RootDAO {
	public  void insert(Member member) {

		String sql;
		try {
			sql = "INSERT INTO member(id,name,phone,birth,email,gender,password, etc) VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = open().prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getPhone());
			pstmt.setString(4, member.getBirth());
			pstmt.setString(5, member.getEmail());
			pstmt.setString(6, member.getGender());
			pstmt.setString(7, member.getPassword());
			pstmt.setString(8, member.getEtc());
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}