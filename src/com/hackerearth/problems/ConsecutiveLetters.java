package com.hackerearth.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsecutiveLetters {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			String[] inputArray = input.split("");
			for (int j = 0; j < inputArray.length - 1; j++) {
				if (inputArray[j].equals(inputArray[j + 1])) {
					inputArray[j] = "";
				}
			}
			StringBuilder sb = new StringBuilder();
			for (int k = 0; k < inputArray.length; k++) {
				sb.append(inputArray[k]);
			}
			System.out.println(sb.toString());
		}
	}
}
