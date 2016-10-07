package com.hackerearth.concepts.queue;

import com.hackerearth.concepts.linkedlist.MyLinkedList;

public class MyQueueLinkedListImpl<T> {
	private MyLinkedList<T> linkedList;
	
	public MyQueueLinkedListImpl(){
		this.linkedList = new MyLinkedList<T>();
	}
	
	public void enqueue(T data){
		linkedList.add(data);
	}
	
	public T dequeue(){
		return linkedList.remove(0);
	}
	
	public T front(){
		return linkedList.getHead();
	}
	
	public boolean isEmpty(){
		return linkedList.isEmpty();
	}

	public void print() {
		linkedList.print();
	}
}
