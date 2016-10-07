package com.hackerearth.concepts.stacks.applications;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.hackerearth.concepts.stacks.MyStackArray;

public class InfixToPostFixArrayImpl {
	public static void main(String[] args) throws Exception{
		MyStackArray<Character> stringStack = new MyStackArray<Character>(100);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Infix expression");
		String s = reader.readLine();
		char[] expressionArray = s.toCharArray();
		
		for(int i = 0; i < expressionArray.length;i++){
			if(isOperator(expressionArray[i])){
				if(isHigherPrecedence(expressionArray[i],stringStack.peek())){					
					stringStack.push(expressionArray[i]);	
				}else{
					while(!isHigherPrecedence(expressionArray[i],stringStack.peek())){						
						System.out.print(stringStack.pop());	
					}
					stringStack.push(expressionArray[i]);
				}
			}else{
				System.out.print(expressionArray[i]);
			}
		}
		while(!stringStack.empty()){
			System.out.print(stringStack.pop());
		}
	}

	private static boolean isHigherPrecedence(char c, Character peek) {

		if(peek == null){
			return true;
		}
		switch(c){
			case '+':
				return peek == '-';				
			case '-':
				return false;
			case '*':
				return peek == '+' || peek == '-' ;
			case '/':
				return true;
				
			default:
				return true;
		}		
	}

	private static boolean isOperator(char c) {
		return (c == '+') || (c == '-') || (c == '*') || (c == '/');
	}
}
