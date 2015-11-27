package org.learn.Client;

import org.learn.PrepareTree.Node;
import org.learn.PrepareTree.Tree;
import org.learn.Question.NodesInBTree;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {		
		int[] data = {50, 150, 25, 80, 125, 160, 10, 30, 60, 90, 110};
    	Tree tree = new Tree();
    	Node root = tree.createNode(100);
    	for(int i : data ) {
    		tree.insert(root, i );
    	}    	
    	int nodes = NodesInBTree.nodesInBTree(root);
    	System.out.println("Nodes of Binary Tree : "+nodes);
        
    }
}
