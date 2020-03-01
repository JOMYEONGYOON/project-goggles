package swing;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.SwingConstants;

import manager.WordTableManager;
import object.Word;

public class SearchKeyAdapter extends KeyAdapter {
	private MainFrame mainFrame;
	private WhiteBorderTextField searchTextField;
	private WordTableManager wordManager;
	private ColorPanel resultPanel;
	private ImagePanel rootPanel;
	private Vector<EmptyBackgroundButton> resultButtons;

	public SearchKeyAdapter(MainFrame mainFrame) {
		resultButtons = new Vector<EmptyBackgroundButton>();
		this.wordManager = mainFrame.getWordManager();
		this.searchTextField = mainFrame.getSearchTextField();
		this.mainFrame = mainFrame;
		this.rootPanel = this.mainFrame.getRootPanel();
		this.resultPanel = this.mainFrame.getResultPanel();
		resultPanel.setLayout(new GridLayout(5, 1));
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
				while (true) {
					int count = wordManager.count();
					if (mainFrame.isLogin()) {
						resultPanel.setVisible(true);
					} else {
						resultPanel.setVisible(false);
					}

					String searchText = searchTextField.getText();
					resultPanel.removeAll();
					ArrayList<Word> words = wordManager.selectLimitByName(searchText, (int)(Math.random()*count), 5);
					for (int i = 0; i < words.size(); i++) {
						String name = words.get(i).getName();
						EmptyBackgroundButton nameButton = new EmptyBackgroundButton(name);
						nameButton.setHorizontalAlignment(SwingConstants.LEFT);
						nameButton.setFont(new Font("맑은고딕", Font.PLAIN, 14));
						nameButton.setTime(System.currentTimeMillis());
						resultPanel.add(nameButton);
						resultButtons.add(nameButton);
					}
					
					try {
						Thread.sleep(5000);
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
