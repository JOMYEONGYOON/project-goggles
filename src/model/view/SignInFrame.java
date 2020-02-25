package model.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import impl.method.IdExistCheckable;
import impl.vo.StringVO;

public class SignInFrame extends RootFrame implements StringVO, IdExistCheckable {
	
	private static final long serialVersionUID = 1L;
	private JPanel bottomPanel;
	private JPanel centerPanel;
	private JFrame frame;
	private JTextField idTF;
	private JPanel leftPanel;
	private JPasswordField passwordTF;
	private JButton signInButton;
	private JPanel rightPanel;
	private JButton signUpBtn;
	private JLabel signInLabel;
	private JPanel topPanel;
	private JButton exitButton;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_7;
	private JPanel panel_0;
	private JPanel panel_1;
	private JPanel panel_12;
	private JPanel panel_8;
	private JPanel panel_9;

	

	public JPanel getBottomPanel() {
		return bottomPanel;
	}

	public void setBottomPanel(JPanel bottomPanel) {
		this.bottomPanel = bottomPanel;
	}

	public JPanel getCenterPanel() {
		return centerPanel;
	}

	public void setCenterPanel(JPanel centerPanel) {
		this.centerPanel = centerPanel;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getIdTF() {
		return idTF;
	}

	public void setIdTF(JTextField idTF) {
		this.idTF = idTF;
	}

	public JPanel getLeftPanel() {
		return leftPanel;
	}

	public void setLeftPanel(JPanel leftPanel) {
		this.leftPanel = leftPanel;
	}

	public JPasswordField getPasswordTF() {
		return passwordTF;
	}

	public void setPasswordTF(JPasswordField passwordTF) {
		this.passwordTF = passwordTF;
	}

	public JButton getSignInButton() {
		return signInButton;
	}

	public void setSignInButton(JButton signInButton) {
		this.signInButton = signInButton;
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

	public JLabel getSignInLabel() {
		return signInLabel;
	}

	public void setSignInLabel(JLabel signInLabel) {
		this.signInLabel = signInLabel;
	}

	public JPanel getTopPanel() {
		return topPanel;
	}

	public void setTopPanel(JPanel topPanel) {
		this.topPanel = topPanel;
	}

	public JButton getExitButton() {
		return exitButton;
	}

	public void setExitButton(JButton exitButton) {
		this.exitButton = exitButton;
	}

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public void setLblNewLabel_1(JLabel lblNewLabel_1) {
		this.lblNewLabel_1 = lblNewLabel_1;
	}

	public JLabel getLblNewLabel_7() {
		return lblNewLabel_7;
	}

	public void setLblNewLabel_7(JLabel lblNewLabel_7) {
		this.lblNewLabel_7 = lblNewLabel_7;
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

	public JPanel getPanel_12() {
		return panel_12;
	}

	public void setPanel_12(JPanel panel_12) {
		this.panel_12 = panel_12;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void init() {
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setForeground(Color.BLACK);
		setForeground(Color.BLACK);

		rightPanel.setForeground(Color.BLACK);
		getContentPane().add(rightPanel, BorderLayout.EAST);

		rightPanel.add(panel_12);
		signInButton = new JButton("Sign In");
		signInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("로그인버튼 확인");
				
			}
		});

		panel_12.add(signInButton);
		signInButton.setForeground(Color.BLACK);
		signUpBtn = new JButton(SIGN_UP);
		panel_12.add(signUpBtn);

		signUpBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SignUpFrame();
				SignInFrame.this.dispose();
			}
		});

		signUpBtn.setForeground(Color.BLACK);
		signUpBtn.setBounds(222, 34, 77, 21);

		panel_12.add(exitButton);
		exitButton.setForeground(Color.BLACK);
		exitButton.setBounds(222, 65, 77, 21);

		getContentPane().add(leftPanel, BorderLayout.WEST);
		leftPanel.setLayout(new GridLayout(10, 2, 0, 0));

		leftPanel.add(panel_0);
		panel_0.setLayout(new BorderLayout(0, 0));

		panel_0.add(lblNewLabel_1, BorderLayout.WEST);

		leftPanel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		panel_1.add(lblNewLabel_7, BorderLayout.CENTER);

		getContentPane().add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new BorderLayout(0, 0));

		signInLabel.setFont(new Font("Consolas", Font.PLAIN, 24));
		topPanel.add(signInLabel);

		topPanel.add(panel_8, BorderLayout.SOUTH);

		getContentPane().add(bottomPanel, BorderLayout.SOUTH);

		bottomPanel.add(panel_9);

		getContentPane().add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new GridLayout(10, 1, 0, 0));

		idTF.setText("example");
		centerPanel.add(idTF);
		idTF.setColumns(10);

		passwordTF.setText("1234");
		centerPanel.add(passwordTF);
		passwordTF.setColumns(10);

	}

	public SignInFrame() {
//		newInstance();
		init();
		setVisible(true);
	}

}
