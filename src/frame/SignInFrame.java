package frame;

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

import service.MemberService;
import vo.CommandVO;
import vo.StringVO;

public class SignInFrame extends JFrame implements CommandVO, StringVO, MemberService {

	private static final long serialVersionUID = 1L;
	protected JPanel bottomPanel;
	protected JPanel centerPanel;
	protected JFrame frame;
	protected JTextField idTF;
	protected JPanel leftPanel;
	protected JPasswordField passwordTF;
	protected JButton signInButton;
	protected JPanel rightPanel;
	protected JButton signUpBtn;
	protected JLabel signInLabel;
	protected JPanel topPanel;
	protected JButton exitButton;
	protected JLabel lblNewLabel_1;
	protected JLabel lblNewLabel_7;
	protected JPanel panel_0;
	protected JPanel panel_1;
	protected JPanel panel_12;
	protected JPanel panel_8;
	protected JPanel panel_9;

	public void newInstance() {
		rightPanel = new JPanel();
		panel_12 = new JPanel();
		rightPanel.setLayout(new GridLayout(3, 1, 0, 0));
		panel_12.setLayout(new GridLayout(0, 1, 0, 0));
		exitButton = new JButton("EXIT");
		leftPanel = new JPanel();
		panel_0 = new JPanel();
		lblNewLabel_1 = new JLabel(StringVO.ID);
		panel_1 = new JPanel();
		lblNewLabel_7 = new JLabel(StringVO.PASSWORD);
		topPanel = new JPanel();
		signInLabel = new JLabel("Sign In");
		panel_8 = new JPanel();
		bottomPanel = new JPanel();
		panel_9 = new JPanel();
		centerPanel = new JPanel();
		idTF = new JTextField();
		passwordTF = new JPasswordField();
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
		
				panel_12.add(signInButton);
				signInButton.setForeground(Color.BLACK);
		signUpBtn = new JButton(SIGN_UP);
		panel_12.add(signUpBtn);
		
				signUpBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("sign in");
		
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

		newInstance();
		init();
		setVisible(true);
	}

}
