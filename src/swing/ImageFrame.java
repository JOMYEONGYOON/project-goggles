package swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import manager.ResourceManager;

public class ImageFrame extends JFrame {
	private JPanel rootPanel;

	public JPanel getRootPanel() {
		return rootPanel;
	}

	public void setRootPanel(JPanel rootPanel) {
		this.rootPanel = rootPanel;
	}

	public ImageFrame() {
		initComponent();
		setMainFrame();
	}

	private void initComponent() {
		rootPanel = new ImagePanel(ResourceManager.PARTICLE_IMG_PATH);
		rootPanel.setBackground(ResourceManager.BLACK);
		rootPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		rootPanel.setLayout(new CardLayout(0, 0));
	}

	private void setMainFrame() {
		setSize(new Dimension(ResourceManager.FRAME_WIDTH, ResourceManager.FRAME_HEIGHT));
		setBackground(ResourceManager.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(rootPanel);

		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ImageFrame();
	}
}
