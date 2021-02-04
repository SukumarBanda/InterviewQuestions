package com.demo.prj;

import java.util.Scanner;

public class SpaceRemoval {
	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		str = str.replaceAll("\\s", "");
		
		System.out.println(str);
		
		
		
		
		
	}
	
}
