import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	private Image bgMainImage = null;
	private int width;
	private int height;

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(bgMainImage, 0, 0, null);
	}

	public Dimension getDimension() {
		return new Dimension();
	}

	public ImagePanel(String path) {
//		setSize(1280,931);
		try {
			this.bgMainImage = ImageIO.read(new File(path));
			width = bgMainImage.getWidth(null);
			height = bgMainImage.getHeight(null);
			setSize(new Dimension(width,height));
			setPreferredSize(new Dimension(width, height));
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

	}
}