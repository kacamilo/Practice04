package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
		double[] doubA;
		doubA = new	double[3];
		doubA[0]		=	6.7;
		doubA[1]		=	3.3;
		doubA[2]		=	1.2;

		double result = 0;
		
		for (int i = 0; i<doubA.length; i++) {
			result = doubA[i];
			System.out.println(result);
		}
	
				 
	}
}
