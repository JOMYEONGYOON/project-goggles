package task7;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GoodImagePanelTest extends JFrame {

	public GoodImagePanelTest(String path) {
		GoodImagePanel imagePanel = new GoodImagePanel(path);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		add(imagePanel);
		setSize(600, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GoodImagePanelTest("resources/image/particle.jpg");
	}
}