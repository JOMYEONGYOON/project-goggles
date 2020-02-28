package task1;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class FileJTree extends JTree {
	private static final long serialVersionUID = 1L;
	private String rootPath;
	private DefaultMutableTreeNode rootNode;
	private DefaultTreeModel model;
	private Map<TreePath, String> treeMap;
	private Map<String, TreePath> pathMap;

	public String getRootPath() {
		return rootPath;
	}

	public void setRootPath(String rootPath) {
		this.rootPath = rootPath;
	}

	public FileJTree(String rootPath) {
		pathMap = new HashMap<String, TreePath>();
		treeMap = new HashMap<TreePath, String>();
		rootNode = new DefaultMutableTreeNode(rootPath);
		model = new DefaultTreeModel(rootNode);
		
		setModel(model);
		setTree(rootPath, rootNode);
		expandAllNodes(this, 0,this.getRowCount());
	}
	private void expandAllNodes(JTree tree, int startingIndex, int rowCount){
	    for(int i=startingIndex;i<rowCount;++i){
	        tree.expandRow(i);
	    }

	    if(tree.getRowCount()!=rowCount){
	        expandAllNodes(tree, rowCount, tree.getRowCount());
	    }
	}
	public void setTree(String path, DefaultMutableTreeNode node) {
		File file = new File(path);
		File[] files = file.listFiles();
		for (File f : files) {
			if (f.isDirectory()) {
				String p = f.getPath();
//				System.out.println(f.getPath());
				DefaultMutableTreeNode folderNode = new DefaultMutableTreeNode(f.getName());
			
				node.add(folderNode);
//				treeMap.put(getTreePath(folderNode), f.getPath());
//				pathMap.put(f.getPath(), getTreePath(folderNode));
				setTree(p, folderNode);
			} else {
//				System.out.println(f.getPath());
				DefaultMutableTreeNode fileNode = new DefaultMutableTreeNode(f.getName());
				treeMap.put(getTreePath(fileNode), f.getPath());
				pathMap.put(f.getPath(), getTreePath(fileNode));
				node.add(fileNode);
			}
		}
//		System.out.println(treeMap);
//		System.out.println(fileMap);

	}

	
	public Map<TreePath, String> getTreeMap() {
		return treeMap;
	}

	public void setTreeMap(Map<TreePath, String> treeMap) {
		this.treeMap = treeMap;
	}

	public Map<String, TreePath> getFileMap() {
		return pathMap;
	}

	public void setFileMap(Map<String, TreePath> fileMap) {
		this.pathMap = fileMap;
	}

	public TreePath getTreePath(TreeNode node) {
		TreeNode[] nodes = model.getPathToRoot(node);
		TreePath path = new TreePath(nodes);
		return path;
	}
}
