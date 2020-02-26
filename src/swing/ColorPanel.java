package swing;

import java.awt.Color;

import javax.swing.JPanel;

import manager.ColorManager;

public class ColorPanel extends JPanel {
	private Color color;
	public ColorPanel() {
		color = ColorManager.blackAlpha;
		this.setSize(320,240);
		this.setBackground(color);
		this.setVisible(true);
	}
	public ColorPanel(Color color) {
		this.color=color;
		this.setSize(320,240);
		this.setBackground(color);
		this.setVisible(true);
	}
}
