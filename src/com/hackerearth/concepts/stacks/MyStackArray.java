package com.hackerearth.concepts.stacks;

public class MyStackArray<T> {

	private T arr[];
	private int size;
	private int top;

	@SuppressWarnings("unchecked")
	public MyStackArray(int size){
		this.size = size > 0 ? size : 10;
		this.arr = (T[]) new Object[size];
		top = -1;
	}
	public void push(T data) throws Exception {
		if(top == size-1){
			throw new Exception("Stack is Full");
		}
		arr[++top] = data;
	}
	
	public T pop() throws Exception {
		if(top == -1){
			throw new Exception("Stack is Empty");
		}
		return arr[top--];		
	}
	
	public boolean empty() {
		return top == -1;
	}

	
	public boolean isFull() {
		return top == size-1;
	}

	
	public void print() {
		for(int i = 0 ; i <= top; i++){
			System.out.print(arr[i].toString()+" ");
		}
		System.out.println("");
	}
	public T peek() {
		if(top == -1){
			return null;
		}
		return arr[top];
	}

}
