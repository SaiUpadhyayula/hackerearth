package com.hackerearth.concepts.tree;

public class BinarySearchTree<E extends Comparable<E>> {

	public class Node{
		private E element;
		private Node left;
		private Node right;
		
		public Node(E element){
			this.element = element;
			this.left = null;
			this.right = null;
		}
		
		public E getElement() {
			return element;
		}
		public void setElement(E element) {
			this.element = element;
		}
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
	}
	
	private Node root;
	
	public BinarySearchTree(){
		this.root = null;
	}
	
	public Node findNode(Node nodeToStart,E element){
		
		if(nodeToStart == null){
			return null;
		}
		int compare = nodeToStart.element.compareTo(element);
		
		if(compare > 0){
			return findNode(nodeToStart.left,element);
		} else if(compare < 0){
			return findNode(nodeToStart.right,element);
		} else {
			return nodeToStart;
		}
	}
	
	public boolean insert(E element){
		return insertNode(root,element);
	}
	
	public boolean insertNode(Node nodeToStart,E element){
		if(nodeToStart == null){
			root = new Node(element);
			return true;
		}
		
		int compare = nodeToStart.element.compareTo(element);
		
		if(compare > 0){
			if(nodeToStart.left == null){
				nodeToStart.left = new Node(element);
				return true;
			}
			return insertNode(nodeToStart.left,element);
		} else if(compare < 0){
			if(nodeToStart.right == null){
				nodeToStart.right = new Node(element);
				return true;
			}			
			return insertNode(nodeToStart.right,element);
		} else {
			return false;
		}
	}
	
	public void printValues(){
		
	}
	
	public boolean isValueInTree(){
		return false;
	}
	
	public int getHeight(){
		return 0;
	}
	
	public int getMinValue(){
		return 0;
	}
	
	public boolean isBinaryTree(){
		return false;
	}
	
	public boolean deleteValue(){
		return false;
	}
	
	public Node getSuccessor(){
		return null;
	}
}