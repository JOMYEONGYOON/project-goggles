package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Modal extends JDialog {
	public Modal(String str) {
		setSize(400, 260);
		setLayout(null);
		JLabel lb = new JLabel(str);
		lb.setBounds(100, 30, 200, 50);
		JTextField field = new JTextField(10);
		field.setBounds(100, 80, 200, 30);
//		
		JButton btn = new JButton("확인");
//		btn.setBounds(100,130, 200, 40);
//		btn.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e) {
//				label.setText(field.getText());
//				dispose();
//			}
//			
//		});

		add(field);
		add(btn);
		add(lb);
	}
}