package com.hackerearth.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FutureWeights {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			int numberOfTestCases = Integer.parseInt(reader.readLine());

			for (int i = 0; i < numberOfTestCases; i++) {
				int length = Integer.parseInt(reader.readLine());
				int[] weights = new int[length];
				for (int j = 0; j < length; j++) {
					weights[j] = Integer.parseInt(reader.readLine());
				}

				if (weights.length > 1) {
					performMergeSort(weights);
				}else{
					System.out.print(0 + " ");
				}
				System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static int[] performMergeSort(int[] mergeSortArray) {

		if (mergeSortArray.length <= 1) {
			return mergeSortArray;
		}

		int midIndex = mergeSortArray.length / 2;

		int[] left = new int[midIndex];
		int[] right;

		if (mergeSortArray.length % 2 == 0) {
			right = new int[midIndex];
		} else {
			right = new int[midIndex + 1];
		}

		int[] result = new int[mergeSortArray.length];

		for (int i = 0; i < midIndex; i++) {
			left[i] = mergeSortArray[i];
		}

		int x = 0;
		for (int j = midIndex; j < mergeSortArray.length; j++) {
			if (x < mergeSortArray.length) {
				right[x] = mergeSortArray[j];
				x++;
			}
		}

		left = performMergeSort(left);
		right = performMergeSort(right);

		result = merge(left, right);

		return result;

	}

	private static int[] merge(int[] left, int[] right) {
		int resultLength = left.length + right.length;		
		int[] result = new int[resultLength];
		int leftIndex = 0;
		int rightIndex = 0;
		int resultIndex = 0;
		while (leftIndex < left.length || rightIndex < right.length) {
			int inversionCount = 0;
			if (leftIndex < left.length && rightIndex < right.length) {
				if (left[leftIndex] <= right[rightIndex]) {
					result[resultIndex] = left[leftIndex];
					leftIndex++;
					resultIndex++;
				} else {
					result[resultIndex] = right[rightIndex];
					rightIndex++;
					inversionCount = inversionCount + (left.length - leftIndex);
					resultIndex++;
				}
			} else if (leftIndex < left.length) {
				result[resultIndex] = left[leftIndex];
				leftIndex++;
				resultIndex++;
			} else if (rightIndex < right.length) {
				result[resultIndex] = right[rightIndex];
				rightIndex++;
				resultIndex++;
			}
			System.out.print(inversionCount+" ");			
		}
		return result;

	}	
}
