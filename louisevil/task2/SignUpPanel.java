package task2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import manager.MemberTableManager;
import manager.ResourceManager;
import object.Member;
import object.MySQL;

public class SignUpPanel extends JPanel {
	
	private WhiteBorderTextField idTF;
	private WhiteBorderTextField nameTF;
	private WhiteBorderTextField phoneTF;
	private WhiteBorderTextField birthTF;
	private WhiteBorderTextField emailTF;
	private WhiteBorderPasswordField passwordFieldTF;
	private EmptyBackgroundComboBox genderCB;
	private EmptyBackgroundTextArea etcTA;
	private MainFrameTest mainFrameTest;
	/**
	 * Create the application.
	 */
	public SignUpPanel(MainFrameTest mainFrameTest) {
		this.mainFrameTest=mainFrameTest;
		setBackground(ResourceManager.NONE);
		setForeground(Color.WHITE);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setLocation(0, 0);
		
		setLayout(null);

		WhiteLabel lblNewLabel = new WhiteLabel("아이디");
		lblNewLabel.setBounds(25, 79, 57, 15);
		add(lblNewLabel);

		WhiteLabel lblNewLabel_1 = new WhiteLabel("이름");
		lblNewLabel_1.setBounds(25, 163, 57, 15);
		add(lblNewLabel_1);

		WhiteLabel lblNewLabel_2 = new WhiteLabel("연락처");
		lblNewLabel_2.setForeground(Color.WHITE);
		add(lblNewLabel_2);

		WhiteLabel lblNewLabel_3 = new WhiteLabel("생년월일");
		lblNewLabel_3.setBounds(25, 235, 57, 15);
		add(lblNewLabel_3);

		WhiteLabel lblNewLabel_4 = new WhiteLabel("이메일");
		lblNewLabel_4.setBounds(25, 271, 57, 15);
		add(lblNewLabel_4);

		idTF = new WhiteBorderTextField();
		idTF.setBounds(94, 79, 89, 21);
		add(idTF);
		idTF.setColumns(10);

		nameTF = new WhiteBorderTextField();
		nameTF.setBounds(94, 163, 89, 21);
		add(nameTF);
		nameTF.setColumns(10);

		phoneTF = new WhiteBorderTextField();
		phoneTF.setForeground(Color.WHITE);
		phoneTF.setColumns(10);
		phoneTF.setBounds(94, 200, 89, 21);
		add(phoneTF);

		birthTF = new WhiteBorderTextField();
		birthTF.setForeground(Color.WHITE);
		birthTF.setColumns(10);
		birthTF.setBounds(94, 235, 89, 21);
		add(birthTF);

		emailTF = new WhiteBorderTextField();
		emailTF.setForeground(Color.WHITE);
		emailTF.setColumns(10);
		emailTF.setBounds(94, 271, 89, 21);
		add(emailTF);

		WhiteLabel lblNewLabel_4_1 = new WhiteLabel("성별");
		lblNewLabel_4_1.setBounds(25, 302, 75, 18);
		add(lblNewLabel_4_1);

		WhiteLabel lblNewLabel_5 = new WhiteLabel("비밀번호");
		lblNewLabel_5.setBounds(25, 123, 57, 15);
		add(lblNewLabel_5);

		passwordFieldTF = new WhiteBorderPasswordField();
		passwordFieldTF.setBounds(94, 123, 89, 21);
		add(passwordFieldTF);

		etcTA = new EmptyBackgroundTextArea();
		etcTA.setForeground(Color.WHITE);
		etcTA.setBounds(206, 106, 134, 180);
		add(etcTA);

		WhiteLabel lblNewLabel_6 = new WhiteLabel("etc");
		lblNewLabel_6.setBounds(206, 81, 57, 15);
		add(lblNewLabel_6);

		WhiteLabel lblNewLabel_7 = new WhiteLabel("회원가입");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7.setBounds(25, 10, 322, 55);

		add(lblNewLabel_7);

		genderCB = new EmptyBackgroundComboBox();
		genderCB.setModel(new DefaultComboBoxModel<String>(new String[] {"male", "female"}));
		genderCB.setBounds(94, 302, 89, 21);
		add(genderCB);

		EmptyBackgroundButton btnNewButton = new EmptyBackgroundButton("[완료]");
		
		btnNewButton.setForeground(Color.WHITE);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String id = idTF.getText();
				String name = nameTF.getText();
				String phone = phoneTF.getText();
				String birth = birthTF.getText();
				String email = emailTF.getText();
				String gender = genderCB.getSelectedItem().toString();
				String etc = etcTA.getText();
				String password = passwordFieldTF.getText();
				Member member = new Member(id,name,phone,email,birth,gender,password,etc);
				try {
					MySQL mySQL = new MySQL();
					MemberTableManager memberTable = new MemberTableManager();
					memberTable.connect(mySQL);
					memberTable.insert(member);
					JOptionPane.showMessageDialog(mainFrameTest, "회원 가입 성공");
				}catch(Exception e){
					JOptionPane.showMessageDialog(mainFrameTest, "회원 가입 실패");
				}
				
			}
		});
		btnNewButton.setBounds(206, 297, 60, 23);
		add(btnNewButton);
//		frame.getContentPane().add(panel);
		add(panel);

		setSize(360, 350);
		
		EmptyBackgroundButton btnCancel = new EmptyBackgroundButton("[취소]");
		btnCancel.setBounds(278, 296, 62, 24);
		add(btnCancel);
		
		WhiteLabel lblNewLabel_1_1 = new WhiteLabel("이름");
		lblNewLabel_1_1.setText("연락처");
		lblNewLabel_1_1.setBounds(25, 200, 57, 15);
		add(lblNewLabel_1_1);
		setVisible(true);
	}
}
