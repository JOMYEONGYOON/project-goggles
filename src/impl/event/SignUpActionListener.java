package impl.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.view.SignUpFrame;

public class SignUpActionListener implements ActionListener{
	private SignUpFrame signUpFrame;
	public  SignUpActionListener(SignUpFrame signUpFrame) {
		this.signUpFrame = signUpFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
