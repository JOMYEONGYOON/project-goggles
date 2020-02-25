package frame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import vo.SizeVO;

public class RootFrame extends JFrame implements SizeVO{
	public RootFrame() {
		setLocationCenter();
	}
	public void setLocationCenter() {

		try {
			SwingUtilities.updateComponentTreeUI(this);
			Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
			setSize(FRAME_WIDTH, FRAME_HEIGHT);
			setLocation((int) (dimension.getWidth() / 2 - FRAME_WIDTH / 2), (int) (dimension.getHeight() / 2 - FRAME_HEIGHT / 2));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
