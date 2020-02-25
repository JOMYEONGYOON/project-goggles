package service;

import dao.MemberDAO;
import model.Member;

public interface MemberService {
	public default Member selectById(String id) {
		return MemberDAO.selectById(id);
	}
}
