package swing;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import manager.ResourceManager;
import manager.WordTableManager;

public class SearchKeyAdapter extends KeyAdapter {
	private MainFrame mainFrame;
	private WhiteBorderTextField searchTextField;
	private WordTableManager wordManager;
	private ColorPanel resultPanel;
	private ImagePanel rootPanel;
	public SearchKeyAdapter(MainFrame mainFrame) {
		this.wordManager = mainFrame.getWordManager();
		this.searchTextField = mainFrame.getSearchTextField();
		this.mainFrame = mainFrame;
		this.rootPanel = this.mainFrame.getRootPanel();
		this.resultPanel = this.mainFrame.getResultPanel();
		
		mainFrame.setSearchFieldLocationThread();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		String searchText = searchTextField.getText();
		System.out.println(wordManager.selectLimitByName(searchText, 0, 5));
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
