package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.MemberDTO;
import model.vo.MemberQueryVO;
import model.vo.StringVO;

public class MemberDAO extends RootDAO implements MemberQueryVO,StringVO{
	public static MemberDTO selectById(String id) {
		MemberDTO member = null;
		try {
			PreparedStatement pstmt = open().prepareStatement(SELECT_MEMBER_BY_ID_SQL);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				member = new MemberDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}

	public static void insert(MemberDTO member) {

		try {
			PreparedStatement pstmt = open().prepareStatement(INSERT_MEMBER_AUTO_INCREMENT_NO_SQL);
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

	public static boolean checkIdPassword(String id, String password) {
		try {
			PreparedStatement pstmt = open().prepareStatement(SELECT_MEMBER_CHECK_ID_PASSWORD_SQL);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

}