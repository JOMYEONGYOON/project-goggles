package swing;

import java.awt.Color;

import javax.swing.JPanel;

public class ColorPanel extends JPanel {
	private Color color;
	public ColorPanel(Color color) {
		this.color=color;
		this.setSize(320,240);
		this.setBackground(color);
		this.setVisible(true);
	}
}
