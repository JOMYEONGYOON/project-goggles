package manager.db;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import manager.ResourceManager;
import object.Member;

public class MemberTableManager extends DictionaryDatabaseManager {
	final static String SELECT_MEMBER_BY_ID_SQL = "SELECT id,name,def,category FROM word WHERE id=?";
	final static String SELECT_MEMBER_BY_NAME_SQL = "SELECT id,name,def,category FROM word WHERE name=?";
	final static String INSERT_MEMBER_AUTO_INCREMENT_NO_SQL = "INSERT INTO member(id,name,phone,birth,email,gender,password, etc) VALUES(?,?,?,?,?,?,?,?)";
	final static String SELECT_MEMBER_CHECK_ID_PASSWORD_SQL = "SELECT * FROM member WHERE id=? AND password=?";

	public MemberTableManager() {
		useDatabase();
	}

	public void createMemberTable() {
		Scanner sc = null;
		String sql = "";
		try {
			sc = new Scanner(new File(ResourceManager.CREATE_MEMBER_SQL_PATH));
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

	public Member selectById(String id) {
		Member member = null;
		try {
			PreparedStatement pstmt = connection.prepareStatement(SELECT_MEMBER_BY_ID_SQL);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				member = new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}

	public void insert(Member member) {

		try {
			PreparedStatement pstmt = connection.prepareStatement(INSERT_MEMBER_AUTO_INCREMENT_NO_SQL);
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

	public boolean checkIdPassword(String id, String password) {
		try {
			PreparedStatement pstmt = connection.prepareStatement(SELECT_MEMBER_CHECK_ID_PASSWORD_SQL);
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