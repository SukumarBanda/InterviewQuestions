package com.demo.prj;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		long  i =  3;
		
		System.out.println("Square of the number is:"+sqrt(i));
		long finish = System.currentTimeMillis();
		System.out.println(finish-start);
		
		
	}

	private static long sqrt(long i) {
		
		long sr = i *i ;
		
		return sr;
	}
	
	
}
