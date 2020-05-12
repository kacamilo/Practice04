package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int [] rev = new int[5];
		double sum = 0;
		
		
		for (int i=0; i <rev.length; i++) {
			rev[i] = sc.nextInt();
			sum = sum+ rev[i];
		}System.out.println("평균은 " + sum/5 + " 입니다." );
		 
		sc.close();
	}

}
