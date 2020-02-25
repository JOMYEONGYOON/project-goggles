package model.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import model.vo.StringVO;
import service.impl.SignUpCheckable;

public class SignUpFrame extends RootFrame implements SignUpCheckable, StringVO {
	private static final long serialVersionUID = 1L;
	private JTextField birthTF;
	private JPanel bottomPanel;
	private JButton cancelButton;
	private JPanel centerPanel;
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
	public JTextField getBirthTF() {
		return birthTF;
	}

	public void setBirthTF(JTextField birthTF) {
		this.birthTF = birthTF;
	}

	public JPanel getBottomPanel() {
		return bottomPanel;
	}

	public void setBottomPanel(JPanel bottomPanel) {
		this.bottomPanel = bottomPanel;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public void setCancelButton(JButton cancelButton) {
		this.cancelButton = cancelButton;
	}

	public JPanel getCenterPanel() {
		return centerPanel;
	}

	public void setCenterPanel(JPanel centerPanel) {
		this.centerPanel = centerPanel;
	}

	public JTextField getEmailTF() {
		return emailTF;
	}

	public void setEmailTF(JTextField emailTF) {
		this.emailTF = emailTF;
	}

	public JTextField getEtcTF() {
		return etcTF;
	}

	public void setEtcTF(JTextField etcTF) {
		this.etcTF = etcTF;
	}

	public JComboBox getGenderCB() {
		return genderCB;
	}

	public void setGenderCB(JComboBox genderCB) {
		this.genderCB = genderCB;
	}

	public JTextField getIdTF() {
		return idTF;
	}

	public void setIdTF(JTextField idTF) {
		this.idTF = idTF;
	}

	public JLabel getLblBio() {
		return lblBio;
	}

	public void setLblBio(JLabel lblBio) {
		this.lblBio = lblBio;
	}

	public JLabel getLblBirth() {
		return lblBirth;
	}

	public void setLblBirth(JLabel lblBirth) {
		this.lblBirth = lblBirth;
	}

	public JLabel getLblEmail() {
		return lblEmail;
	}

	public void setLblEmail(JLabel lblEmail) {
		this.lblEmail = lblEmail;
	}

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public void setLblNewLabel_1(JLabel lblNewLabel_1) {
		this.lblNewLabel_1 = lblNewLabel_1;
	}

	public JLabel getLblNewLabel_2() {
		return lblNewLabel_2;
	}

	public void setLblNewLabel_2(JLabel lblNewLabel_2) {
		this.lblNewLabel_2 = lblNewLabel_2;
	}

	public JLabel getLblNewLabel_3() {
		return lblNewLabel_3;
	}

	public void setLblNewLabel_3(JLabel lblNewLabel_3) {
		this.lblNewLabel_3 = lblNewLabel_3;
	}

	public JLabel getLblNewLabel_4() {
		return lblNewLabel_4;
	}

	public void setLblNewLabel_4(JLabel lblNewLabel_4) {
		this.lblNewLabel_4 = lblNewLabel_4;
	}

	public JLabel getLblNewLabel_5() {
		return lblNewLabel_5;
	}

	public void setLblNewLabel_5(JLabel lblNewLabel_5) {
		this.lblNewLabel_5 = lblNewLabel_5;
	}

	public JLabel getLblNewLabel_6() {
		return lblNewLabel_6;
	}

	public void setLblNewLabel_6(JLabel lblNewLabel_6) {
		this.lblNewLabel_6 = lblNewLabel_6;
	}

	public JLabel getLblNewLabel_7() {
		return lblNewLabel_7;
	}

	public void setLblNewLabel_7(JLabel lblNewLabel_7) {
		this.lblNewLabel_7 = lblNewLabel_7;
	}

	public JLabel getLblNewLabel_8() {
		return lblNewLabel_8;
	}

	public void setLblNewLabel_8(JLabel lblNewLabel_8) {
		this.lblNewLabel_8 = lblNewLabel_8;
	}

	public JLabel getLblPhone() {
		return lblPhone;
	}

	public void setLblPhone(JLabel lblPhone) {
		this.lblPhone = lblPhone;
	}

	public JPanel getLeftPanel() {
		return leftPanel;
	}

	public void setLeftPanel(JPanel leftPanel) {
		this.leftPanel = leftPanel;
	}

	public JTextField getNameTF() {
		return nameTF;
	}

	public void setNameTF(JTextField nameTF) {
		this.nameTF = nameTF;
	}

	public JPanel getPanel_0() {
		return panel_0;
	}

	public void setPanel_0(JPanel panel_0) {
		this.panel_0 = panel_0;
	}

	public JPanel getPanel_1() {
		return panel_1;
	}

	public void setPanel_1(JPanel panel_1) {
		this.panel_1 = panel_1;
	}

	public Panel getPanel_10() {
		return panel_10;
	}

	public void setPanel_10(Panel panel_10) {
		this.panel_10 = panel_10;
	}

	public Panel getPanel_11() {
		return panel_11;
	}

	public void setPanel_11(Panel panel_11) {
		this.panel_11 = panel_11;
	}

	public JPanel getPanel_12() {
		return panel_12;
	}

	public void setPanel_12(JPanel panel_12) {
		this.panel_12 = panel_12;
	}

	public JPanel getPanel_14() {
		return panel_14;
	}

	public void setPanel_14(JPanel panel_14) {
		this.panel_14 = panel_14;
	}

	public JPanel getPanel_2() {
		return panel_2;
	}

	public void setPanel_2(JPanel panel_2) {
		this.panel_2 = panel_2;
	}

	public JPanel getPanel_3() {
		return panel_3;
	}

	public void setPanel_3(JPanel panel_3) {
		this.panel_3 = panel_3;
	}

	public JPanel getPanel_4() {
		return panel_4;
	}

	public void setPanel_4(JPanel panel_4) {
		this.panel_4 = panel_4;
	}

	public JPanel getPanel_5() {
		return panel_5;
	}

	public void setPanel_5(JPanel panel_5) {
		this.panel_5 = panel_5;
	}

	public JPanel getPanel_6() {
		return panel_6;
	}

	public void setPanel_6(JPanel panel_6) {
		this.panel_6 = panel_6;
	}

	public JPanel getPanel_7() {
		return panel_7;
	}

	public void setPanel_7(JPanel panel_7) {
		this.panel_7 = panel_7;
	}

	public JPanel getPanel_8() {
		return panel_8;
	}

	public void setPanel_8(JPanel panel_8) {
		this.panel_8 = panel_8;
	}

	public JPanel getPanel_9() {
		return panel_9;
	}

	public void setPanel_9(JPanel panel_9) {
		this.panel_9 = panel_9;
	}

	public JPasswordField getPasswordTF() {
		return passwordTF;
	}

	public void setPasswordTF(JPasswordField passwordTF) {
		this.passwordTF = passwordTF;
	}

	public JTextField getPhoneTF() {
		return phoneTF;
	}

	public void setPhoneTF(JTextField phoneTF) {
		this.phoneTF = phoneTF;
	}

	public JButton getResetButton() {
		return resetButton;
	}

	public void setResetButton(JButton resetButton) {
		this.resetButton = resetButton;
	}

	public JPanel getRightPanel() {
		return rightPanel;
	}

	public void setRightPanel(JPanel rightPanel) {
		this.rightPanel = rightPanel;
	}

	public JButton getSignUpBtn() {
		return signUpBtn;
	}

	public void setSignUpBtn(JButton signUpBtn) {
		this.signUpBtn = signUpBtn;
	}

	public JLabel getSignUpLabel() {
		return signUpLabel;
	}

	public void setSignUpLabel(JLabel signUpLabel) {
		this.signUpLabel = signUpLabel;
	}

	public JPanel getTopPanel() {
		return topPanel;
	}

	public void setTopPanel(JPanel topPanel) {
		this.topPanel = topPanel;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

	public JButton getCheckButton() {
		return checkButton;
	}

	public void setCheckButton(JButton checkButton) {
		this.checkButton = checkButton;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private JTextField phoneTF;
	private JButton resetButton;
	private JPanel rightPanel;
	private JButton signUpBtn;
	private JLabel signUpLabel;
	private JPanel topPanel;
	private JButton button;
	private JButton checkButton;

	public SignUpFrame() {
		newInstance();
		initComponents();

		panel_1.add(lblNewLabel_7, BorderLayout.CENTER);
		leftPanel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		panel_2.add(lblNewLabel_2, BorderLayout.CENTER);
		leftPanel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		panel_3.add(lblNewLabel_4, BorderLayout.WEST);
		leftPanel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));

		panel_4.add(lblNewLabel_6, BorderLayout.CENTER);

		leftPanel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));

		panel_5.add(lblNewLabel_3, BorderLayout.CENTER);
		leftPanel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		panel_6.add(lblNewLabel_5, BorderLayout.CENTER);

		leftPanel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));

		panel_7.add(lblNewLabel_8, BorderLayout.WEST);

		getContentPane().add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new BorderLayout(0, 0));

		signUpLabel.setFont(new Font(StringVO.CONSOLAS, Font.PLAIN, 24));
		topPanel.add(signUpLabel);

		topPanel.add(panel_8, BorderLayout.SOUTH);

		getContentPane().add(bottomPanel, BorderLayout.SOUTH);

		bottomPanel.add(panel_9);

		getContentPane().add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new GridLayout(10, 1, 0, 0));

		idTF.setText(StringVO.EXAMPLE);
		centerPanel.add(idTF);
		idTF.setColumns(10);

		passwordTF.setText(StringVO._1234);
		centerPanel.add(passwordTF);
		passwordTF.setColumns(10);

		nameTF.setText(StringVO.CHOI);
		centerPanel.add(nameTF);
		nameTF.setColumns(10);

		birthTF.setText(StringVO._1989_03_01);
		centerPanel.add(birthTF);
		birthTF.setColumns(10);

		genderCB.setModel(new DefaultComboBoxModel(new String[] { StringVO.MALE, StringVO.FEMALE }));
		centerPanel.add(genderCB);
		phoneTF.setText(StringVO._010_000_0000);
		centerPanel.add(phoneTF);
		phoneTF.setColumns(10);

		emailTF.setText(StringVO.EXAMPLE_EMAIL);
		centerPanel.add(emailTF);
		emailTF.setColumns(10);

		etcTF.setText("etc....");
		centerPanel.add(etcTF);
		etcTF.setColumns(10);

		this.setVisible(true);
	}

	public void initComponents() {
		setSize(600, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setForeground(Color.BLACK);
		rightPanel.setForeground(Color.BLACK);
		getContentPane().add(rightPanel, BorderLayout.EAST);
		rightPanel.setLayout(new GridLayout(4, 2, 0, 0));
		rightPanel.add(panel_12);
		panel_12.setLayout(new GridLayout(3, 2, 0, 0));

		checkButton = new JButton(CHECK);
		checkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				MemberDTO member = getMemberSignUpText();
				//##
			}
		});
		panel_12.add(checkButton);
		panel_12.add(signUpBtn);
		signUpBtn.setEnabled(false);
		signUpBtn.setForeground(Color.BLACK);
		signUpBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().contains(StringVO.SIGN_UP)) {
					//##
				}

			}

		});
		signUpBtn.setBounds(222, 34, 77, 21);
		panel_12.add(panel_10);
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idTF.setText("");
				nameTF.setText("");
				phoneTF.setText("");
				birthTF.setText("");
				emailTF.setText("");

				passwordTF.setText("");
				etcTF.setText("");
				signUpBtn.setEnabled(false);
			}
		});
		panel_12.add(resetButton);
		resetButton.setForeground(Color.BLACK);

		panel_12.add(panel_11);

		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SignInFrame();
				SignUpFrame.this.dispose();
			}
		});
		panel_12.add(cancelButton);
		cancelButton.setForeground(Color.BLACK);
		cancelButton.setBounds(222, 65, 77, 21);

		getContentPane().add(leftPanel, BorderLayout.WEST);
		leftPanel.setLayout(new GridLayout(10, 2, 0, 0));

		leftPanel.add(panel_0);
		panel_0.setLayout(new BorderLayout(0, 0));

		panel_0.add(lblNewLabel_1, BorderLayout.WEST);

		leftPanel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

	}

	public void newInstance() {

		rightPanel = new JPanel();
		panel_12 = new JPanel();
		panel_10 = new Panel();
		resetButton = new JButton("Reset");
		
		panel_11 = new Panel();
		cancelButton = new JButton(StringVO.CANCEL);
		leftPanel = new JPanel();
		panel_0 = new JPanel();
		lblNewLabel_1 = new JLabel(StringVO.ID);
		panel_1 = new JPanel();
		signUpBtn = new JButton(StringVO.SIGN_UP);
		lblNewLabel_7 = new JLabel(StringVO.PASSWORD);
		panel_2 = new JPanel();
		lblNewLabel_2 = new JLabel(StringVO.NAME);
		panel_3 = new JPanel();
		lblNewLabel_4 = new JLabel(StringVO.BIRTH);
		panel_4 = new JPanel();
		lblNewLabel_6 = new JLabel(StringVO.GENDER);
		panel_5 = new JPanel();
		lblNewLabel_3 = new JLabel(StringVO.PHONE);
		panel_6 = new JPanel();
		lblNewLabel_5 = new JLabel(StringVO.EMAIL);
		panel_7 = new JPanel();
		lblNewLabel_8 = new JLabel(StringVO.ETC);
		topPanel = new JPanel();
		signUpLabel = new JLabel(StringVO.SIGN_UP);
		panel_8 = new JPanel();
		bottomPanel = new JPanel();
		panel_9 = new JPanel();
		centerPanel = new JPanel();
		idTF = new JTextField();
		passwordTF = new JPasswordField();
		nameTF = new JTextField();
		birthTF = new JTextField();
		genderCB = new JComboBox();
		phoneTF = new JTextField();
		emailTF = new JTextField();
		etcTF = new JTextField();
		panel_14 = new JPanel();
	}

}
