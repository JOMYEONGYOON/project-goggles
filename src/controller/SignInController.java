package controller;

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

import impl.event.SignInActionListener;
import impl.vo.StringVO;
import model.view.SignInFrame;
import service.SignInService;

public class SignInController implements StringVO {
	private SignInService service;
	private SignInFrame view;

	public void newInstance() {
		view.getRightPanel().add(new JPanel());
		view.getPanel_12().add(new JPanel());
		view.getRightPanel().setLayout(new GridLayout(3, 1, 0, 0));
		view.getPanel_12().setLayout(new GridLayout(0, 1, 0, 0));
		view.getExitButton().add(new JButton(EXIT));
		view.getLeftPanel().add(new JPanel());
		view.getPanel_0().add(new JPanel());
		view.getLblNewLabel_1().add(new JLabel(StringVO.ID));
		view.getPanel_1().add(new JPanel());
		view.getLblNewLabel_7().add(new JLabel(StringVO.PASSWORD));
		view.getTopPanel().add(new JPanel());
		view.getSignInLabel().add(new JLabel(SIGN_IN));
		view.getPanel_8().add(new JPanel());
		view.getBottomPanel().add(new JPanel());
		view.getPanel_9().add(new JPanel());
		view.getCenterPanel().add(new JPanel());
		view.getIdTF().add(new JTextField());
		view.getPasswordTF().add(new JPasswordField());
	}

	public void setView() {
		view.setLayout(new BorderLayout());
		view.setLocationRelativeTo(null);
		view.setSize(600, 400);
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		view.setForeground(Color.BLACK);

		view.getRightPanel().setForeground(Color.BLACK);
		view.add(view.getRightPanel(), BorderLayout.EAST);

		view.getRightPanel().add(view.getPanel_12());
		view.setSignInButton(new JButton("Sign In"));
		view.getSignInButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("로그인버튼 확인");

			}
		});

		view.getPanel_12().add(view.getSignInButton());
		view.getSignInButton().setForeground(Color.BLACK);
		view.setSignUpBtn(new JButton(SIGN_UP));
		view.getPanel_12().add(view.getSignUpBtn());

		view.getSignUpBtn().addActionListener(new SignInActionListener(view));

		view.getSignUpBtn().setForeground(Color.BLACK);
		view.getSignUpBtn().setBounds(222, 34, 77, 21);

		view.getPanel_12().add(view.getExitButton());
		view.getExitButton().setForeground(Color.BLACK);
		view.getExitButton().setBounds(222, 65, 77, 21);

		view.add(view.getLeftPanel(), BorderLayout.WEST);
		view.getLeftPanel().setLayout(new GridLayout(10, 2, 0, 0));

		view.getLeftPanel().add(view.getPanel_0());
		view.getPanel_0().setLayout(new BorderLayout(0, 0));

		view.getPanel_0().add(view.getLblNewLabel_1(), BorderLayout.WEST);

		view.getLeftPanel().add(view.getPanel_1());
		view.getPanel_1().setLayout(new BorderLayout(0, 0));

		view.getPanel_1().add(view.getLblNewLabel_7(), BorderLayout.CENTER);

		view.add(view.getTopPanel(), BorderLayout.NORTH);
		view.getTopPanel().setLayout(new BorderLayout(0, 0));

		view.getSignInLabel().setFont(new Font("Consolas", Font.PLAIN, 24));
		view.getTopPanel().add(view.getSignInLabel());

		view.getTopPanel().add(view.getPanel_8(), BorderLayout.SOUTH);

		view.add(view.getBottomPanel(), BorderLayout.SOUTH);

		view.getBottomPanel().add(view.getPanel_9());

		view.add(view.getCenterPanel, BorderLayout.CENTER);
		view.getCenterPanel.setLayout(new GridLayout(10, 1, 0, 0));

		idTF.setText("example");
		view.getCenterPanel.add(idTF);
		idTF.setColumns(10);

		passwordTF.setText("1234");
		view.getCenterPanel.add(passwordTF);
		passwordTF.setColumns(10);
	}
}
