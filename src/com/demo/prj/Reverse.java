package com.demo.prj;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] ch = str.toCharArray();
		String s = "";
		for (int i = str.length()-1; i >= 0; i--) {
			s += ch[i];
		}
		System.out.println(s.toString());
	}
}
