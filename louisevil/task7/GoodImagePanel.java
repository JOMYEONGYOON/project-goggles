package task7;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GoodImagePanel extends JPanel {
	private Image bgMainImage = null;

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(bgMainImage, 0, 0,bgMainImage.getWidth(null), bgMainImage.getHeight(null), null);
	}

	public Dimension getDimension() {
		return new Dimension();
	}

	public GoodImagePanel(String path) {
		try {
			this.bgMainImage = ImageIO.read(new File(path));
			setPreferredSize(new Dimension(bgMainImage.getWidth(null), bgMainImage.getHeight(null)));
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

	}
}
