package service;

import model.Member;
import vo.StateVO;
import vo.StringVO;

public interface SignUpCheckService extends StateVO, StringVO, MemberService {
	public default String checkSignUpFormState(String result) {
		if (result.contains(FAIL)) {

			return result;
		} else {
			return SUCCESS;
		}
	}

	public default String getSignUpFormState(Member member) {

		String[] checkList = { DUPLICATE, EMPTY_STR };
		String result = "";
		for (int i = 0; i < checkList.length; i++) {
			switch (checkList[i]) {
			case DUPLICATE:
				result += duplicateCheck(member.getId());

			case EMPTY_STR:
				result += emptyCheck(member);
				return result;
			}
		}

		String blankCheckResult = emptyCheck(member);
		if (blankCheckResult.contains(FAIL)) {
			return blankCheckResult;
		}
		return SUCCESS;
	}

	public default String duplicateCheck(String id) {
		Member member = selectById(id);
		String result="";
		if (member != null) {
			result = FAIL + __ + ID + __ + DUPLICATE + ENTER;;
		}
		return  result;
	}

	public default String emptyCheck(Member member) {
		String result = "";
		if (member.getId().equals(EMPTY)) {
			result += FAIL + __ + ID + __ + EMPTY_STR + ENTER;

		}

		if (member.getEmail().equals(EMPTY)) {
			result += FAIL + __ + EMAIL + __ + EMPTY_STR + ENTER;

		}

		if (member.getEtc().equals(EMPTY)) {
			result += FAIL + __ + ETC + __ + EMPTY_STR + ENTER;

		}

		if (member.getGender().equals(EMPTY)) {
			result += FAIL + __ + GENDER + __ + EMPTY_STR + ENTER;

		}

		if (member.getBirth().equals(EMPTY)) {
			result += FAIL + __ + BIRTH + __ + EMPTY_STR + ENTER;

		}
		if (member.getName().equals(EMPTY)) {
			result += FAIL + __ + NAME + __ + EMPTY_STR + ENTER;

		}

		if (member.getPassword().equals(EMPTY)) {
			result += FAIL + __ + PASSWORD + __ + EMPTY_STR + ENTER;

		}

		if (member.getPhone().equals(EMPTY)) {
			result += FAIL + __ + PHONE + __ + EMPTY_STR + ENTER;

		}
		System.out.println("signupstateservice" + result);
		return result;

	}
}
