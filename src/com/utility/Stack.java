package com.utility;

public class Stack<T>{	
	
	private T array;
	
	
	public void setArray(T array) {
		this.array = array;
	}
	
	
	public T getArray() {
		return array;
	}

	public static void main(String[] args) {
		
		Stack<String> st1=new Stack<String>();
		
		Stack<Integer> st2=new Stack<Integer>();
		
	}
}
