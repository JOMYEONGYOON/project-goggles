package impl.method;

import dao.MemberDAO;
import dto.MemberDTO;

public interface IdExistCheckable {
	public default MemberDTO selectById(String id) {
		return MemberDAO.selectById(id);
	}
}
