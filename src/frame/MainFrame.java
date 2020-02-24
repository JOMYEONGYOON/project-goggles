package frame;

import javax.swing.JFrame;

import controller.MainFrameControlable;

public class MainFrame extends JFrame implements MainFrameControlable {
	private static final long serialVersionUID = 1L;
	private static MainFrame frame;

	private MainFrame() {
		frame = new MainFrame();
	}

	public static MainFrame getInstance() {
		if (frame != null) {
			return frame;
		}
		return frame;
	}
}
