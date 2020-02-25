package service;

import model.Member;
import vo.StateVO;
import vo.StringVO;

public interface SignUpCheckService extends StateVO, StringVO, MemberService {

	public default String checkSignUpForm(Member member) {

		String[] checkList = { DUPLICATE, EMPTY_STR };
		String result ="";
		for (int i=0; i<checkList.length;i++) {
			switch(checkList[i]) {
			case  DUPLICATE:
				 result += duplicateCheck(member.getId());
			case EMPTY_STR:
				
			}
		}
//		String result = duplicateCheck(member.getId());
//
//		if (result.contains(FAIL)) {
//			return FAIL+;
//		}
//		result = emptyCheck(member);
//		if (result.contains(FAIL)) {
//			return FAIL;
//		}

		String blankCheckResult = emptyCheck(member);
		if (blankCheckResult.contains(FAIL)) {
			return blankCheckResult;
		}
//		if (member.getId()) {
//			return false;
//		}
//		if (member.getName()) {
//			return false;
//		}
//		if (member.get) {
//			return false;
//		}
//		if (member.get) {
//			return false;
//		}
//		if (member.get) {
//
//		}
//		if (member.get) {
//
//		}
//		if (member.get) {
//
//		}

		return SUCCESS;
	}

	public default String duplicateCheck(String id) {
		Member member = selectById(id);

		if (member != null) {
			return FAIL + __ + ID + __ + DUPLICATE;
		} else {
			return SUCCESS;
		}
	}

	public default String emptyCheck(Member member) {
		String result = "";
		if (member.getId().equals(EMPTY)) {
			result += FAIL + __ + ID + __ + EMPTY_STR + ENTER;
			return result;
		}

		if (member.getEmail().equals(EMPTY)) {
			result += FAIL + __ + EMAIL + __ + EMPTY_STR + ENTER;
			return result;
		}

		if (member.getEtc().equals(EMPTY)) {
			result += FAIL + __ + ETC + __ + EMPTY_STR + ENTER;
			return result;
		}

		if (member.getGender().equals(EMPTY)) {
			result += FAIL + __ + GENDER + __ + EMPTY_STR + ENTER;
			return result;
		}

		if (member.getBirth().equals(EMPTY)) {
			result += FAIL + __ + BIRTH + __ + EMPTY_STR + ENTER;
			return result;
		}
		if (member.getName().equals(EMPTY)) {
			result += FAIL + __ + NAME + __ + EMPTY_STR + ENTER;
			return result;
		}

		if (member.getPassword().equals(EMPTY)) {
			result += FAIL + __ + PASSWORD + __ + EMPTY_STR + ENTER;
			return result;
		}

		if (member.getPhone().equals(EMPTY)) {
			result += FAIL + __ + PHONE + __ + EMPTY_STR + ENTER;
			return result;
		}
		return SUCCESS;

	}
}
