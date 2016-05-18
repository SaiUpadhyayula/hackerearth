package com.hackerearth.concepts;

public class Sorting {

	private static int inversionCount = 0;

	public static void main(String[] args) {
		int[] sortArray = { 7, 4, 5, 2 };
		System.out.println("=========Start Bubble Sort=========");
		System.out.print("The unsorted array is ");
		printArray(sortArray);
		performBubbleSort(sortArray);
		System.out.println("=========End Bubble Sort=========");

		int[] selectionSortArray = { 7, 5, 4, 2 };
		System.out.println("=========Start Selection Sort=========");
		System.out.print("The unsorted array is ");
		printArray(selectionSortArray);
		performSelectionSort(selectionSortArray);
		System.out.println("=========End Selection Sort=========");

		int[] insertionSortArray = { 7, 4, 5, 2 };
		System.out.println("=========Start Insertion Sort=========");
		System.out.print("The unsorted array is ");
		printArray(insertionSortArray);
		performInsertionSort(insertionSortArray);
		System.out.println("=========End Insertion Sort=========");

		int[] mergeSortArray = { 9, 7, 8, 3, 2, 1 };
		System.out.println("=========Start Merge Sort=========");
		System.out.print("The unsorted array is ");
		printArray(mergeSortArray);
		System.out.print("The sorted array is ");
		int[] sortedArray = performMergeSort(mergeSortArray);
		printArray(sortedArray);
		System.out.println("Inversions are " + inversionCount);
		System.out.println("=========End Merge Sort=========");

		int[] quickSortArray = { 13, 19, 9, 5, 12, 8, 7, 4, 21, 2, 6, 11 };
		System.out.println("=========Start Quick Sort=========");
		System.out.print("The unsorted array is ");
		printArray(quickSortArray);
		int start = 0;
		int end = quickSortArray.length - 1;
		performQuickSort(quickSortArray, start, end);
		printArray(quickSortArray);
		System.out.println("=========End Quick Sort=========");
	}

	private static void performQuickSort(int[] quickSortArray, int start,
			int end) {
		if (start < end) {
			int pivot_pos = partition(quickSortArray, start, end);
			performQuickSort(quickSortArray, start, pivot_pos - 1);
			performQuickSort(quickSortArray, pivot_pos + 1, end);
		}
	}

	private static int partition(int[] quickSortArray, int start, int last) {
		int pivot = quickSortArray[last];
		int i = start - 1;
		int temp;
		for (int j = start; j < last; j++) {
			if (quickSortArray[j] <= pivot) {
				i++;
				temp = quickSortArray[i];
				quickSortArray[i] = quickSortArray[j];
				quickSortArray[j] = temp;
			}
		}
		temp = quickSortArray[i + 1];
		quickSortArray[i + 1] = quickSortArray[last];
		quickSortArray[last] = temp;
		return i + 1;
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
		}
		return result;

	}

	private static void performInsertionSort(int[] insertionSortArray) {
		for (int i = 1; i < insertionSortArray.length; i++) {
			int key = insertionSortArray[i];
			int j = i - 1;
			while (j >= 0 && key < insertionSortArray[j]) {
				swap(insertionSortArray, j, j + 1);
				j--;
			}
		}
		System.out.print("The sorted array is ");
		printArray(insertionSortArray);
	}

	private static void performSelectionSort(int[] sortArray) {
		int small;
		for (int i = 0; i < sortArray.length - 1; i++) {
			small = i;
			for (int j = i + 1; j < sortArray.length; j++) {
				if (sortArray[j] < sortArray[small]) {
					small = j;
				}
			}
			swap(sortArray, small, i);
		}

		System.out.print("The sorted array is ");
		printArray(sortArray);
	}

	private static void swap(int[] sortArray, int small, int i) {
		int temp;
		temp = sortArray[small];
		sortArray[small] = sortArray[i];
		sortArray[i] = temp;
	}

	private static void performBubbleSort(int[] arrayToSort) {
		for (int i = 0; i < arrayToSort.length; i++) {
			for (int j = 0; j < arrayToSort.length - 1; j++) {
				if (arrayToSort[j] > arrayToSort[j + 1]) {
					swapNumbers(arrayToSort, j);
				}
			}
		}
		System.out.print("The sorted array is ");
		printArray(arrayToSort);
	}

	private static void swapNumbers(int[] arrayToSort, int j) {
		int temp;
		temp = arrayToSort[j];
		arrayToSort[j] = arrayToSort[j + 1];
		arrayToSort[j + 1] = temp;
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
