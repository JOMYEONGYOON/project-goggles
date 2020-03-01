package task2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import manager.MemberTableManager;
import manager.ResourceManager;
import object.MySQL;

public class SignInPanel extends JPanel {
	private WhiteLabel label;
	private WhiteBorderTextField textField;
	private WhiteLabel pass;
	private WhiteBorderPasswordField passwordField;
	private EmptyBackgroundButton signInButton;
	private WhiteLabel title;
	private MainFrameTest mainFrameTest;

	public SignInPanel(MainFrameTest mainFrameTest) {
		setBorder(new LineBorder(Color.WHITE));
		this.mainFrameTest = mainFrameTest;
		setLayout(null);
		setBackground(ResourceManager.NONE);
		setForeground(Color.WHITE);

		setSize(330, 171);

		label = new WhiteLabel("아이디");
		label.setBounds(12, 74, 50, 15);
		add(label);

		textField = new WhiteBorderTextField();
		textField.setBounds(94, 73, 212, 21);

		add(textField);

		pass = new WhiteLabel("비밀번호");
		pass.setBounds(12, 119, 69, 15);
		add(pass);

		passwordField = new WhiteBorderPasswordField();
		passwordField.setBounds(95, 116, 211, 21);
		add(passwordField);

		signInButton = new EmptyBackgroundButton("[로그인]");
		signInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MySQL mySQL = new MySQL();
				MemberTableManager member = new MemberTableManager();

				try {
					member.connect(mySQL);
					if (member.checkIdPassword(textField.getText(), passwordField.getText())) {

						JOptionPane.showMessageDialog(mainFrameTest, "로그인 성공");
						WhiteBorderTextField searchTextField = mainFrameTest.getSearchTextField();
						searchTextField.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 128)));
						searchTextField.setText("");
						searchTextField.setEditable(true);
					} else {

						JOptionPane.showMessageDialog(mainFrameTest, "로그인 실패");
					}

				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(mainFrameTest, "로그인 실패");
				}

			}
		});
		signInButton.setForeground(Color.WHITE);
		signInButton.setBounds(241, 21, 77, 23);

		add(signInButton);

		title = new WhiteLabel("로그인");
		title.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 32));
		title.setForeground(Color.WHITE);
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setBounds(12, 10, 336, 49);
		add(title);
		setVisible(true);

	}

}
