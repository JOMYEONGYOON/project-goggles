package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import manager.ColorManager;
import manager.PathManager;
import manager.SizeManager;
import javax.swing.JLabel;

public class MainFrame extends JFrame implements KeyListener {
	private JPanel rootPanel;
	private JTextField textField;

	public MainFrame() {
		setBackground(ColorManager.BLACK);
		rootPanel = new ImagePanel(PathManager.PARTICLE_IMG_PATH);
		rootPanel.setBackground(ColorManager.BLACK);
		rootPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		textField = new JTextField(10);
		setSize(new Dimension(SizeManager.FRAME_WIDTH, SizeManager.FRAME_HEIGHT));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(rootPanel);
		rootPanel.setLayout(null);
		
		JLabel particle = new JLabel("Particle");
		
		rootPanel.add(particle);
		textField.addKeyListener(this);

		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		Thread repaintThread = new Thread() {
			@Override
			public void run() {
				while (true) {
					repaint();
					try {
						sleep(60);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		repaintThread.start();

		Thread textFieldThread = new Thread() {

			@Override
			public void run() {
				rootPanel.add(textField);
				textField.setBounds(147, 111, 175, 32);
				textField.setBackground(ColorManager.NONE);
				textField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				textField.setFocusable(true);
				Color color = ColorManager.NONE;
				int alpha = color.getAlpha();
				while (true) {
					if (alpha > 192) {
						break;
					}
					alpha++;
					color = new Color(1.0F, 1.0F, 1.0F, alpha / 256.0F);
					try {
						Thread.sleep(15);
						textField.setBackground(color);
						repaint();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}

		};
		textFieldThread.start();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			Thread th = new Thread() {

				@Override
				public void run() {
					int step = 1;
					int x = textField.getX();
					int y = textField.getY();
					while (true) {
						if (y < 50) {
							//147,49
							System.out.println(x+"/"+y);
							JTextArea resultArea = new JTextArea();
							rootPanel.add(resultArea);
							break;
						}
						y -= step;
						try {
							sleep(15);

							repaint();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						textField.setLocation(x, y);
					}
				}

			};
			th.start();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		repaint();

	}
}
