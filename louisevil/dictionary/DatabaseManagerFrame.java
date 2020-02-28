package dictionary;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DatabaseManagerFrame extends JFrame{
	public DatabaseManagerFrame() {
		getContentPane().setLayout(null);
		
		JButton deleteDatabaseButton = new JButton("데이터베이스 삭제");
		deleteDatabaseButton.setBounds(12, 195, 154, 23);
		getContentPane().add(deleteDatabaseButton);
		
		JButton deleteMemberTableButton = new JButton("사용자 테이블 삭제");
		deleteMemberTableButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deleteMemberTableButton.setBounds(178, 195, 154, 23);
		getContentPane().add(deleteMemberTableButton);
		
		JButton deleteWordTableButton = new JButton("단어 테이블 삭제");
		deleteWordTableButton.setBounds(344, 195, 154, 23);
		getContentPane().add(deleteWordTableButton);
		
		JButton createDatabaseButton = new JButton("데이터베이스 생성");
		createDatabaseButton.setBounds(12, 162, 154, 23);
		getContentPane().add(createDatabaseButton);
		
		JButton createMemberTableButton = new JButton("사용자 테이블 생성");
		createMemberTableButton.setBounds(178, 162, 154, 23);
		getContentPane().add(createMemberTableButton);
		
		JButton createWordTableButton = new JButton("단어 테이블 생성");
		createWordTableButton.setBounds(344, 162, 154, 23);
		getContentPane().add(createWordTableButton);
		
		JButton initDatabaseButton = new JButton("데이터베이스 초기화");
		initDatabaseButton.setBounds(12, 228, 154, 23);
		getContentPane().add(initDatabaseButton);
		
		JButton memberDatabaseButton = new JButton("사용자 테이블 초기화");
		memberDatabaseButton.setBounds(178, 228, 154, 23);
		getContentPane().add(memberDatabaseButton);
		
		JButton wordDatabaseButton = new JButton("단어 테이블 초기화");
		wordDatabaseButton.setBounds(344, 228, 154, 23);
		getContentPane().add(wordDatabaseButton);
	}
}
