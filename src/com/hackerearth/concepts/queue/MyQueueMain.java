package com.hackerearth.concepts.queue;

public class MyQueueMain {
	public static void main(String[] args) throws Exception{
		long startTime = System.nanoTime();						
		MyQueueArrayImpl<Integer> queue = new MyQueueArrayImpl<Integer>(100);
		queue.enqueu(10);
		queue.enqueu(20);
		queue.enqueu(30);
		queue.enqueu(40);
		queue.enqueu(50);
		queue.print();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.print();
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		
		long linkedStartTime = System.nanoTime();	
		MyQueueLinkedListImpl<Integer> linkedQueue = new MyQueueLinkedListImpl<Integer>();
		linkedQueue.enqueue(10);
		linkedQueue.enqueue(20);
		linkedQueue.enqueue(30);
		linkedQueue.enqueue(40);
		linkedQueue.enqueue(50);
		linkedQueue.print();
		linkedQueue.dequeue();
		linkedQueue.dequeue();
		linkedQueue.dequeue();
		linkedQueue.print();
		long linkedEndTime = System.nanoTime();
		long linkedDuration = (linkedEndTime - linkedStartTime);
		
		System.out.println(duration/1000000);
		System.out.println(linkedDuration/1000000);
	}
}
