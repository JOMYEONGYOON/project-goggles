package service;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.MemberDAO;
import model.Member;
import view.frame.member.MemberSignUpFrame;

public class MemberService implements ActionListener {
	private MemberSignUpFrame memberSignUpFrame;
	public MemberService(MemberSignUpFrame memberSignUpFrame) {
		this.memberSignUpFrame = memberSignUpFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
		if (e.getActionCommand().contains("Sign Up")) {
			Member member = getMemberSignUpText();
			MemberDAO.insert(member);
		}

	}

	private Member getMemberSignUpText() {
		Member member = new Member();
		member.setId(memberSignUpFrame.idTF.getText());
		member.setName(memberSignUpFrame.nameTF.getText());
		member.setPhone(memberSignUpFrame.phoneTF.getText());
		member.setBirth(memberSignUpFrame.birthTF.getText());
		member.setEmail(memberSignUpFrame.emailTF.getText());
		member.setGender(memberSignUpFrame.genderCB.getSelectedItem().toString());
		member.setPassword(memberSignUpFrame.passwordTF.getText());
		member.setEtc(memberSignUpFrame.etcTF.getText());
		return member;
	}

}
