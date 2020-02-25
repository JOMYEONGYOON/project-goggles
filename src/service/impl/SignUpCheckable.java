package service.impl;

import javax.swing.JTextField;

import dto.MemberDTO;
import model.view.SignUpFrame;
import model.vo.StringVO;

public interface SignUpCheckable extends StringVO, MemberCheckable {
	public default boolean checkComponent(JTextField idTF) {
		String idTextFieldText = idTF.getText();
		return true;
	}

	public default  MemberDTO getMemberByFrame(SignUpFrame frame) {
		MemberDTO member = new MemberDTO();
		member.setId(frame.getIdTF().getText());
		member.setName(frame.getNameTF().getText());
		member.setPhone(frame.getPhoneTF().getText());
		member.setBirth(frame.getBirthTF().getText());
		member.setEmail(frame.getEmailTF().getText());
		member.setGender(frame.getGenderCB().getSelectedItem().toString());
		member.setPassword(frame.getPasswordTF().getText());
		member.setEtc(frame.getEtcTF().getText());
		return member;
	}
}
