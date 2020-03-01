package task2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import manager.ResourceManager;
import swing.ColorPanel;
import swing.ImagePanel;

public class MainFrameTest extends JFrame implements KeyListener, ActionListener {
//	private ImageIcon searchImageIcon;
	private ColorPanel resultPanel; 
	private WhiteLabel leftFocusLabel;
	private EmptyBackgroundButton gogglesButton;
	private WhiteLabel rightFocusLabel;
	private ImagePanel rootPanel;
	private WhiteBorderTextField searchTextField;
	private WhiteLabel goggles;
//	private EmptyBackgroundButton searchButton;
	private EmptyBackgroundButton signUpButton;
	private EmptyBackgroundButton signInButton;
	private boolean checkSignIn = false;
	private SignInPanel signInPanel;
	private SignUpPanel signUpPanel;
	
	public WhiteBorderTextField getSearchTextField() {
		return searchTextField;
	}

	public void setSearchTextField(WhiteBorderTextField searchTextField) {
		this.searchTextField = searchTextField;
	}

	public MainFrameTest() {

		initComponents();
		setLocationComponents();
		setTheme();
		startFocusLabel();
		setGogglesButton();
//		setSearchButton();
		sertRootPanel();
		addComponents();
		setMainFrame();
		runUIRepaintThread();
		changeImageThread();
	}

	private void changeImageThread() {

		Thread changeImageThread = new Thread() {
			@Override
			public void run() {
//				rootPanel.setBackground(Color.WHI);
				int imageIndex = 1;
				while (true) {
					if (imageIndex > 4) {
						imageIndex = 1;
					}
					try {
						ColorPanel stopPanel = new ColorPanel(ResourceManager.WHITE);
						sleep(7000);
						stopPanel.setLayout(null);
						stopPanel.setBounds(0, 0, ResourceManager.FRAME_WIDTH, ResourceManager.FRAME_HEIGHT);

//						Thread th = new Thread() {
//
//							@Override
//							public void run() {
//								try {
//									add(stopPanel);
//									for (int i = 0; i < 120; i++) {
//										Color color = new Color(1F, 1F, 1F,i / 120F);
//										stopPanel.setBackground(color);
//										Thread.sleep(5);
//									}
//									for (int i = 120; i >= 0; i--) {
//										Color color = new Color(1F, 1F, 1F, i / 120F);
//										stopPanel.setBackground(color);
//										Thread.sleep(5);
//									}
//									remove(stopPanel);
//								} catch (Exception e) {
//									e.printStackTrace();
//								}
//							}
//
//						};
//						th.start();
						rootPanel.changeImage("resources\\image\\goggles-" + imageIndex + ".jpg");

						imageIndex++;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		changeImageThread.start();
	}

	private void runUIRepaintThread() {
		Thread repaintThread = new Thread() {
			@Override
			public void run() {
				while (true) {
					repaint();
					try {
						sleep(1);
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
//		textField.addKeyListener(this);
	}

	private void initComponents() {
		signUpButton = new EmptyBackgroundButton("[회원가입]");
		signInButton = new EmptyBackgroundButton("[로그인]");

//		searchImageIcon = new ImageIcon();
//		setImageIcon();
//		searchButton = new EmptyBackgroundButton(searchImageIcon);

		goggles = new WhiteLabel("Goggles");
		rootPanel = new ImagePanel(ResourceManager.KNOWLEDGE_2_IMG_PATH);
	
		rootPanel.setBackground(ResourceManager.BLACK);
		rootPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		searchTextField = new WhiteBorderTextField();
//		searchTextField.setForeground(Color.yellow);
		searchTextField.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 24));
		searchTextField.setText("    단어를 검색하려면 로그인이 필요합니다.");
		searchTextField.setEditable(false);
//		textField.setFont(new F);
		leftFocusLabel = new WhiteLabel(">>");
		rightFocusLabel = new WhiteLabel("<<");
		leftFocusLabel.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 96));
		rightFocusLabel.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 96));
		signInButton.setForeground(Color.white);
		signUpButton.setForeground(Color.white);
		signInButton.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 24));
		signUpButton.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 24));
	}

//	private void setImageIcon() {
//		BufferedImage bi = null;
//		try {
//			bi = ImageIO.read(new File("resources\\image\\search_icon.png"));
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		searchImageIcon.setImage(bi);
//
//	}

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
				int textField_x = searchTextField.getX();
				int textField_y = searchTextField.getY();
				int goggles_x = goggles.getX();
				int goggles_y = goggles.getY();
				while (true) {
					if (textField_y < 150) {

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
//								jList.add(new EmptyBackgroundButton(w.getName()));
//							}
//						} else {
//							wordVector.add(word);
//							jList.add(new EmptyBackgroundButton(word.getName()));
//						}
//						listPanel.add(jList, BorderLayout.CENTER);
//						repaint();
						break;
					}
					textField_y -= step;
					goggles_y -= step;
					try {
						sleep(2);
						repaint();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					goggles.setLocation(goggles_x, goggles_y);
					searchTextField.setLocation(textField_x, textField_y);

				}
				Thread googleMoveThread = new Thread() {

					@Override
					public void run() {
						int goggles_x = goggles.getX();
						int goggles_y = goggles.getY();
						while (true) {
							if (goggles_x < 100) {
								break;
							}
//							textField_x -= step;
							goggles_x -= step;
							try {
								sleep(1);

							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							goggles.setLocation(goggles_x, goggles_y);
						}
					}

				};
				googleMoveThread.start();
				Thread tfMoveThread = new Thread() {

					@Override
					public void run() {
						int textField_x = searchTextField.getX();
						int textField_y = searchTextField.getY();
						while (true) {
							if (textField_y < 50) {
								break;
							}
							textField_y -= step;
							try {
								sleep(3);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							searchTextField.setLocation(textField_x, textField_y);
						}
					}

				};
				tfMoveThread.start();
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
		signUpButton.setBounds(1160, 10, 100, 25);
		signInButton.setBounds(1048, 10, 100, 25);
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

	private void setSignInButton() {
		signInButton.setBorderPainted(false);
		signInButton.setBorder(new MatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
		signInButton.setBackground(ResourceManager.BLACK_ALPHA);
		signInButton.setOpaque(false);
		signInButton.setFocusPainted(false);
		signInButton.setContentAreaFilled(false);
		signInButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (signInPanel != null) {
					rootPanel.remove(signInPanel);
					
				}
				if (signUpPanel != null) {
					rootPanel.remove(signUpPanel);
				}
				signInPanel = new SignInPanel(MainFrameTest.this);
				signInPanel.setBackground(ResourceManager.BLACK_ALPHA);
				signInPanel.setBounds(ResourceManager.FRAME_WIDTH-400,100,388,350);
				rootPanel.add(signInPanel);
			}
			
		});
	}

	private void setSignUpButton() {
		signUpButton.setBorderPainted(false);
		signUpButton.setBorder(new MatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
		signUpButton.setBackground(ResourceManager.BLACK_ALPHA);
		signUpButton.setOpaque(false);
		signUpButton.setFocusPainted(false);
		signUpButton.setContentAreaFilled(false);
		signUpButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (signInPanel != null) {
					rootPanel.remove(signInPanel);
					
				}
				if (signUpPanel != null) {
					rootPanel.remove(signUpPanel);
				}

				signUpPanel = new SignUpPanel(MainFrameTest.this);
				signUpPanel.setBackground(ResourceManager.BLACK_ALPHA);
				signUpPanel.setBounds(ResourceManager.FRAME_WIDTH-400,100,388,500);
				rootPanel.add(signUpPanel);
			}
			
		});
	}

//	private void setSearchButton() {
//		searchButton.setPreferredSize(new Dimension(100, 50));
//		searchButton.setBorderPainted(false);
//		searchButton.setBorder(null);
//		searchButton.setBackground(ResourceManager.BLACK_ALPHA);
//		searchButton.setOpaque(false);
//		searchButton.setFocusPainted(false);
//		searchButton.setContentAreaFilled(false);
//
//	}

	private void setGogglesButton() {
		gogglesButton = new EmptyBackgroundButton("Goggles");
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
				gogglesButton.setVisible(false);

				setSignInButton();
				setSignUpButton();
				rootPanel.add(signUpButton);
				rootPanel.add(signInButton);
				rootPanel.validate();
//				System.out.println(signUpButton.isVisible());
				rootPanel.add(signInButton);
				Thread fadeout = new Thread() {

					@Override
					public void run() {
						int alpha = 0;
						while (true) {
							if (alpha > 255) {

								leftFocusLabel.setVisible(false);
								rightFocusLabel.setVisible(false);
								break;
							}
							Color color = new Color(1.0F, 1.0F, 1.0F, alpha / 255.0F);
							alpha = alpha + 1;
							signInButton.setForeground(color);
							signUpButton.setForeground(color);
							try {
								Thread.sleep(1);
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

						goggles.setFont(new Font("나눔손글씨 펜", Font.PLAIN, 96));
						goggles.setForeground(Color.WHITE);
						goggles.setHorizontalAlignment(SwingConstants.CENTER);
						goggles.setBounds(465, 259, 300, 200);
						rootPanel.add(goggles);
						gogglesButton.setVisible(false);
						int goggles_y = goggles.getY();

						while (true) {
							goggles_y--;
							if (goggles_y < 180) {
								rootPanel.add(searchTextField);
//								rootPanel.add(searchButton);
//								searchButton.setBounds(790, 345, 64, 64);
								searchTextField.setBounds(470, 350, 300, 50);
//								textField.setBackground(ResourceManager.NONE);
//								textField.setBorder(new MatteBorder(1, 1, 1, 1, new Color(255, 255, 255)));
								searchTextField.setFocusable(true);
								Color color = ResourceManager.NONE;
								int alpha = color.getAlpha();

								while (true) {
									if (alpha > 150) {
										break;
									}
									alpha++;
									color = new Color(1.0F, 1.0F, 1.0F, alpha / 256.0F);
									try {
										Thread.sleep(10);
//										textField.setBackground(color);
										repaint();
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
								break;
							}
							try {
								Thread.sleep(10);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							goggles.setLocation(goggles.getX(), goggles_y);
						}

//						

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
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrameTest window = new MainFrameTest();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}