package impl.method;

import javax.swing.JTextField;

import com.google.gson.Gson;

import dto.MemberDTO;
import impl.vo.StringVO;
import model.view.SignUpFrame;

public interface SignUpCheckable extends StringVO {
	public default boolean checkMemberIdByName(JTextField idTF) {
		String idTextFieldText = idTF.getText();
		return true;
	}

	public default MemberDTO getMemberByFrame(SignUpFrame frame) {

		MemberDTO member = new MemberDTO();
		member.setId(frame.getIdTF().getText());
		member.setName(frame.getNameTF().getText());
		member.setPhone(frame.getPhoneTF().getText());
		member.setBirth(frame.getBirthTF().getText());
		member.setEmail(frame.getEmailTF().getText());
		member.setGender(frame.getGenderCB().getSelectedItem().toString());
		member.setPassword(frame.getPasswordTF().getText());
		member.setEtc(frame.getEtcTF().getText());
		Gson gson = new Gson();
		String jsonStr = gson.toJson(member);
		System.out.println(jsonStr);
		return member;
	}
}
