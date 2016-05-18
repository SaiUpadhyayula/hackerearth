package com.hackerearth.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NonIncreasingOrderSort {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			int numberOfTestCases = Integer.parseInt(reader.readLine());

			for (int i = 0; i < numberOfTestCases; i++) {

				int length = Integer.parseInt(reader.readLine());
				String[] array = reader.readLine().split(" ");

				if (length == array.length) {
					int[] intArray = new int[array.length];
					for (int element = 0; element < array.length; element++) {
						intArray[element] = Integer.parseInt(array[element]);
					}

					sort(intArray, 0, intArray.length - 1);
					printArray(intArray);
					System.out.println("");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void printArray(int[] arrayToPrint) {
		for (int j = arrayToPrint.length; j > 0; j--) {
			System.out.print(arrayToPrint[j-1] + " ");
		}

	}

	private static void sort(int[] intArray, int start, int end) {
		if (start < end) {
			int pivot_pos = partition(intArray, start, end);
			sort(intArray, start, pivot_pos - 1);
			sort(intArray, pivot_pos + 1, end);
		}
	}

	private static int partition(int[] intArray, int start, int end) {
		int pivot = intArray[end];
		int i = start - 1;
		int temp;
		for (int j = start; j < end; j++) {
			if (intArray[j] <= pivot) {
				i++;
				temp = intArray[i];
				intArray[i] = intArray[j];
				intArray[j] = temp;
			}
		}
		temp = intArray[i + 1];
		intArray[i + 1] = intArray[end];
		intArray[end] = temp;
		return i + 1;
	}

}
