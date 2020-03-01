package task1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import manager.WordTableManager;
import object.MySQL;
import object.Word;

public class WordSearchGUI {

	private JFrame frame;
	private JTextField searchTextField;
	private static DefaultListModel listModel;

	public WordSearchGUI() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Word Search Application");
		title.setFont(new Font("Garamond", Font.BOLD, 18));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(58, 11, 362, 21);
		frame.getContentPane().add(title);
		
		JLabel searchLabel = new JLabel("Search:");
		searchLabel.setFont(new Font("Garamond", Font.PLAIN, 16));
		searchLabel.setBounds(10, 60, 73, 14);
		frame.getContentPane().add(searchLabel);
		
		searchTextField = new JTextField();
		searchTextField.setBounds(58, 58, 395, 20);
		frame.getContentPane().add(searchTextField);
		searchTextField.setColumns(10);
		
		JButton searchButton = new JButton("Search");
		searchButton.setFont(new Font("Garamond", Font.BOLD, 16));
		searchButton.setBounds(184, 89, 89, 23);
		frame.getContentPane().add(searchButton);
		
		listModel = new DefaultListModel();
		JList list = new JList(listModel);
		//list.setModel(DefaultListModel);
		list.setBounds(61, 148, 359, 153);
		list.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(list);
		
        listModel = new DefaultListModel();
        list = new JList(listModel);
        
       
        listItems();

	}

    public static void listItems(){
        listModel.clear();
        MySQL mySQL = new MySQL();
        WordTableManager manager = new WordTableManager(mySQL);
        
        ArrayList<Word> items =  manager.selectByName();
        for(int i=0;i<items.size();i++){
        	Word i1 = items.get(i);
        	System.out.println(i1);
            listModel.addElement(i1); 
        }
    }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordSearchGUI window = new WordSearchGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} 
}