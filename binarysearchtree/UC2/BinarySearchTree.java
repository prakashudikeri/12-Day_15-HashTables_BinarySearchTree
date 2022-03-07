package com.bridgelabz.binarysearchtree.UC2;

public class BinarySearchTree {
	public static void main(String[] args) {
		BST bst = new BST();
		Node node = null;
			node = bst.insert(node, 56); 			//root is 56
			node = bst.insert(node, 30); 			//left side of the root
			node = bst.insert(node, 22); 			//left side of the 30
			node = bst.insert(node, 11); 			//left side of the 22
			node = bst.insert(node, 3); 			//left side of the 11
			node = bst.insert(node, 16); 			//right side pf the 11
			node = bst.insert(node, 40); 			//right side of the 30
		node = bst.insert(node, 70); 				//right side of the root
			node = bst.insert(node, 60); 			//left side of the 70
			node = bst.insert(node, 65); 			//right side of the 60
			node = bst.insert(node, 63); 			//left side of the 65
			node = bst.insert(node, 67); 			//right side of the 65
			node = bst.insert(node, 95); 			//right side of the 70
		bst.printNodes(node);
		}
}
class BST {
	public Node insert(Node node, int val) {			//Insert node
		if (node == null) {
			return createNewNode(val);
			}
		if (val < node.data) { 							// value is less than node is insert on left
			node.left = insert(node.left, val);
			} 
		else if ((val > node.data)) { 					// value is greater than node is insert on right
			node.right = insert(node.right, val);
			}
		return node;
		}
	public Node createNewNode(int k) {					//Create new node
		Node a = new Node();
			a.data = k;
			a.left = null;
			a.right = null;
		return a;
		}
	public void printNodes(Node node) {					//print data
		if (node == null) {
			return;
			}
		System.out.println(node.data + " ");
			printNodes(node.left);
			printNodes(node.right);
		}
}