package com.hackerearth.concepts.linkedlist;

public class MyLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int currentSize;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
		this.currentSize = 0;
	}

	public int size() {
		return currentSize;
	}
	
	public T getHead(){
		return head.getData();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public boolean add(T e) {
		Node<T> node = new Node<T>(e, null);
		if (tail == null) {
			tail = node;
			head = tail;
		} else {
			tail.setNextNode(node);
			tail = tail.getNextNode();
		}
		currentSize++;
		return true;
	}
	
	public void addFirst(T e){
		Node<T> node = new Node<T>(e,null);
		if(head == null){
			head = node;
		} else {
			node.setNextNode(head);
			head = node;
		}
		currentSize++;		
	}

	public boolean remove(T e) {
		Node<T> currentNode = head;

		if (currentNode.getData() == e) {
			head = currentNode.getNextNode();
			currentNode = null;
			currentSize--;
			return true;
		}

		if (tail.getData() == e) {
			for (int j = 0; j < currentSize; j++) {
				currentNode = currentNode.getNextNode();
				if (currentNode.getNextNode().getData() == e) {
					currentNode.setNextNode(null);
					tail = currentNode;
					currentSize--;
					return true;
				}
			}
		}

		for (int j = 0; j < currentSize; j++) {
			currentNode = currentNode.getNextNode();
			if (currentNode.getNextNode().getData() == e) {
				currentNode
						.setNextNode(currentNode.getNextNode().getNextNode());
				currentSize--;
				return true;
			}
		}
		return false;
	}

	public void clear() {
		this.head = null;
		this.tail = null;
		this.currentSize = 0;
	}

	public void add(int index, T element) {
		if (index < 0 || index > currentSize) {
			throw new IndexOutOfBoundsException("Index Number " + index
					+ " is invalid");
		}

		if (index == currentSize) {
			add(element);
			return;
		}

		if (index == 0) {
			head = new Node<T>(element, head);
		} else {
			Node<T> currentNode = head;
			for (int j = 0; j < index - 1; j++) {
				currentNode = currentNode.getNextNode();
			}

			currentNode.setNextNode(new Node<T>(element, currentNode
					.getNextNode()));
		}
		currentSize++;

	}

	public T remove(int index) {
		Node<T> currentNode = head;
		for (int j = 0; j < index; j++) {
			currentNode = currentNode.getNextNode();
		}
		Node<T> nodeToRemove;
		if (index == 0) {
			nodeToRemove = head;
			head = head.getNextNode();
			currentSize--;
			return nodeToRemove.getData();
		}
		nodeToRemove = currentNode.getNextNode();
		if (index == currentSize - 1) {
			currentNode.setNextNode(null);
		} else {
			Node<T> nodeAfterRemove = nodeToRemove.getNextNode();
			currentNode.setNextNode(nodeAfterRemove);
		}
		currentSize--;
		return nodeToRemove.getData();
	}

	public void print() {
		Node<T> node = head;
		while(node != null){
			System.out.print(node.getData()+" ");
			node = node.getNextNode();
		}
		System.out.println();
	}

}

class Node<T> {
	private T data;
	private Node<T> nextNode;

	public Node(T data, Node<T> nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
}
