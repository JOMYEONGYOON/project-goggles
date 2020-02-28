package dictionary;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import manager.ColorManager;

public class LoginPanel extends JPanel{
	public LoginPanel() {
		
		JPanel panel = new JPanel();
		setSize(320,240);
		setBackground(ColorManager.NONE);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
	}

}
