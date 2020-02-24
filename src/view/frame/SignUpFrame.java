package view.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import model.Member;
import view.panel.ImgPanel;

public class SignUpFrame {

	private JFrame frame;
	private ImgPanel imgPanel;
	private JLabel lblNewLabel;
	private JLabel lblPassword;
	private JPasswordField passwordTF;
	private JTextField idTF;
	private JLabel lblRepassword;
	private JPasswordField repasswordTF;
	private JLabel lblBio;
	private JTextField phoneTF;
	private JLabel lblPhone;
	private JTextField birthTF;
	private JLabel lblBirth;
	private JTextField emailTF;
	private JLabel lblEmail;
	private JButton signUpBtn;
	private JPanel panel_2;
	private JTextField nameTF;
	private JComboBox genderCB;
	/**
	 * Create the application.
	 */
	public SignUpFrame() {
		initialize();
	}

	public JFrame getFrame() {
		return frame;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		System.out.println("frame");
		System.out.println("conttainer");
		imgPanel = new ImgPanel(new ImageIcon("image\\\\photo01.jpg").getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(imgPanel);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(477, 10, 311, 270);
		imgPanel.add(panel_1_1);
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(0, 0, 0, 128));

		JTextPane etcTP = new JTextPane();
		etcTP.setBounds(12, 34, 198, 226);
		panel_1_1.add(etcTP);

		signUpBtn = new JButton("Sign Up");
		signUpBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				Member member = new Member();
//				member.setId(idTF.getText());
				member.setName(nameTF.getText());
				member.setPhone(phoneTF.getText());
				member.setBirth(birthTF.getText());
				member.setEmail(emailTF.getText());
				member.setGender(genderCB.getSelectedItem().toString());
				member.setPassword(passwordTF.getText());
				member.setEtc(etcTP.getText());
				System.out.println(member.toString());
				
			}
		});
		signUpBtn.setFont(new Font("굴림", Font.PLAIN, 10));
		signUpBtn.setBounds(222, 34, 77, 21);
		panel_1_1.add(signUpBtn);

		JButton signUpBtn_1 = new JButton("Sign Up");
		signUpBtn_1.setFont(new Font("굴림", Font.PLAIN, 10));
		signUpBtn_1.setBounds(222, 65, 77, 21);
		panel_1_1.add(signUpBtn_1);

		JLabel lblEtc = new JLabel("etc");
		lblEtc.setBounds(12, 9, 57, 15);
		panel_1_1.add(lblEtc);
		lblEtc.setForeground(Color.WHITE);
		lblEtc.setFont(new Font("Arial", Font.PLAIN, 10));

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 154, 434, 129);
		imgPanel.add(panel_1);
		panel_1.setBackground(new Color(0, 0, 0, 128));
		panel_1.setLayout(null);

		lblPhone = new JLabel("phone");
		lblPhone.setBounds(12, 10, 57, 15);
		panel_1.add(lblPhone);
		lblPhone.setForeground(Color.WHITE);
		lblPhone.setFont(new Font("Arial", Font.PLAIN, 10));

		phoneTF = new JTextField();
		phoneTF.setBounds(12, 35, 193, 21);
		panel_1.add(phoneTF);
		phoneTF.setFont(new Font("Arial", Font.PLAIN, 10));
		phoneTF.setColumns(10);

		lblBirth = new JLabel("birth");
		lblBirth.setBounds(217, 10, 57, 15);
		panel_1.add(lblBirth);
		lblBirth.setForeground(Color.WHITE);
		lblBirth.setFont(new Font("Arial", Font.PLAIN, 10));

		birthTF = new JTextField();
		birthTF.setBounds(217, 35, 193, 21);
		panel_1.add(birthTF);
		birthTF.setFont(new Font("Arial", Font.PLAIN, 10));
		birthTF.setColumns(10);

		lblBio = new JLabel("gender");
		lblBio.setBounds(217, 66, 57, 15);
		panel_1.add(lblBio);
		lblBio.setForeground(Color.WHITE);
		lblBio.setFont(new Font("Arial", Font.PLAIN, 10));

		lblEmail = new JLabel("email");
		lblEmail.setBounds(12, 66, 57, 15);
		panel_1.add(lblEmail);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 10));

		emailTF = new JTextField();
		emailTF.setBounds(12, 91, 193, 21);
		panel_1.add(emailTF);
		emailTF.setFont(new Font("Arial", Font.PLAIN, 10));
		emailTF.setColumns(10);

		genderCB = new JComboBox();
		genderCB.setBounds(217, 91, 193, 21);
		genderCB.addItem("male");
		genderCB.addItem("female");
		panel_1.add(genderCB);

		panel_2 = new JPanel();
		panel_2.setBounds(12, 10, 434, 129);
		imgPanel.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(0, 0, 0, 128));

		lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(12, 10, 57, 15);
		panel_2.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel.setForeground(Color.WHITE);

		idTF = new JTextField();
		idTF.setOpaque(false);
		
		idTF.setBackground(new Color(64, 64, 64, 64));
		
		idTF.setBounds(12, 35, 193, 21);
		panel_2.add(idTF);
		idTF.setFont(new Font("Arial", Font.PLAIN, 10));
		idTF.setColumns(10);

		lblPassword = new JLabel("password");
		lblPassword.setBounds(12, 66, 93, 15);
		panel_2.add(lblPassword);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 10));

		passwordTF = new JPasswordField();
		passwordTF.setBounds(12, 91, 193, 21);
		panel_2.add(passwordTF);
		passwordTF.setFont(new Font("Arial", Font.PLAIN, 10));

		lblRepassword = new JLabel("re password");
		lblRepassword.setBounds(217, 66, 93, 15);
		panel_2.add(lblRepassword);
		lblRepassword.setForeground(Color.WHITE);
		lblRepassword.setFont(new Font("Arial", Font.PLAIN, 10));

		repasswordTF = new JPasswordField();
		repasswordTF.setBounds(217, 91, 193, 21);
		panel_2.add(repasswordTF);
		repasswordTF.setFont(new Font("Arial", Font.PLAIN, 10));

		JLabel lblUsername = new JLabel("name");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 10));
		lblUsername.setBounds(217, 10, 57, 15);
		panel_2.add(lblUsername);

		nameTF = new JTextField();
		nameTF.setFont(new Font("Arial", Font.PLAIN, 10));
		nameTF.setColumns(10);
		nameTF.setBounds(217, 35, 193, 21);
		panel_2.add(nameTF);
		frame.pack();
		frame.setLocationRelativeTo(null);
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
