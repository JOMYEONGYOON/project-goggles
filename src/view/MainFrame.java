package view;

import javax.swing.JFrame;

import controller.MainFrameControlable;

public class MainFrame extends JFrame implements MainFrameControlable {
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		initView(this);
	}
}
