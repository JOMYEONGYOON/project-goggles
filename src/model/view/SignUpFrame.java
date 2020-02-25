package model.view;

import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.SignUpController;

public class SignUpFrame extends RootFrame {
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private JTextField birthTF;
	private JPanel bottomPanel;
	private JButton button;
	private JButton cancelButton;
	private JPanel centerPanel;
	private JButton checkButton;
	private SignUpController controller;
	private JTextField emailTF;
	private JTextField etcTF;
	private JComboBox genderCB;
	private JTextField idTF;
	private JLabel lblBio;
	private JLabel lblBirth;
	private JLabel lblEmail;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblPhone;
	private JPanel leftPanel;
	private JTextField nameTF;
	private JPanel panel_0;
	private JPanel panel_1;
	private Panel panel_10;
	private Panel panel_11;
	private JPanel panel_12;
	private JPanel panel_14;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;

	private JPasswordField passwordTF;

	private JTextField phoneTF;

	private JButton resetButton;

	private JPanel rightPanel;

	private JFrame service;

	private JButton signUpBtn;

	private JLabel signUpLabel;

	private JPanel topPanel;

	public JTextField getBirthTF() {
		return birthTF;
	}

	public JPanel getBottomPanel() {
		return bottomPanel;
	}

	public JButton getButton() {
		return button;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public JPanel getCenterPanel() {
		return centerPanel;
	}

	public JButton getCheckButton() {
		return checkButton;
	}

	public SignUpController getController() {
		return controller;
	}

	public JTextField getEmailTF() {
		return emailTF;
	}

	public JTextField getEtcTF() {
		return etcTF;
	}

	public JComboBox getGenderCB() {
		return genderCB;
	}

	public JTextField getIdTF() {
		return idTF;
	}

	public JLabel getLblBio() {
		return lblBio;
	}

	public JLabel getLblBirth() {
		return lblBirth;
	}

	public JLabel getLblEmail() {
		return lblEmail;
	}

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public JLabel getLblNewLabel_2() {
		return lblNewLabel_2;
	}

	public JLabel getLblNewLabel_3() {
		return lblNewLabel_3;
	}

	public JLabel getLblNewLabel_4() {
		return lblNewLabel_4;
	}

	public JLabel getLblNewLabel_5() {
		return lblNewLabel_5;
	}

	public JLabel getLblNewLabel_6() {
		return lblNewLabel_6;
	}

	public JLabel getLblNewLabel_7() {
		return lblNewLabel_7;
	}

	public JLabel getLblNewLabel_8() {
		return lblNewLabel_8;
	}

	public JLabel getLblPhone() {
		return lblPhone;
	}

	public JPanel getLeftPanel() {
		return leftPanel;
	}

	public JTextField getNameTF() {
		return nameTF;
	}

	public JPanel getPanel_0() {
		return panel_0;
	}

	public JPanel getPanel_1() {
		return panel_1;
	}

	public Panel getPanel_10() {
		return panel_10;
	}

	public Panel getPanel_11() {
		return panel_11;
	}

	public JPanel getPanel_12() {
		return panel_12;
	}

	public JPanel getPanel_14() {
		return panel_14;
	}

	public JPanel getPanel_2() {
		return panel_2;
	}

	public JPanel getPanel_3() {
		return panel_3;
	}

	public JPanel getPanel_4() {
		return panel_4;
	}

	public JPanel getPanel_5() {
		return panel_5;
	}

	public JPanel getPanel_6() {
		return panel_6;
	}

	public JPanel getPanel_7() {
		return panel_7;
	}

	public JPanel getPanel_8() {
		return panel_8;
	}

	public JPanel getPanel_9() {
		return panel_9;
	}

	public JPasswordField getPasswordTF() {
		return passwordTF;
	}

	public JTextField getPhoneTF() {
		return phoneTF;
	}

	public JButton getResetButton() {
		return resetButton;
	}

	public JPanel getRightPanel() {
		return rightPanel;
	}

	public JFrame getService() {
		return service;
	}

	public JButton getSignUpBtn() {
		return signUpBtn;
	}

	public JLabel getSignUpLabel() {
		return signUpLabel;
	}

	public JPanel getTopPanel() {
		return topPanel;
	}

	public void initComponents() {

	}

	public void setBirthTF(JTextField birthTF) {
		this.birthTF = birthTF;
	}

	public void setBottomPanel(JPanel bottomPanel) {
		this.bottomPanel = bottomPanel;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

	public void setCancelButton(JButton cancelButton) {
		this.cancelButton = cancelButton;
	}

	public void setCenterPanel(JPanel centerPanel) {
		this.centerPanel = centerPanel;
	}

	public void setCheckButton(JButton checkButton) {
		this.checkButton = checkButton;
	}

	public void setController(SignUpController controller) {
		this.controller = controller;
	}

	public void setEmailTF(JTextField emailTF) {
		this.emailTF = emailTF;
	}

	public void setEtcTF(JTextField etcTF) {
		this.etcTF = etcTF;
	}

	public void setGenderCB(JComboBox genderCB) {
		this.genderCB = genderCB;
	}

	public void setIdTF(JTextField idTF) {
		this.idTF = idTF;
	}

	public void setLblBio(JLabel lblBio) {
		this.lblBio = lblBio;
	}

	public void setLblBirth(JLabel lblBirth) {
		this.lblBirth = lblBirth;
	}

	public void setLblEmail(JLabel lblEmail) {
		this.lblEmail = lblEmail;
	}

	public void setLblNewLabel_1(JLabel lblNewLabel_1) {
		this.lblNewLabel_1 = lblNewLabel_1;
	}

	public void setLblNewLabel_2(JLabel lblNewLabel_2) {
		this.lblNewLabel_2 = lblNewLabel_2;
	}

	public void setLblNewLabel_3(JLabel lblNewLabel_3) {
		this.lblNewLabel_3 = lblNewLabel_3;
	}

	public void setLblNewLabel_4(JLabel lblNewLabel_4) {
		this.lblNewLabel_4 = lblNewLabel_4;
	}

	public void setLblNewLabel_5(JLabel lblNewLabel_5) {
		this.lblNewLabel_5 = lblNewLabel_5;
	}

	public void setLblNewLabel_6(JLabel lblNewLabel_6) {
		this.lblNewLabel_6 = lblNewLabel_6;
	}

	public void setLblNewLabel_7(JLabel lblNewLabel_7) {
		this.lblNewLabel_7 = lblNewLabel_7;
	}

	public void setLblNewLabel_8(JLabel lblNewLabel_8) {
		this.lblNewLabel_8 = lblNewLabel_8;
	}

	public void setLblPhone(JLabel lblPhone) {
		this.lblPhone = lblPhone;
	}

	public void setLeftPanel(JPanel leftPanel) {
		this.leftPanel = leftPanel;
	}

	public void setNameTF(JTextField nameTF) {
		this.nameTF = nameTF;
	}

	public void setPanel_0(JPanel panel_0) {
		this.panel_0 = panel_0;
	}

	public void setPanel_1(JPanel panel_1) {
		this.panel_1 = panel_1;
	}

	public void setPanel_10(Panel panel_10) {
		this.panel_10 = panel_10;
	}

	public void setPanel_11(Panel panel_11) {
		this.panel_11 = panel_11;
	}

	public void setPanel_12(JPanel panel_12) {
		this.panel_12 = panel_12;
	}

	public void setPanel_14(JPanel panel_14) {
		this.panel_14 = panel_14;
	}

	public void setPanel_2(JPanel panel_2) {
		this.panel_2 = panel_2;
	}

	public void setPanel_3(JPanel panel_3) {
		this.panel_3 = panel_3;
	}

	public void setPanel_4(JPanel panel_4) {
		this.panel_4 = panel_4;
	}

	public void setPanel_5(JPanel panel_5) {
		this.panel_5 = panel_5;
	}

	public void setPanel_6(JPanel panel_6) {
		this.panel_6 = panel_6;
	}

	public void setPanel_7(JPanel panel_7) {
		this.panel_7 = panel_7;
	}

	public void setPanel_8(JPanel panel_8) {
		this.panel_8 = panel_8;
	}

	public void setPanel_9(JPanel panel_9) {
		this.panel_9 = panel_9;
	}

	public void setPasswordTF(JPasswordField passwordTF) {
		this.passwordTF = passwordTF;
	}

	public void setPhoneTF(JTextField phoneTF) {
		this.phoneTF = phoneTF;
	}

	public void setResetButton(JButton resetButton) {
		this.resetButton = resetButton;
	}

	public void setRightPanel(JPanel rightPanel) {
		this.rightPanel = rightPanel;
	}

	public void setService(JFrame service) {
		this.service = service;
	}

	public void setSignUpBtn(JButton signUpBtn) {
		this.signUpBtn = signUpBtn;
	}

	public void setSignUpLabel(JLabel signUpLabel) {
		this.signUpLabel = signUpLabel;
	}

	public void setTopPanel(JPanel topPanel) {
		this.topPanel = topPanel;
	}

}
