package controller;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import impl.vo.StringVO;
import model.view.SignInFrame;
import service.SignInService;

public class SignInController implements StringVO {
	private SignInService service;
	private SignInFrame view;
	
	public void newInstance() {
		view.getRightPanel().add(new JPanel());
		view.getPanel_12().add(new JPanel());
		view.getRightPanel().setLayout(new GridLayout(3, 1, 0, 0)));
		view.getPanel_12().setLayout(new GridLayout(0, 1, 0, 0)));
		view.getExitButton().add(new JButton(EXIT));
		view.getLeftPanel().add(new JPanel());
		view.getPanel_0().add(new JPanel());
		view.getLblNewLabel_1().add(new JLabel(StringVO.ID));
		view.getPanel_1().add(new JPanel());
		view.getLblNewLabel_7().add(new JLabel(StringVO.PASSWORD));
		view.getTopPanel().add(new JPanel());
		view.getSignInLabel().add(new JLabel(SIGN_IN));
		view.getPanel_8().add(new JPanel());
		view.getBottomPanel().add(new JPanel());
		view.getPanel_9().add(new JPanel());
		view.getCenterPanel().add(new JPanel());
		view.getIdTF().add(new JTextField());
		view.getPasswordTF().add(new JPasswordField());
	}
}
