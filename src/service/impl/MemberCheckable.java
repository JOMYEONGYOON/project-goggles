package service.impl;

import dao.MemberDAO;
import dto.MemberDTO;

public interface MemberCheckable {
	public default MemberDTO selectById(String id) {
		return MemberDAO.selectById(id);
	}
}
