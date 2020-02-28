package task1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import manager.db.DictionaryDatabaseManager;
import object.MySQL;

public class ManagerLoginFrame extends JFrame {
	private DictionaryDatabaseManager dictionaryDatabaseManager;
	private static final long serialVersionUID = 1L;
	private JTextField idTextField;
	private JPasswordField pwTextField;
	private JTextField ipTextField;
	private JTextField propertiesTextField;

	public ManagerLoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setFont(new Font("Dialog", Font.PLAIN, 10));
		this.setSize(800, 500);
		getContentPane().setLayout(null);

		JLabel mysqlIdLabel = new JLabel("MySQL ID");
		mysqlIdLabel.setFont(new Font("Dialog", Font.PLAIN, 10));
		mysqlIdLabel.setBounds(12, 64, 112, 15);
		getContentPane().add(mysqlIdLabel);

		JLabel mysqlPasswordLabel = new JLabel("MySQL PW");
		mysqlPasswordLabel.setFont(new Font("Dialog", Font.PLAIN, 10));
		mysqlPasswordLabel.setBounds(12, 89, 112, 15);
		getContentPane().add(mysqlPasswordLabel);

		idTextField = new JTextField();
		idTextField.setFont(new Font("Dialog", Font.PLAIN, 10));
		idTextField.setText("root");
		idTextField.setBounds(136, 61, 137, 21);
		getContentPane().add(idTextField);
		idTextField.setColumns(10);

		pwTextField = new JPasswordField();
		pwTextField.setFont(new Font("Dialog", Font.PLAIN, 10));
		pwTextField.setText("1234");
		pwTextField.setBounds(136, 86, 137, 21);
		getContentPane().add(pwTextField);

		ipTextField = new JTextField();
		ipTextField.setFont(new Font("Dialog", Font.PLAIN, 10));
		ipTextField.setText("127.0.0.1");
		ipTextField.setBounds(136, 11, 137, 21);
		getContentPane().add(ipTextField);
		ipTextField.setColumns(10);

		JLabel lblMysqlUrl = new JLabel("MySQL Server IP");
		lblMysqlUrl.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblMysqlUrl.setBounds(12, 14, 112, 15);
		getContentPane().add(lblMysqlUrl);

		JLabel lblMysqlProperties = new JLabel("MySQL Properties");
		lblMysqlProperties.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblMysqlProperties.setBounds(12, 39, 119, 15);
		getContentPane().add(lblMysqlProperties);

		propertiesTextField = new JTextField();
		propertiesTextField.setFont(new Font("Dialog", Font.PLAIN, 10));
		propertiesTextField
				.setText("?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true");
		propertiesTextField.setColumns(10);
		propertiesTextField.setBounds(136, 37, 137, 21);
		getContentPane().add(propertiesTextField);

		JPanel panel = new JPanel();
		panel.setBounds(12, 186, 756, 245);
		getContentPane().add(panel);
		panel.setLayout(null);

		
//		


		JButton connectButton = new JButton("연결");
		connectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String connectResult = "";
				try {
					dictionaryDatabaseManager = new DictionaryDatabaseManager();
					MySQL mySQL = new MySQL();
					mySQL.setIp(ipTextField.getText());
					mySQL.setId(idTextField.getText());
					mySQL.setPassword(pwTextField.getText());
					mySQL.setProperties(propertiesTextField.getText());
					dictionaryDatabaseManager.connect(mySQL);
					connectResult = "데이터베이스 연결 성공";
				} catch (Exception e) {
					connectResult = "데이터베이스 연결 실패";
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(ManagerLoginFrame.this, connectResult);
			}
		});
		connectButton.setFont(new Font("Dialog", Font.PLAIN, 10));
		connectButton.setBounds(287, 11, 73, 94);
		getContentPane().add(connectButton);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	// test
	public static void main(String[] args) {
		new ManagerLoginFrame();
	}
}
