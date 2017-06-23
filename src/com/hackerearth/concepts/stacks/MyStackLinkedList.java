package com.hackerearth.concepts.stacks;

import com.hackerearth.concepts.linkedlist.MyLinkedList;

public class MyStackLinkedList<T> {
	private MyLinkedList<T> linkedList;
	
	public MyStackLinkedList(){
		this.linkedList = new MyLinkedList<T>();
	}
	
	public void push(T data){
		linkedList.add(data);
	}
	
	public void pop() throws Exception{
		if(linkedList.size() == 0){
			throw new Exception("Stack is Empty");
		}			
		linkedList.remove(0);		
	}
	
	public boolean isEmpty(){
		return linkedList.size() == 0;
	}
	
	public void print(){
		linkedList.print();
	}
}
