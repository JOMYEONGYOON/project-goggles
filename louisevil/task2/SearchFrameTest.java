package task2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import manager.ResourceManager;
import swing.ImagePanel;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;

public class SearchFrameTest extends JFrame implements KeyListener, ActionListener {
	private JPanel rootPanel;
	private JTextField textField;

	public SearchFrameTest() {
		initComponent();
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
		textField.addKeyListener(this);
	}

	private void initComponent() {
		rootPanel = new ImagePanel(ResourceManager.PARTICLE_IMG_PATH);
		rootPanel.setBackground(ResourceManager.BLACK);
		rootPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		rootPanel.setLayout(new CardLayout(0, 0));
		textField = new JTextField(10);
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
//						System.out.println(x + "/" + y);
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

	public static void main(String[] args) {
		new SearchFrameTest();
	}
}
