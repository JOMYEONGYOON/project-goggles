package task2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;

import manager.ResourceManager;

public class EmptyBackgroundPasswordField extends JPasswordField {
	public EmptyBackgroundPasswordField() {
		setBackground(ResourceManager.NONE);
		setBorder(new MatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
		setFont(new Font("나눔손글씨 펜", Font.PLAIN, 24));
	}
}