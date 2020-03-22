package swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import manager.ResourceManager;

public class WhiteLabel extends JLabel {
	public WhiteLabel() {
		super();
		setFont(new Font(ResourceManager.MAIN_FONT, Font.PLAIN, 10));
		setForeground(Color.WHITE);
	}

	public WhiteLabel(String name) {
		super(name);
		setForeground(Color.WHITE);
		setFont(new Font(ResourceManager.MAIN_FONT, Font.PLAIN, 10));
	}
}
