package com.hackerearth.concepts.tree;

import com.hackerearth.concepts.tree.BinarySearchTree.Node;

public interface BinarySearchTreeADT<E> {
	public Node findNode(Node nodeToStart,E element);
}
