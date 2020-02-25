package frame;

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

import dao.MemberDAO;
import model.Member;
import vo.StringVO;

public class SignUpFrame extends RootFrame {
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
	private Panel panel;
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
	private JButton signUpBtn;
	private JLabel signUpLabel;
	private JPanel topPanel;

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
		panel_12.add(panel);
		panel_12.add(signUpBtn);
		signUpBtn.setForeground(Color.BLACK);
		signUpBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getSource());
				if (e.getActionCommand().contains("Sign In")) {
					Member member = getMemberSignUpText();
					MemberDAO.insert(member);
				}

			}

			private Member getMemberSignUpText() {
				Member member = new Member();
				member.setId(idTF.getText());
				member.setName(nameTF.getText());
				member.setPhone(phoneTF.getText());
				member.setBirth(birthTF.getText());
				member.setEmail(emailTF.getText());
				member.setGender(genderCB.getSelectedItem().toString());
				member.setPassword(passwordTF.getText());
				member.setEtc(etcTF.getText());
				return member;
			}
		});
		signUpBtn.setBounds(222, 34, 77, 21);
		panel_12.add(panel_10);

		panel_12.add(resetButton);
		resetButton.setForeground(Color.BLACK);

		panel_12.add(panel_11);

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
		panel = new Panel();
		panel_10 = new Panel();
		resetButton = new JButton("Reset");
		panel_11 = new Panel();
		cancelButton = new JButton(StringVO.CANCEL);
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new SignInFrame();
				SignUpFrame.this.dispose();
			}
		});
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
