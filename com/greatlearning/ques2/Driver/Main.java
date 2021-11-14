package com.greatlearning.ques2.Driver;

import com.greatlearning.ques2.model.Node;
import com.greatlearning.ques2.services.*;

public class Main {
	
	public Node node;
	
	public static void main(String[] args) {
		
		 BSTToRightSkewed bSTToRightSkewed= new BSTToRightSkewed();
		 
		 Main tree = new Main();
		 tree.node = new Node(50);
		 tree.node.left = new Node(30);
		 tree.node.right = new Node(60);
		 tree.node.left.left = new Node(10);
		 tree.node.left.right= new Node(40);
       
		
		 bSTToRightSkewed.BSTToSkewed( tree.node );
		 bSTToRightSkewed.traverseRightSkewed(BSTToRightSkewed.headNode);
	}
	

}
