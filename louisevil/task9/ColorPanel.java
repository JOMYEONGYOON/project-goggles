package task9;

import java.awt.Color;

import javax.swing.JPanel;

public class ColorPanel extends JPanel {
	private Color color;
	public ColorPanel(Color color) {
		this.color=color;
		this.setBackground(color);
	}
}
