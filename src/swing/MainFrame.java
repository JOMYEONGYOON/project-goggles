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
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import manager.ResourceManager;
import manager.WordTableManager;
import object.MySQL;
import object.Word;

public class MainFrame extends JFrame implements KeyListener, ActionListener {
	private JLabel leftFocusLabel;
	private JButton gogglesButton;
	private JLabel rightFocusLabel;
	private JPanel rootPanel;
	private JTextField textField;

	public MainFrame() {

		initComponent();
		setLocationComponents();
		setTheme();
		startFocusLabel();
		setGogglesButton();
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
		rootPanel.add(gogglesButton);
		textField.addKeyListener(this);
	}

	private void initComponent() {
		rootPanel = new ImagePanel(ResourceManager.KNOWLEDGE_2_IMG_PATH);
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
//						JPanel listPanel = new JPanel();
//						listPanel.setLayout(new BorderLayout());
//						Vector<Word> wordVector = new Vector<Word>();
//						WordTableManager wordTableManager = new WordTableManager();
//						JList<String> jList = new JList<>();
//						try {
//							wordTableManager.connect(new MySQL());
//						} catch (Exception e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//						Word word = wordTableManager.selectByName(textField.getText().trim());
//						if (word == null) {
//							wordVector = wordTableManager.selectByFirstName(textField.getText().charAt(0));
//							for (Word w : wordVector) {
//								jList.add(new JButton(w.getName()));
//							}
//						} else {
//							wordVector.add(word);
//							jList.add(new JButton(word.getName()));
//						}
//						listPanel.add(jList, BorderLayout.CENTER);
//						repaint();
//						break;
					}
					y -= step;
					try {
						sleep(2);
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

	private void setGogglesButton() {
		gogglesButton = new JButton("Goggles");
		gogglesButton.setBorderPainted(false);
		gogglesButton.setBorder(null);
		gogglesButton.setBackground(ResourceManager.BLACK_ALPHA);
		gogglesButton.setOpaque(false);
		gogglesButton.setFocusPainted(false);
		gogglesButton.setContentAreaFilled(false);
		gogglesButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				gogglesButton.removeMouseListener(this);
				Thread fadeout = new Thread() {

					@Override
					public void run() {
						int alpha = 255;
						Color color = ResourceManager.WHITE;

						while (true) {
							if (alpha < 0) {
								gogglesButton.setVisible(false);
								leftFocusLabel.setVisible(false);
								rightFocusLabel.setVisible(false);
								break;
							}
							color = new Color(1.0F, 1.0F, 1.0F, alpha / 256.0F);
							alpha = alpha - 30;
							try {
								Thread.sleep(100);
								gogglesButton.setForeground(color);
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
						textField.setBounds(470, 350, 300, 50);
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

		});
		gogglesButton.setLocation(25, 25);
		gogglesButton.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 96));
		gogglesButton.setForeground(Color.WHITE);
		gogglesButton.setSize(1235, 668);
		gogglesButton.setSize(ResourceManager.FRAME_WIDTH - 100, ResourceManager.FRAME_HEIGHT - 100);
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