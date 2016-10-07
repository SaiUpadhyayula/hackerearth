package com.hackerearth.concepts.stacks;

public class MyStackMain {
	public static void main(String[] args) throws Exception{
		MyStackArray<Integer> stack = new MyStackArray<Integer>(100);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.print();
		stack.pop();
		stack.pop();		
		stack.print();
		
		MyStackLinkedList<Integer> linkedListStack = new MyStackLinkedList<Integer>();
		linkedListStack.push(10);
		linkedListStack.push(20);
		linkedListStack.push(30);
		linkedListStack.push(40);
		linkedListStack.push(50);
		linkedListStack.print();
		linkedListStack.pop();
		linkedListStack.pop();		
		linkedListStack.print();		
	}
}