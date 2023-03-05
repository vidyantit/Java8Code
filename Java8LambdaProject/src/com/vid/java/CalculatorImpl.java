package com.vid.java;

public class CalculatorImpl {
	
	public static void main(String args[]) {
		
		/*
		 * Calculator calculator=()-> { System.out.println("This is SwithcOn"); };
		 * calculator.switchOn();
		 */
		Calculator calculator=(i1,i2)->{
			if(i1<i2) {
				throw new RuntimeException("message");
			}else {
				return i1-i2;
			}
		};	
		System.out.println(calculator.sub(9,4));
	}
} 	
