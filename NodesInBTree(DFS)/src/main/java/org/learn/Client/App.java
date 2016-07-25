package org.learn.Client;

import org.learn.Question.Node;
import org.learn.Question.NodesInBTree;

public class App {
	public static void main(String[] args) {
		// root level 0
		Node A = Node.createNode(50);
		// Level 1
		Node B = Node.createNode(30);
		Node C = Node.createNode(90);
		// Level 2
		Node D = Node.createNode(10);
		Node E = Node.createNode(40);
		Node F = Node.createNode(60);
		Node G = Node.createNode(95);
		// Level 2
		Node H = Node.createNode(55);
		Node I = Node.createNode(65);

		// connect Level 0 and 1
		A.left = B;
		A.right = C;
		// connect level 1 and level 2
		B.left = D;
		B.right = E;
		C.left = F;
		C.right = G;

		// connect level 2 and level 3
		F.left = H;
		F.right = I;

		int nodes = NodesInBTree.nodesInBTree(A);
		System.out.println("Nodes of Binary Tree : " + nodes);
	}
}
