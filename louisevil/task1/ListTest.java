package task1;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JList;

import manager.WordTableManager;
import object.MySQL;

public class ListTest extends JFrame {
	String[] fruits = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry" };

	public ListTest() {
		this.setTitle("리스트 만들기 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		WordTableManager wordManager = new WordTableManager();
		try {
			wordManager.connect(new MySQL());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//        JList strList = new JList(fruits);
//        this.add(strList);

//        JList imageList = new JList(images);
//        this.add(imageList);
		int limit_start = 0;
		int limit_end = limit_start + 10;
		ArrayList<String> words = wordManager.getNamesLimit(limit_start, limit_end);
		String[] wordArray = new String[words.size()];
		for (int i = 0; i < wordArray.length; i++) {
			wordArray[i] = words.get(i);
		}
		JList jList = new JList(wordArray);
		add(jList);

		this.setLocationRelativeTo(null);
		this.setSize(300, 300);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new ListTest();
	}

}