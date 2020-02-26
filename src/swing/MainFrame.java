package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import manager.ColorManager;
import manager.PathManager;
import manager.SizeManager;

public class MainFrame extends JFrame implements KeyListener {
	private JPanel rootPanel;
	private JTextField textField;

	public MainFrame() {
		rootPanel = new ImagePanel(PathManager.PARTICLE_IMG_PATH);
		rootPanel.setBackground(new Color(240, 240, 240));
		rootPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		setSize(new Dimension(SizeManager.FRAME_WIDTH, SizeManager.FRAME_HEIGHT));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(rootPanel);
		rootPanel.setLayout(null);

		textField = new JTextField(10);
		textField.setForeground(ColorManager.WHITE);
		textField.setBounds(147, 111, 175, 32);
		textField.setBackground(ColorManager.WHITE_ALPHA);
		textField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textField.addKeyListener(this);
		rootPanel.add(textField);

		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		Thread repaintThread = new Thread() {
			@Override
			public void run() {
				while(true) {
					repaint();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		repaintThread.start();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		rootPanel.repaint();
		textField.repaint();

	}

	@Override
	public void keyPressed(KeyEvent e) {
		rootPanel.repaint();
		textField.repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		rootPanel.repaint();
		textField.repaint();

	}
}
