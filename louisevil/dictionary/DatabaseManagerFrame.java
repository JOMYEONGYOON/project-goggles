package dictionary;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import java.awt.GridLayout;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JProgressBar;

public class DatabaseManagerFrame extends JFrame{
	private JTextField txtRoot;
	private JPasswordField passwordField;
	private JTextField txtJdbcmysqllocalhostdictionary;
	private JTextField txtcharacterencodingutfservertimezoneutcusesslfalseallowpublickeyretrievaltrue;
	public DatabaseManagerFrame() {
		getContentPane().setLayout(null);
		
		JButton deleteDatabaseButton = new JButton("데이터베이스 삭제");
		deleteDatabaseButton.setBounds(12, 187, 154, 23);
		getContentPane().add(deleteDatabaseButton);
		
		JButton deleteMemberTableButton = new JButton("사용자 테이블 삭제");
		deleteMemberTableButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deleteMemberTableButton.setBounds(178, 187, 154, 23);
		getContentPane().add(deleteMemberTableButton);
		
		JButton deleteWordTableButton = new JButton("단어 테이블 삭제");
		deleteWordTableButton.setBounds(344, 187, 154, 23);
		getContentPane().add(deleteWordTableButton);
		
		JButton createDatabaseButton = new JButton("데이터베이스 생성");
		createDatabaseButton.setBounds(12, 154, 154, 23);
		getContentPane().add(createDatabaseButton);
		
		JButton createMemberTableButton = new JButton("사용자 테이블 생성");
		createMemberTableButton.setBounds(178, 154, 154, 23);
		getContentPane().add(createMemberTableButton);
		
		JButton createWordTableButton = new JButton("단어 테이블 생성");
		createWordTableButton.setBounds(344, 154, 154, 23);
		getContentPane().add(createWordTableButton);
		
		JButton initDatabaseButton = new JButton("데이터베이스 초기화");
		initDatabaseButton.setBounds(12, 220, 154, 23);
		getContentPane().add(initDatabaseButton);
		
		JButton memberDatabaseButton = new JButton("사용자 테이블 초기화");
		memberDatabaseButton.setBounds(178, 220, 154, 23);
		getContentPane().add(memberDatabaseButton);
		
		JButton wordDatabaseButton = new JButton("단어 테이블 초기화");
		wordDatabaseButton.setBounds(344, 220, 154, 23);
		getContentPane().add(wordDatabaseButton);
		
		JLabel mysqlIdLabel = new JLabel("MySQL ID");
		mysqlIdLabel.setBounds(12, 64, 112, 15);
		getContentPane().add(mysqlIdLabel);
		
		JLabel mysqlPasswordLabel = new JLabel("MySQL PW");
		mysqlPasswordLabel.setBounds(12, 89, 112, 15);
		getContentPane().add(mysqlPasswordLabel);
		
		txtRoot = new JTextField();
		txtRoot.setText("root");
		txtRoot.setBounds(136, 61, 277, 21);
		getContentPane().add(txtRoot);
		txtRoot.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setText("1234");
		passwordField.setBounds(136, 86, 277, 21);
		getContentPane().add(passwordField);
		
		txtJdbcmysqllocalhostdictionary = new JTextField();
		txtJdbcmysqllocalhostdictionary.setText("127.0.0.1");
		txtJdbcmysqllocalhostdictionary.setBounds(136, 11, 277, 21);
		getContentPane().add(txtJdbcmysqllocalhostdictionary);
		txtJdbcmysqllocalhostdictionary.setColumns(10);
		
		JLabel lblMysqlUrl = new JLabel("MySQL Server IP");
		lblMysqlUrl.setBounds(12, 14, 112, 15);
		getContentPane().add(lblMysqlUrl);
		
		JLabel lblMysqlProperties = new JLabel("MySQL Properties");
		lblMysqlProperties.setBounds(12, 39, 119, 15);
		getContentPane().add(lblMysqlProperties);
		
		txtcharacterencodingutfservertimezoneutcusesslfalseallowpublickeyretrievaltrue = new JTextField();
		txtcharacterencodingutfservertimezoneutcusesslfalseallowpublickeyretrievaltrue.setFont(new Font("굴림", Font.PLAIN, 10));
		txtcharacterencodingutfservertimezoneutcusesslfalseallowpublickeyretrievaltrue.setText("?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true");
		txtcharacterencodingutfservertimezoneutcusesslfalseallowpublickeyretrievaltrue.setColumns(10);
		txtcharacterencodingutfservertimezoneutcusesslfalseallowpublickeyretrievaltrue.setBounds(136, 37, 277, 21);
		getContentPane().add(txtcharacterencodingutfservertimezoneutcusesslfalseallowpublickeyretrievaltrue);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 253, 495, 178);
		getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		panel.add(textArea, BorderLayout.CENTER);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setMinimum(1);
		progressBar.setBounds(12, 130, 495, 14);
		getContentPane().add(progressBar);
		
		JButton connectButton = new JButton("연결");
		connectButton.setBounds(425, 10, 82, 94);
		getContentPane().add(connectButton);
	}
}
