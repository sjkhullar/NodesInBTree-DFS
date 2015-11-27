
package org.learn.Question;
import org.learn.PrepareTree.Node;

public class NodesInBTree {
	public static int nodesInBTree(Node root) {
		if(null == root)
			return 0;
		
		int nLeftSubtree = nodesInBTree(root.left);
		int nRightSubtree = nodesInBTree(root.right);
		return nLeftSubtree + nRightSubtree + 1;
	}
}
