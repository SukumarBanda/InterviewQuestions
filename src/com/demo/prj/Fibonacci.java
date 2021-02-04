package com.demo.prj;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();		;
		System.out.println(fib(i));
		
		
	}

	private static int fib(int i) {
		
		if(i == (0 | 1))
			return 1;
		
		else {
			return i*fib(i-1);
		}
	}
}
