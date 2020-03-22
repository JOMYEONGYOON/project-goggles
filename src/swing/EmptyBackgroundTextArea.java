package swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;

import manager.ResourceManager;

public class EmptyBackgroundTextArea extends JTextArea{
	public EmptyBackgroundTextArea() {
		setFont(new Font(ResourceManager.MAIN_FONT, Font.PLAIN, 10));
		setBorder(new MatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
		setForeground(ResourceManager.BLACK);
		setBackground(ResourceManager.WHITE_ALPHA);
		setOpaque(false);
	}
}
