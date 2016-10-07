package com.hackerearth.concepts.linkedlist;

public class LinkedListMain {
	
	public static void main(String[] args){
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("6");
		list.print();
		list.addFirst("-1");
		list.addFirst("0");
		list.print();
		list.add(0,"4");
		list.print();
		list.remove(0);
		list.print();
		list.remove("6");		
		list.print();
	}
	
	

}
