package swing;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import manager.Manager;
import manager.SizeManager;

public class DBManagerFrame extends JFrame {
	private Manager manager;

	public DBManagerFrame(Manager manager) {
		this.manager = manager;
		ImagePanel flowerPanel = new ImagePanel(manager.getResourceManager().getParticleImagePath());
		getContentPane().setLayout(new BorderLayout());
		setSize(new Dimension(SizeManager.FRAME_WIDTH, SizeManager.FRAME_HEIGHT));
		getContentPane().add(flowerPanel, BorderLayout.CENTER);
		setUndecorated(true);
		flowerPanel.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

}
