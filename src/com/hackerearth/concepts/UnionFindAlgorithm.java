package com.hackerearth.concepts;

public class UnionFindAlgorithm {

	public static void main(String[] args) {
		QuickFind qf = new QuickFind(10);
		qf.connect(3, 8);
		qf.connect(4, 3);
		qf.connect(6, 5);
		qf.connect(9, 4);
		qf.connect(2, 1);

		qf.isConnected(0, 7);
		qf.isConnected(8, 9);

		qf.connect(5, 0);
		qf.connect(7, 2);
		qf.connect(6, 1);
		qf.connect(1, 0);

		qf.isConnected(0, 7);
		
		QuickUnion qu = new QuickUnion(10);
	}
}

class QuickUnion{
	
	private int[] array;
	public QuickUnion(int number){
		array = new int[number];
		for(int i = 0; i < array.length; i++){
			array[i] = i;
		}
	}
	
	void union(int firstNumber,int secondNumber){
		int p = find(firstNumber);
		int q = find(secondNumber);
	}

	private int find(int secondNumber) {
		
		return 0;
	}
}

class QuickFind {

	private int[] array;

	public QuickFind(int number) {
		array = new int[number];
		for (int i = 0; i < number - 1; i++) {
			array[i] = i;
		}
	}

	void isConnected(int firstNumber, int secondNumber) {
		if (array[firstNumber] == array[secondNumber]) {
			System.out.println(firstNumber + " and " + secondNumber
					+ " are connected!!");
		}
	}

	// Iterates through all elements in an array and
	// replaces the id in firstNumber with id of secondNumber
	void connect(int firstNumber, int secondNumber) {
		int firstId = array[firstNumber];
		int secondId = array[secondNumber];

		for (int j = 0; j < array.length; j++) {
			if (array[j] == firstId)
				array[j] = secondId;
		}

		printArray(array);
	}

	private static void printArray(int[] arrayToPrint) {
		System.out.print("[ ");
		for (int j = 0; j < arrayToPrint.length; j++) {
			System.out.print(arrayToPrint[j] + " ");
		}
		System.out.print("]");
		System.out.println("");
	}
}