package view.panel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImgPanel extends JPanel {
	private Image img;
	private int width;
	private int height;
	
	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public ImgPanel(File file) {
		
		setLayout(null);
		BufferedImage img = null;
		try {
			img = ImageIO.read(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.width = img.getWidth();
		this.height =img.getHeight();
		setSize(new Dimension(width, height));
		setPreferredSize(new Dimension(width, height));
	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}