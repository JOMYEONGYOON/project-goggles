package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import manager.ColorManager;
import manager.PathManager;
import manager.SizeManager;
import manager.StringManager;

public class MainFrame extends JFrame {
	private Container container;

	public MainFrame() {
		container = getContentPane();
		container.setLayout(new BorderLayout());
		ImagePanel rootPanel = new ImagePanel(PathManager.particleImagePath);

		rootPanel.setLayout(null);
		setSize(new Dimension(SizeManager.FRAME_WIDTH, SizeManager.FRAME_HEIGHT));
		getContentPane().add(rootPanel, BorderLayout.CENTER);
		setUndecorated(true);
		container.add(rootPanel);
		
		JPanel mainPanel = new ColorPanel(ColorManager.blackAlpha);
		mainPanel.setBounds(12, 74, 1320, 682);
		rootPanel.add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel projectNameLabel = new JLabel("Particle");
		projectNameLabel.setForeground(Color.WHITE);
		projectNameLabel.setFont(new Font("Indie Flower", Font.PLAIN, 64));
		projectNameLabel.setBackground(Color.WHITE);
		projectNameLabel.setBounds(12, 12, 238, 62);
		rootPanel.add(projectNameLabel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
}
