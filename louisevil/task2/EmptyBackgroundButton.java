package task2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.border.MatteBorder;

import manager.ResourceManager;

public class EmptyBackgroundButton extends JButton{
	public EmptyBackgroundButton(String name) {
		super(name);
		setFont(new Font("나눔손글씨 펜", Font.PLAIN, 24));
		setBorderPainted(false);
		setBorder(new MatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
		super.setBackground(ResourceManager.NONE);
		setOpaque(false);
		setFocusPainted(false);
		setContentAreaFilled(false);
	}

}
