package com.greatlearning.ques2.services;

import com.greatlearning.ques2.model.Node;

public class BSTToRightSkewed {
	
	
    public static Node prevNode = null;
    public static Node headNode = null;
    
    
  //Function to convert the BST into a right skewed tree in ascending order
    public void BSTToSkewed(Node root) {
    	
    	//Base case
    	if(root == null) {
    		return;
    	}
    	
    	BSTToSkewed(root.left);
    	    	
    	Node rightNode = root.right;
    	
        
    	// Condition to check if the root Node of the skewed tree is undefined
    	if (headNode == null) {
    		
    		headNode = root;
            
    		
        } else {
        	prevNode.right = root;
            
        }
    	
    	root.left = null;
        prevNode = root;   	
        
    	BSTToSkewed(rightNode);
    }
    
 // Function to traverse the right
    // skewed tree using recursion
    public void traverseRightSkewed(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.key + " ");
        traverseRightSkewed(root.right);       
    }
   
}
