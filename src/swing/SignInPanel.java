package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import manager.MemberTableManager;
import manager.ResourceManager;
import object.MySQL;
import runner.FadeLabelRunner;

public class SignInPanel extends JPanel {
	private WhiteLabel label;
	private WhiteBorderTextField idField;
	private WhiteLabel pass;
	private WhiteBorderPasswordField passwordField;
	private EmptyBackgroundButton signInButton;
	private WhiteLabel title;
	private MainFrame mainFrameTest;

	public SignInPanel(MainFrame mainFrameTest) {
		setBorder(new LineBorder(Color.WHITE));
		this.mainFrameTest = mainFrameTest;
		setLayout(null);
		setBackground(ResourceManager.NONE);
		setForeground(Color.WHITE);
			
		setSize(352, 248);

		label = new WhiteLabel("아이디");
		label.setBounds(29, 119, 50, 15);
		add(label);

		idField = new WhiteBorderTextField();
		idField.setBounds(109, 106, 212, 39);

		add(idField);

		pass = new WhiteLabel("비밀번호");
		pass.setBounds(26, 174, 69, 15);
		add(pass);

		passwordField = new WhiteBorderPasswordField();
		passwordField.setBounds(109, 165, 212, 39);
		add(passwordField);

		signInButton = new EmptyBackgroundButton("[로그인]");
		signInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MySQL mySQL = new MySQL();
				MemberTableManager member = new MemberTableManager();

				try {
					member.connect(mySQL);
					String[] strs = {idField.getText(), passwordField.getText()};
					for (String s : strs) {
						if (s.equals("")) {
							WhiteLabel successLabel = new WhiteLabel("모두 입력해주세요");
							successLabel.setBounds(ResourceManager.FRAME_WIDTH-600,150,300,100);
							mainFrameTest.getRootPanel().add(successLabel);
							FadeLabelRunner fade = new FadeLabelRunner(successLabel);
							fade.start();
							return;
						}
					}
					if (member.checkIdPassword(idField.getText(), passwordField.getText())) {
						WhiteBorderTextField searchTextField = mainFrameTest.getSearchTextField();
						searchTextField.setBorder(new MatteBorder(1, 1, 1, 1, Color.CYAN));
						searchTextField.setText("");
						searchTextField.setEditable(true);
						SignInPanel.this.setVisible(false);
						WhiteLabel successLabel = new WhiteLabel("로그인 성공");
						successLabel.setBounds(ResourceManager.FRAME_WIDTH-450,100,100,100);
						mainFrameTest.getRootPanel().add(successLabel);
						FadeLabelRunner fade = new FadeLabelRunner(successLabel);
						fade.start();
					} else {
						WhiteLabel failLabel = new WhiteLabel("로그인 실패");
						failLabel.setBounds(ResourceManager.FRAME_WIDTH-500,100,100,100);
						FadeLabelRunner fade = new FadeLabelRunner(failLabel);
						mainFrameTest.getRootPanel().add(failLabel);
						fade.start();
					}

				} catch (Exception e) {
					e.printStackTrace();
					WhiteLabel failLabel = new WhiteLabel("회원가입 실패");
					failLabel.setBounds(ResourceManager.FRAME_WIDTH-500,100,100,100);
					FadeLabelRunner fade = new FadeLabelRunner(failLabel);
					mainFrameTest.getRootPanel().add(failLabel);
					fade.start();
				}

			}
		});
		signInButton.setForeground(Color.WHITE);
		signInButton.setBounds(155, 36, 77, 23);

		add(signInButton);

		title = new WhiteLabel("로그인");
		title.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 32));
		title.setForeground(Color.WHITE);
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setBounds(29, 25, 77, 49);
		add(title);
		
		EmptyBackgroundButton cancelButton = new EmptyBackgroundButton("[로그인]");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrameTest.getRootPanel().remove(SignInPanel.this);
			}
		});
		cancelButton.setText("[취소]");
		cancelButton.setForeground(Color.WHITE);
		cancelButton.setBounds(244, 36, 77, 23);
		add(cancelButton);
		setVisible(true);

	}
}
