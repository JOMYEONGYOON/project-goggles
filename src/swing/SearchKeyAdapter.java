package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.SwingConstants;

import manager.WordTableManager;
import object.Word;

public class SearchKeyAdapter extends KeyAdapter {
	private MainFrame mainFrame;
	private WhiteBorderTextField searchTextField;
	private WordTableManager wordManager;
	private ColorPanel randomPanel;
	private ImagePanel rootPanel;
	private Vector<EmptyBackgroundButton> resultButtons;
	private ColorPanel resultPanel;
	private ColorPanel categoryPanel;
	
	public SearchKeyAdapter(MainFrame mainFrame) {
		this.categoryPanel=mainFrame.getCategoryPanel();
		resultPanel = mainFrame.getResultPanel();
		resultButtons = new Vector<EmptyBackgroundButton>();
		this.wordManager = mainFrame.getWordManager();
		this.searchTextField = mainFrame.getSearchTextField();
		this.mainFrame = mainFrame;
		this.rootPanel = this.mainFrame.getRootPanel();
		this.randomPanel = this.mainFrame.getRandomPanel();
		randomPanel.setLayout(new GridLayout(1, 3));
		mainFrame.setSearchFieldLocationThread();
//		Thread checkThread = new Thread() {
//
//			@Override
//			public void run() {
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				while (true) {
//					if (mainFrame.isLogin()) {
//						resultButtons = new Vector<EmptyBackgroundButton>();
//						for (int i = 0; i < resultButtons.size(); i++) {
//							long step = System.currentTimeMillis() - resultButtons.get(i).getTime();
//							float color = step / 7000.0F;
//							System.out.println(i + "/" + color);
//							resultPanel.setForeground(new Color(1.0F, 1.0F, 1.0F, color));
//							if (step > 7000) {
//								resultPanel.remove(resultButtons.get(i));
//
//							}
//						}
//						resultPanel.removeAll();
//					}
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//
//				}
//
//			}
//
//		};
//		checkThread.start();
		Thread addThread = new Thread() {

			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				while (true) {
					int count = wordManager.count();

					String searchText = searchTextField.getText();
					randomPanel.removeAll();
					ArrayList<Word> words = wordManager.selectLimitByName(searchText, (int) (Math.random() * count), 3);
					for (int i = 0; i < words.size(); i++) {
						String name = words.get(i).getName();
						EmptyBackgroundButton nameButton = new EmptyBackgroundButton(name);
						nameButton.setHorizontalAlignment(SwingConstants.LEFT);
						nameButton.setFont(new Font("맑은고딕", Font.PLAIN, 14));
						nameButton.setTime(System.currentTimeMillis());
						randomPanel.add(nameButton);
						resultButtons.add(nameButton);
						nameButton.addMouseListener(new MouseAdapter() {

							@Override
							public void mouseClicked(MouseEvent e) {
								resultPanel.removeAll();
								Word word = wordManager.selectByName(nameButton.getText());
								System.out.println(word.getName() + "/" + word.getCategory() + "/" + word.getDef());
								resultPanel.setBounds(randomPanel.getX(), randomPanel.getY() + 100,
										(int) randomPanel.getSize().getWidth(), 250);
								resultPanel.setLayout(new BorderLayout());
//								ColorPanel nameAndDefPanel = new ColorPanel(ResourceManager.NONE);
//								nameAndDefPanel.setLayout(new BorderLayout());
								WhiteLabel head = new WhiteLabel(word.getName() + "    [분류:" + word.getCategory() + "]");
								head.setForeground(Color.yellow);
								head.setFont(new Font("나눔고딕", Font.PLAIN, 14));
//								nameAndDefPanel.add(nameLabel, BorderLayout.WEST);
//								WhiteLabel categoryLabel = new WhiteLabel("[분류:"+word.getCategory()+"]");
//								categoryLabel.setFont(new Font("나눔고딕", Font.PLAIN, 12));
//								nameAndDefPanel.add(categoryLabel, BorderLayout.CENTER);
//								resultPanel.add(nameAndDefPanel, BorderLayout.NORTH);
								WhiteLabel defLabel = new WhiteLabel("<html><div>" + word.getDef() + "</div>");
								defLabel.setFont(new Font("나눔고딕", Font.PLAIN, 12));
								defLabel.setVerticalAlignment(SwingConstants.TOP);
								resultPanel.add(head, BorderLayout.NORTH);
//								resultPanel.add(categoryLabel, BorderLayout.SOUTH);
								resultPanel.add(defLabel, BorderLayout.CENTER);
								rootPanel.add(resultPanel);
								
							}

						});
					}

					if (mainFrame.isLogin()) {
						randomPanel.setVisible(true);
					} else {
						categoryPanel.setVisible(false);
						resultPanel.setVisible(false);
						randomPanel.setVisible(false);
					}
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		};
		addThread.start();
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
