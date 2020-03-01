package task2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import manager.ResourceManager;

public class SignUpPanel extends JPanel {
	
	private WhiteTextField id;
	private WhiteTextField name;
	private WhiteTextField phone;
	private WhiteTextField birth;
	private WhiteTextField email;
	private EmptyBackgroundPasswordField passwordField;
	private EmptyBackgroundComboBox gender;

	/**
	 * Create the application.
	 */
	public SignUpPanel() {
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

		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("나눔손글씨 펜", Font.ITALIC, 12));
		lblNewLabel.setBounds(25, 79, 57, 15);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("나눔손글씨 펜", Font.ITALIC, 12));
		lblNewLabel_1.setBounds(25, 163, 57, 15);
		add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("phone");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("나눔손글씨 펜", Font.ITALIC, 12));
		lblNewLabel_2.setBounds(25, 200, 57, 15);
		add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("birth");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("나눔손글씨 펜", Font.ITALIC, 12));
		lblNewLabel_3.setBounds(25, 235, 57, 15);
		add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("email");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("나눔손글씨 펜", Font.ITALIC, 12));
		lblNewLabel_4.setBounds(25, 271, 57, 15);
		add(lblNewLabel_4);

		id = new WhiteTextField();
		id.setForeground(Color.WHITE);
		id.setBounds(94, 79, 89, 21);
		add(id);
		id.setColumns(10);

		name = new WhiteTextField();
		name.setForeground(Color.WHITE);
		name.setBounds(94, 163, 89, 21);
		add(name);
		name.setColumns(10);

		phone = new WhiteTextField();
		phone.setForeground(Color.WHITE);
		phone.setColumns(10);
		phone.setBounds(94, 200, 89, 21);
		add(phone);

		birth = new WhiteTextField();
		birth.setForeground(Color.WHITE);
		birth.setColumns(10);
		birth.setBounds(94, 235, 89, 21);
		add(birth);

		email = new WhiteTextField();
		email.setForeground(Color.WHITE);
		email.setColumns(10);
		email.setBounds(94, 271, 89, 21);
		add(email);

		JLabel lblNewLabel_4_1 = new JLabel("gender");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("나눔손글씨 펜", Font.ITALIC, 12));
		lblNewLabel_4_1.setBounds(25, 299, 75, 18);
		add(lblNewLabel_4_1);

		JLabel lblNewLabel_5 = new JLabel("password");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("나눔손글씨 펜", Font.ITALIC, 12));
		lblNewLabel_5.setBounds(25, 123, 57, 15);
		add(lblNewLabel_5);

		passwordField = new EmptyBackgroundPasswordField();
		passwordField.setForeground(Color.WHITE);
		passwordField.setBounds(94, 123, 89, 21);
		add(passwordField);

		JTextArea etc = new JTextArea();
		etc.setForeground(Color.WHITE);
		etc.setBounds(241, 77, 99, 91);
		add(etc);

		JLabel lblNewLabel_6 = new JLabel("etc");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("나눔손글씨 펜", Font.ITALIC, 12));
		lblNewLabel_6.setBounds(206, 81, 57, 15);
		add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("회원가입");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 22));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7.setBounds(25, 10, 366, 55);

		add(lblNewLabel_7);

		gender = new EmptyBackgroundComboBox();
		gender.setForeground(Color.WHITE);
		gender.setModel(new DefaultComboBoxModel<String>(new String[] {"male", "female"}));
		gender.setBounds(94, 302, 89, 21);
		add(gender);

		EmptyBackgroundButton btnNewButton = new EmptyBackgroundButton("[완료]");
		btnNewButton.setForeground(Color.WHITE);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idtxt = id.getText();
				String nametxt = name.getText();
				String phonetxt = phone.getText();
				String birthtxt = birth.getText();
				String emailtxt = email.getText();
				String gendertxt = gender.getSelectedItem().toString();
				String etctxt = etc.getText();
				String passtxt = passwordField.getText();
			}
		});
		btnNewButton.setBounds(241, 268, 99, 21);
		add(btnNewButton);
//		frame.getContentPane().add(panel);
		add(panel);

		setSize(359, 350);
		
		EmptyBackgroundButton btnCancel = new EmptyBackgroundButton("[취소]");
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setBounds(241, 298, 99, 21);
		add(btnCancel);
		setVisible(true);
	}
}
