package test.initial;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import view.frame.SignUpFrame;
import view.panel.ImgPanel;



public class MainFrame {
	
	private JFrame frame;
	private ImgPanel imgPanel;
	private JLabel lblNewLabel;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		imgPanel = new ImgPanel(new ImageIcon("image\\photo01.jpg").getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(imgPanel);
		
		JPanel panel = new JPanel();
		panel.setBackground( new Color(0,0,0,64) );
		panel.setBounds(12, 10, 776, 120);
		imgPanel.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("id");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(12, 10, 57, 15);
		panel.add(lblNewLabel);
		
		lblPassword = new JLabel("password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 10));
		lblPassword.setBounds(217, 10, 93, 15);
		panel.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 10));
		passwordField.setBounds(217, 35, 193, 21);
		panel.add(passwordField);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 10));
		textField.setBounds(12, 35, 193, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(598, 34, 77, 21);
		panel.add(btnNewButton);
		
		JButton btnLogout = new JButton("Sign Up");
		btnLogout.setFont(new Font("굴림", Font.PLAIN, 10));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new SignUpFrame().getFrame().setVisible(true);
			}
		});
		btnLogout.setBounds(687, 34, 77, 21);
		panel.add(btnLogout);
		frame.pack();
		
	}

}


