package task1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class DatabaseManagerFrame extends JFrame {
	private JPanel southPanel;
	private JPanel panel;
	private JScrollPane textAreaScrollPane;
	private JPanel northPanel;
	private JScrollPane scrollPane;
	private JPanel textAreaCenterPanel;
	private JTextArea textArea;
	private JPanel iconCenterPanel;
	private JTextField textField;

	public DatabaseManagerFrame() {
		textArea = new JTextArea();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setFont(new Font("Dialog", Font.PLAIN, 10));
		setSize(800, 500);
		getContentPane().setLayout(null);
		panel = new JPanel();
		getContentPane().setLayout(new BorderLayout(0, 0));
		panel.setLayout(new BorderLayout(0, 0));
		addTextAreaCenterPanel();

		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scrollPane, BorderLayout.WEST);

		FileJTree sqlTree = new FileJTree("resources\\sql");
		scrollPane.setViewportView(sqlTree);
		System.out.println(sqlTree);

		northPanel = new JPanel();
		panel.add(northPanel, BorderLayout.NORTH);
		northPanel.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		northPanel.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);

		JButton runButton = new JButton("Run");
		northPanel.add(runButton, BorderLayout.EAST);

		southPanel = new JPanel();
		panel.add(southPanel, BorderLayout.SOUTH);
		southPanel.setLayout(new GridLayout(0, 1, 0, 0));
		sqlTree.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent me) {
				int clickCount = me.getClickCount();
				if (clickCount == 1) {
					Thread th = new Thread() {

						@Override
						public void run() {
							TreeSelectionModel treeModel = sqlTree.getSelectionModel();
							TreePath treePath = treeModel.getLeadSelectionPath();
							System.out.println(treePath);
						
							String path = sqlTree.getPath(treePath);
							System.out.println(path);
							StringBuilder sb = new StringBuilder(new String(""));
							File selectedFileByJTree = null;
							selectedFileByJTree = new File(path);
							FileReader fr = null;
							BufferedReader br = null;
							if (!selectedFileByJTree.isDirectory()) {
								try {
									fr = new FileReader(selectedFileByJTree);
									br = new BufferedReader(fr);
									String s;
									while ((s = br.readLine()) != null) {
										sb.append(s + "\n");
									}
								} catch (FileNotFoundException e) {
									e.printStackTrace();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								textArea.setText(sb.toString());

							} else {
								File[] folderFiles = selectedFileByJTree.listFiles();
								for (File f : folderFiles) {
									String fName = f.getName();
									sb.append(fName+"\n");
								}
								textArea.setText(sb.toString());
								repaint();

							}
						}
						
						
					};
					th.start();
				}
			}
		});

		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void addIconAreaCenterPanel() {
		iconCenterPanel = new JPanel();
		iconCenterPanel.setLayout(new FlowLayout());
		iconCenterPanel.add(textAreaScrollPane, BorderLayout.CENTER);
		getContentPane().add(iconCenterPanel);
	}

	private void addTextAreaCenterPanel() {
		textAreaCenterPanel = new JPanel();
		textAreaCenterPanel.setLayout(new BorderLayout());
		textAreaScrollPane = new JScrollPane(textArea);
		textArea.setEditable(false);
		textAreaCenterPanel.add(textAreaScrollPane, BorderLayout.CENTER);
		panel.add(textAreaCenterPanel, BorderLayout.CENTER);
		getContentPane().add(panel);
	}

	public static void main(String[] args) {
		new DatabaseManagerFrame();
	}

	protected JPanel getSouthPanel() {
		return southPanel;
	}

	protected JPanel getPanel() {
		return panel;
	}

	protected JScrollPane getTextAreaScrollPane() {
		return textAreaScrollPane;
	}

	protected JPanel getNorthPanel() {
		return northPanel;
	}

	protected JScrollPane getScrollPane() {
		return scrollPane;
	}
}
