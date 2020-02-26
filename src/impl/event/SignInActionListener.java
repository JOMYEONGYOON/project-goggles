package impl.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.view.SignInFrame;
import model.view.SignUpFrame;

public class SignInActionListener implements ActionListener {
	private SignInFrame signInFrame;

	public SignInActionListener(SignInFrame signInFrame) {
		this.signInFrame = signInFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new SignUpFrame();
		signInFrame.dispose();

	}

}
