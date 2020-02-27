package dictionary;

import java.awt.Container;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import manager.SizeManager;
import manager.db.WordDBManager;
import object.Word;

public class SearchResultFrame extends JFrame {
	private Container container;
	private JTextArea textArea;

	public SearchResultFrame(JTextField textField) {

		// jTextField에서 입력된다고 생각하고
		System.out.println(textField.getText()); // 값 가져오는 방법
		// textField.setText(변수); 값 바꾸는 방법
		// 샘플데이터 , 나중에 데이터베이스로 가져올 것임

		WordDBManager wordDBManager = new WordDBManager();

		Vector<Word> searchResultList = wordDBManager.select();
		System.out.println(searchResultList);

		// ######### 결과하면을 나타내야하는 것 구현하기

		System.err.println("결과하면을 나타내야하는 것 구현하기 SearchResultFrame.java");

		// #######################################
		container = getContentPane();
		textArea = new JTextArea();
		textArea.setRows(10);

		// jTextArea

		// jTextArea container에 add하기

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(SizeManager.FRAME_WIDTH - 400, SizeManager.FRAME_HEIGHT - 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SearchResultFrame(new JTextField("샘플"));
	}
}
