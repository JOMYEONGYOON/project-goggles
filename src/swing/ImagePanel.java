package swing;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import manager.SizeManager;

public class ImagePanel extends JPanel {
	private Image bgMainImage = null;

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(bgMainImage, 0, 0, SizeManager.FRAME_WIDTH, SizeManager.FRAME_HEIGHT, null);
	}

	public Dimension getDimension() {
		return new Dimension();
	}

	public ImagePanel(String path) {
		try {
			this.bgMainImage = ImageIO.read(new File(path));
			setSize(new Dimension(SizeManager.FRAME_WIDTH, SizeManager.FRAME_HEIGHT));
			setPreferredSize(new Dimension(SizeManager.FRAME_WIDTH, SizeManager.FRAME_HEIGHT));
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

	}
}