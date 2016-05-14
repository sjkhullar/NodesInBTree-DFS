
package org.learn.Question;

public class NodesInBTree {
	public static int nodesInBTree(Node root) {
		if(null == root)
			return 0;
		
		int nLeftSubtree = nodesInBTree(root.left);
		int nRightSubtree = nodesInBTree(root.right);
		return nLeftSubtree + nRightSubtree + 1;
	}
}
