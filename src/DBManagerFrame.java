import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class DBManagerFrame extends JFrame {
	private DBManager databaseManager;
	private int width;
	private int height;

	public DBManagerFrame(DBManager databaseManager) {
		this.databaseManager = databaseManager;
		ImagePanel flowerPanel = new ImagePanel("resources/img/flower.jpg");
		setLayout(new BorderLayout());
		width = flowerPanel.getWidth();
		height = flowerPanel.getHeight();
		if (width > 1280 || height > 768) {
			width = 1280;
			height = 768;
		}
		setSize(new Dimension(width, height));
		add(flowerPanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
