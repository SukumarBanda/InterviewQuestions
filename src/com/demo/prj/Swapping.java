package com.demo.prj;

public class Swapping {
	public static void main(String[] args) {
		int i = 90, j = 45;
		
		System.out.printf("Before swapping: %d and %d",i,j);
		
		
//		i = i + j;
//		j = i - j;
//		i = i - j;
		
		
		
		
		i = i ^ j;
		j = i ^ j;
		i = i ^ j;
		
		System.out.printf("\nAfter swapping: %d and %d",i,j);
		
	}
}
