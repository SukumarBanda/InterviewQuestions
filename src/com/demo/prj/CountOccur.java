package com.demo.prj;

import java.util.Scanner;

public class CountOccur {
	
	public static void main(String[] args) {
		
		System.out.print("Enter the number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.print("Enter the number: ");
		int digit = scan.nextInt();
		System.out.println(findOccur(num,digit));
	}

	private static int findOccur(int num, int digit) {
		
		int count=0,rem;
		
		while(num >0) {
			rem = num % 10;
			if(rem == digit)
				count++;
			num = num /10;		
		}
		return count;
	}
}
