package com.vid.java;

public class CalculatorImpl {
	
	public static void main(String args[]) {
		
		/*
		 * Calculator calculator=()-> { System.out.println("This is SwithcOn"); };
		 * calculator.switchOn();
		 */
		Calculator calculator=(x,y)->System.out.println("The sum:"+(x+y));	
	calculator.sum(4,5);
	}
} 	
