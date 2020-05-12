package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		int[] arrA = new int[6];
		
		for (int i = 0; i<arrA.length; i++) { 
			arrA[i] = (int)(Math.random()*45)+1; 
				for (int j = 0; j<i; j++) {
					if( arrA[j] ==  arrA[i]) {
						arrA[i] = (int)(Math.random()*45)+1; 
						j=-1;
					}
				}
			System.out.print(arrA[i] + "\t");
		}
		
	}

}
