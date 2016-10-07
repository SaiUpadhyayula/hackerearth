package com.hackerearth.concepts.queue;


public class MyQueueArrayImpl<T> {
	private int size;
	private T arr[];
	private int top;
	private int rear;
	
	@SuppressWarnings("unchecked")
	public MyQueueArrayImpl(int size){
		this.size = size > 0 ? size : 10;
		this.arr = (T[]) new Object[size];
		top = -1;
		rear = -1;
	}
	
	public void enqueu(T data) throws Exception{
		if(top == size-1){
			throw new Exception("Queue is full");
		}
		if(top == -1 && rear == -1){
			top = rear = 0;
			arr[top] = data;
		}else{
			arr[++rear] = data;	
		}		
	}
	
	public T dequeue() throws Exception{
		if(rear == -1){
			throw new Exception("Queue is empty");
		}
		return arr[top++];
	}
	
	public T front() throws Exception{
		if(rear == -1){
			throw new Exception("Queue is empty");
		}		
		return arr[top];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}

	public void print() throws Exception {
		if(isEmpty()){
			throw new Exception("Queue is Empty");
		}
		for(int i = top; i <= rear; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}

}
