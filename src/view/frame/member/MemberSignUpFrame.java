package view.frame.member;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import service.MemberService;
import vo.StringVO;

public class MemberSignUpFrame extends JFrame {
	public static final long serialVersionUID = 1L;
	public JTextField birthTF;
	public JTextField etcTF;
	public JPanel bottomPanel;
	public JPanel centerPanel;
	public JTextField emailTF;
	public JFrame frame;
	public JComboBox genderCB;
	public JTextField idTF;
	public JPanel leftPanel;
	public JTextField nameTF;
	public JPasswordField passwordTF;
	public JButton resetButton;
	public JPanel rightPanel;
	public JButton signUpBtn;
	public JLabel signUpLabel;
	public JTextField phoneTF;
	public JPanel topPanel;
	public JButton cancelButton;

	public MemberSignUpFrame() {
		this.setSize(600,480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel lblBio;
		JLabel lblBirth;
		JLabel lblEmail;
		JLabel lblNewLabel_1;
		JLabel lblNewLabel_2;
		JLabel lblNewLabel_3;
		JLabel lblNewLabel_4;
		JLabel lblNewLabel_5;
		JLabel lblNewLabel_6;
		JLabel lblNewLabel_7;
		JLabel lblNewLabel_8;
		Panel panel;
		JPanel panel_0;
		JPanel panel_1;
		Panel panel_10;
		Panel panel_11;
		JPanel panel_12;
		JPanel panel_14;
		JPanel panel_2;
		JPanel panel_3;
		JPanel panel_4;
		JPanel panel_5;
		JPanel panel_6;
		JPanel panel_7;
		JPanel panel_8;
		JPanel panel_9;
		JLabel lblPhone;
		getContentPane().setForeground(Color.BLACK);
		setForeground(Color.BLACK);

		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(617, 613);

		rightPanel = new JPanel();
		rightPanel.setForeground(Color.BLACK);
		getContentPane().add(rightPanel, BorderLayout.EAST);
		rightPanel.setLayout(new GridLayout(4, 2, 0, 0));

		panel_12 = new JPanel();
		rightPanel.add(panel_12);
		panel_12.setLayout(new GridLayout(3, 2, 0, 0));

		panel = new Panel();
		panel_12.add(panel);

		signUpBtn = new JButton(StringVO.SIGN_UP);
		panel_12.add(signUpBtn);
		signUpBtn.setForeground(Color.BLACK);
		signUpBtn.addActionListener(new MemberService(this));
		signUpBtn.setBounds(222, 34, 77, 21);

		panel_10 = new Panel();
		panel_12.add(panel_10);

		resetButton = new JButton("Reset");
		panel_12.add(resetButton);
		resetButton.setForeground(Color.BLACK);

		panel_11 = new Panel();
		panel_12.add(panel_11);

		cancelButton = new JButton(StringVO.CANCEL);
		panel_12.add(cancelButton);
		cancelButton.setForeground(Color.BLACK);
		cancelButton.setBounds(222, 65, 77, 21);

		leftPanel = new JPanel();
		getContentPane().add(leftPanel, BorderLayout.WEST);
		leftPanel.setLayout(new GridLayout(10, 2, 0, 0));

		panel_0 = new JPanel();
		leftPanel.add(panel_0);
		panel_0.setLayout(new BorderLayout(0, 0));

		lblNewLabel_1 = new JLabel(StringVO.ID);
		panel_0.add(lblNewLabel_1, BorderLayout.WEST);

		panel_1 = new JPanel();
		leftPanel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		lblNewLabel_7 = new JLabel(StringVO.PASSWORD);
		panel_1.add(lblNewLabel_7, BorderLayout.CENTER);

		panel_2 = new JPanel();
		leftPanel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		lblNewLabel_2 = new JLabel(StringVO.NAME);
		panel_2.add(lblNewLabel_2, BorderLayout.CENTER);

		panel_3 = new JPanel();
		leftPanel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		lblNewLabel_4 = new JLabel(StringVO.BIRTH);
		panel_3.add(lblNewLabel_4, BorderLayout.WEST);

		panel_4 = new JPanel();
		leftPanel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));

		lblNewLabel_6 = new JLabel(StringVO.GENDER);
		panel_4.add(lblNewLabel_6, BorderLayout.CENTER);

		panel_5 = new JPanel();
		leftPanel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));

		lblNewLabel_3 = new JLabel(StringVO.PHONE);
		panel_5.add(lblNewLabel_3, BorderLayout.CENTER);

		panel_6 = new JPanel();
		leftPanel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));

		lblNewLabel_5 = new JLabel(StringVO.EMAIL);
		panel_6.add(lblNewLabel_5, BorderLayout.CENTER);

		panel_7 = new JPanel();
		leftPanel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));

		lblNewLabel_8 = new JLabel(StringVO.ETC);
		panel_7.add(lblNewLabel_8, BorderLayout.WEST);

		topPanel = new JPanel();
		getContentPane().add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new BorderLayout(0, 0));

		signUpLabel = new JLabel(StringVO.SIGN_UP);
		signUpLabel.setFont(new Font(StringVO.CONSOLAS, Font.PLAIN, 24));
		topPanel.add(signUpLabel);

		panel_8 = new JPanel();
		topPanel.add(panel_8, BorderLayout.SOUTH);

		bottomPanel = new JPanel();
		getContentPane().add(bottomPanel, BorderLayout.SOUTH);

		panel_9 = new JPanel();
		bottomPanel.add(panel_9);

		centerPanel = new JPanel();
		getContentPane().add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new GridLayout(10, 1, 0, 0));

		idTF = new JTextField();
		idTF.setText(StringVO.EXAMPLE);
		centerPanel.add(idTF);
		idTF.setColumns(10);

		passwordTF = new JPasswordField();
		passwordTF.setText(StringVO._1234);
		centerPanel.add(passwordTF);
		passwordTF.setColumns(10);

		nameTF = new JTextField();
		nameTF.setText(StringVO.CHOI);
		centerPanel.add(nameTF);
		nameTF.setColumns(10);

		birthTF = new JTextField();
		birthTF.setText(StringVO._1989_03_01);
		centerPanel.add(birthTF);
		birthTF.setColumns(10);

		genderCB = new JComboBox();
		genderCB.setModel(new DefaultComboBoxModel(new String[] { StringVO.MALE, StringVO.FEMALE }));
		centerPanel.add(genderCB);

		phoneTF = new JTextField();
		phoneTF.setText(StringVO._010_000_0000);
		centerPanel.add(phoneTF);
		phoneTF.setColumns(10);

		emailTF = new JTextField();
		emailTF.setText(StringVO.EXAMPLE_EMAIL);
		centerPanel.add(emailTF);
		emailTF.setColumns(10);

		etcTF = new JTextField();
		etcTF.setText("etc....");
		centerPanel.add(etcTF);
		etcTF.setColumns(10);

		panel_14 = new JPanel();
		centerPanel.add(panel_14);
		setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
