package swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import manager.ResourceManager;

public class WhiteBorderTextField extends JTextField {
	public WhiteBorderTextField() {
		setBackground(ResourceManager.NONE);
		setBorder(new MatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
		setFont(new Font(ResourceManager.MAIN_FONT, Font.PLAIN, 10));
		setForeground(Color.white);
	}
}