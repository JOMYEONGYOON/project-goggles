package container;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import vo.StringsVO;

public class SignInContainer extends JPanel {
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

	public SignInContainer() {
		this.setSize(1024, 768);
		JLabel lblNewLabel_1;
		JLabel lblNewLabel_7;
		Panel panel;
		JPanel panel_0;
		JPanel panel_1;
		Panel panel_10;
		Panel panel_11;
		JPanel panel_12;
		JPanel panel_8;
		JPanel panel_9;
		setForeground(Color.BLACK);
		setForeground(Color.BLACK);

		setLayout(new BorderLayout());
		setSize(640, 480);

		rightPanel = new JPanel();
		rightPanel.setForeground(Color.BLACK);
		add(rightPanel, BorderLayout.EAST);
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
		add(leftPanel, BorderLayout.WEST);
		leftPanel.setLayout(new GridLayout(10, 2, 0, 0));

		panel_0 = new JPanel();
		leftPanel.add(panel_0);
		panel_0.setLayout(new BorderLayout(0, 0));

		lblNewLabel_1 = new JLabel(StringsVO.ID);
		panel_0.add(lblNewLabel_1, BorderLayout.WEST);

		panel_1 = new JPanel();
		leftPanel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		lblNewLabel_7 = new JLabel(StringsVO.PASSWORD);
		panel_1.add(lblNewLabel_7, BorderLayout.CENTER);

		topPanel = new JPanel();
		add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new BorderLayout(0, 0));

		signUpLabel = new JLabel("Sign Up");
		signUpLabel.setFont(new Font("Consolas", Font.PLAIN, 24));
		topPanel.add(signUpLabel);

		panel_8 = new JPanel();
		topPanel.add(panel_8, BorderLayout.SOUTH);

		bottomPanel = new JPanel();
		add(bottomPanel, BorderLayout.SOUTH);

		panel_9 = new JPanel();
		bottomPanel.add(panel_9);

		centerPanel = new JPanel();
		add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new GridLayout(10, 1, 0, 0));

		idTF = new JTextField();
		idTF.setText("example");
		centerPanel.add(idTF);
		idTF.setColumns(10);

		passwordTF = new JPasswordField();
		passwordTF.setText("1234");
		centerPanel.add(passwordTF);
		passwordTF.setColumns(10);

//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLocationRelativeTo(null);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setVisible(true);
	}

}
