import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DBManagerFrame extends JFrame {
	private DBManager databaseManager;

	public DBManagerFrame(DBManager databaseManager) {
		this.databaseManager = databaseManager;
		ImagePanel flowerPanel = new ImagePanel(PATH.old);
		getContentPane().setLayout(new BorderLayout());
		setSize(new Dimension(SIZE.FRAME_WIDTH, SIZE.FRAME_HEIGHT));
		getContentPane().add(flowerPanel, BorderLayout.CENTER);
		flowerPanel.setLayout(null);
		
		JLabel goggles = new JLabel("Goggles");
		goggles.setBounds(612, 348, 240, 67);
		flowerPanel.add(goggles);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
}
