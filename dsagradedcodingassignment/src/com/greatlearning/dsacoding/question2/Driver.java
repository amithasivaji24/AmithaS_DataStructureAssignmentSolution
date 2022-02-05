package com.greatlearning.dsacoding.question2;

public class Driver {

			public static void main (String[] args)
			{
			
				Services bst = new Services();
				bst.node = new Node(50);
				bst.node.left = new Node(30);
				bst.node.right = new Node(60);
				bst.node.left.left = new Node(10);
				bst.node.right.left= new Node(55);
				
				bst.BSTToRightSkewed();
			}
}
