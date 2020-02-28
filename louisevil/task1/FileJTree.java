package task1;

import java.io.File;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class FileJTree extends JTree {
	private static final long serialVersionUID = 1L;
	private String rootPath;
	private DefaultMutableTreeNode rootNode;

	public String getRootPath() {
		return rootPath;
	}

	public void setRootPath(String rootPath) {
		this.rootPath = rootPath;
	}

	public FileJTree(String rootPath) {
		rootNode = new DefaultMutableTreeNode(rootPath);
		DefaultTreeModel model = new DefaultTreeModel(rootNode);
		setModel(model);
	}

	public void setTree(String path, DefaultMutableTreeNode node) {

		File file = new File(path);
		File[] files = file.listFiles();
		for (File f : files) {
			if (f.isDirectory()) {
				String p = f.getPath();
				System.out.println(f.getPath());
				DefaultMutableTreeNode folderNode = new DefaultMutableTreeNode(f.getName());
				node.add(folderNode);
				setTree(p, node);
			} else {
				System.out.println(f.getPath());
				DefaultMutableTreeNode fileNode = new DefaultMutableTreeNode(f.getName());
				node.add(fileNode);
			}
		}

	}
}
