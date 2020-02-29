package task5;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import swing.ImagePanel;

public class ImagePanelTest extends JFrame{
	public ImagePanelTest() {
		ImagePanel imagePanel = new ImagePanel("resources/image/jar.png");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		add(imagePanel);
		setSize(600,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ImagePanelTest();
	}
}
