Let us define the problem statement:

We are given the Binary Tree, we need to find the number of nodes in the binary tree, 
As per the problem statement we will scan the binary tree and find the number of nodes in the binary tree.

As an example, consider the tree:
	
		   100   ------Level 0
		  /  \
		50    150 -----Level 1
		/ \    \
	    25  80  160 ---Level 2
				 
							  
					  
We can go through the complete code. We have created 3 packages

1.) org.learn.PrepareTree : Under this package we are creating the tree (This tree we will Traverse to find number of elements).

2.) org.learn.Question: Under this question package, we will have NodesInBTree  class 
which is responsible for traversing the tree to calculate the number of element in binary tree,

3.) org.learn.Client: Under this package we have main function, where 
	we are constructing the tree and then we are calling above method of 
	NodesInBTree class to get the number of element.