package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import manager.ResourceManager;

public class MainFrame extends JFrame implements KeyListener, ActionListener {
	private JLabel leftFocusLabel;
	private JButton particleButton;
	private JLabel rightFocusLabel;
	private JPanel rootPanel;
	private boolean safeMode = true;
	private JTextField textField;

	public MainFrame() {
		initComponent();
		setLocationComponents();
		setTheme();
		startFocusLabel();
		setParticleButton();
		sertRootPanel();
		addComponents();
		setMainFrame();
		runUIRepaintThread();
	}

	private void runUIRepaintThread() {
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
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		System.out.println(command);

	}

	private void addComponents() {
		rootPanel.add(leftFocusLabel);
		rootPanel.add(rightFocusLabel);
		rootPanel.add(particleButton);
		textField.addKeyListener(this);
	}

	private void initComponent() {
		rootPanel = new ImagePanel(ResourceManager.PARTICLE_IMG_PATH);
		rootPanel.setBackground(ResourceManager.BLACK);
		rootPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		textField = new JTextField(10);
		leftFocusLabel = new JLabel(">>");
		rightFocusLabel = new JLabel("<<");
		leftFocusLabel.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 96));
		rightFocusLabel.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 96));
	}

	@Override
	public void keyPressed(KeyEvent e) {
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			setTextFieldLocationThread();
		}
	}

	private void setTextFieldLocationThread() {
		Thread th = new Thread() {
			@Override
			public void run() {
				int step = 1;
				int x = textField.getX();
				int y = textField.getY();
				while (true) {
					if (y < 50) {
						System.out.println(x + "/" + y);
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

	@Override
	public void keyTyped(KeyEvent e) {
		repaint();

	}

	private void sertRootPanel() {
		rootPanel.setLayout(null);
	}

	private void setLocationComponents() {
		leftFocusLabel.setBounds(25, 309, 100, 100);
		rightFocusLabel.setBounds(1160, 309, 100, 100);
	}

	private void setMainFrame() {
		setSize(new Dimension(ResourceManager.FRAME_WIDTH, ResourceManager.FRAME_HEIGHT));
		setBackground(ResourceManager.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().add(rootPanel);

		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	private void setParticleButton() {
		particleButton = new JButton("Particle");
		particleButton.setBorderPainted(false);
		particleButton.setBorder(null);
		particleButton.setBackground(ResourceManager.BLACK_ALPHA);
		particleButton.setOpaque(false);
		particleButton.setFocusPainted(false);
		particleButton.setContentAreaFilled(false);
		particleButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (safeMode) {
					Thread fadeout = new Thread() {

						@Override
						public void run() {
							int alpha = 255;
							Color color = ResourceManager.WHITE;
							while (true) {
								if (alpha < 0) {
									particleButton.setVisible(false);
									leftFocusLabel.setVisible(false);
									rightFocusLabel.setVisible(false);
									break;
								}
								color = new Color(1.0F, 1.0F, 1.0F, alpha / 256.0F);
								alpha = alpha - 30;
								try {
									Thread.sleep(100);
									particleButton.setForeground(color);
									repaint();
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
						}

					};
					fadeout.start();
					Thread textFieldThread = new Thread() {

						@Override
						public void run() {
							rootPanel.add(textField);
							textField.setBounds(147, 111, 175, 32);
							textField.setBackground(ResourceManager.NONE);
							textField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
							textField.setFocusable(true);
							Color color = ResourceManager.NONE;
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

			}

		});
		particleButton.setLocation(25, 25);
		particleButton.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 96));
		particleButton.setForeground(Color.WHITE);
		particleButton.setSize(1235, 668);
		particleButton.setSize(ResourceManager.FRAME_WIDTH - 100, ResourceManager.FRAME_HEIGHT - 100);
	}

	private void setTheme() {

		leftFocusLabel.setForeground(ResourceManager.WHITE_ALPHA);
		rightFocusLabel.setForeground(ResourceManager.WHITE_ALPHA);
	}

	private void startFocusLabel() {
		Thread focusLabelThread = new Thread() {

			@Override
			public void run() {
				int alpha = 0;
				int leftX = 25;
				Color color = null;
				int rightX = ResourceManager.FRAME_WIDTH - 100;
				int flag = -1;
				while (true) {
					if (alpha > 128 || alpha < 0) {
						flag = flag * -1;
					}
					leftX = leftX + flag;
					rightX = rightX - flag;
					alpha = alpha + flag;

					try {
						color = new Color(1.0F, 1.0F, 1.0F, alpha / 256.0F);
						leftFocusLabel.setForeground(color);
						rightFocusLabel.setForeground(color);
						leftFocusLabel.setLocation(leftX, 300);
						rightFocusLabel.setLocation(rightX, 300);
						repaint();

						sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}

		};
		focusLabelThread.start();
	}
	public static void main(String[] args) {
		
	}
}
