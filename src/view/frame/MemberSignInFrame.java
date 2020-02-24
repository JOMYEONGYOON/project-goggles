package view.frame;

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
import javax.swing.UIManager;

import service.MemberService;
import statics.Strings;
import javax.swing.SwingConstants;

public class MemberSignInFrame extends JFrame {
	public static final long serialVersionUID = 1L;
	public JPanel bottomPanel;
	public JPanel centerPanel;
	public JFrame frame;
	public JTextField idTF;
	public JPanel leftPanel;
	public JPasswordField passwordTF;
	public JButton signInButton;
	public JPanel rightPanel;
	public JButton signUpBtn;
	public JLabel signUpLabel;
	public JPanel topPanel;
	public JButton exitButton;

	public MemberSignInFrame() {
		JLabel lblBio;
		JLabel lblBirth;
		JLabel lblEmail;
		JLabel lblNewLabel_1;
		JLabel lblNewLabel_7;
		Panel panel;
		JPanel panel_0;
		JPanel panel_1;
		Panel panel_10;
		Panel panel_11;
		JPanel panel_12;
		JPanel panel_14;
		JPanel panel_6;
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

		signUpBtn = new JButton("Sign Up");
		panel_12.add(signUpBtn);
		signUpBtn.setForeground(Color.BLACK);
		signUpBtn.setBounds(222, 34, 77, 21);

		panel_10 = new Panel();
		panel_12.add(panel_10);

		signInButton = new JButton("Sign In");
		panel_12.add(signInButton);
		signInButton.setForeground(Color.BLACK);

		panel_11 = new Panel();
		panel_12.add(panel_11);

		exitButton = new JButton("EXIT");
		panel_12.add(exitButton);
		exitButton.setForeground(Color.BLACK);
		exitButton.setBounds(222, 65, 77, 21);

		leftPanel = new JPanel();
		getContentPane().add(leftPanel, BorderLayout.WEST);
		leftPanel.setLayout(new GridLayout(10, 2, 0, 0));

		panel_6 = new JPanel();
		leftPanel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));

		panel_0 = new JPanel();
		leftPanel.add(panel_0);
		panel_0.setLayout(new BorderLayout(0, 0));

		lblNewLabel_1 = new JLabel(Strings.ID);
		panel_0.add(lblNewLabel_1, BorderLayout.WEST);

		panel_1 = new JPanel();
		leftPanel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		lblNewLabel_7 = new JLabel(Strings.PASSWORD);
		panel_1.add(lblNewLabel_7, BorderLayout.CENTER);

		topPanel = new JPanel();
		getContentPane().add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new BorderLayout(0, 0));

		signUpLabel = new JLabel("Sign Up");
		signUpLabel.setFont(new Font("Consolas", Font.PLAIN, 24));
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

		panel_14 = new JPanel();
		centerPanel.add(panel_14);

		idTF = new JTextField();
		idTF.setText("example");
		centerPanel.add(idTF);
		idTF.setColumns(10);

		passwordTF = new JPasswordField();
		passwordTF.setText("1234");
		centerPanel.add(passwordTF);
		passwordTF.setColumns(10);
		setLocationRelativeTo(null);
	}

}
