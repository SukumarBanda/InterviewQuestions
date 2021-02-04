package com.demo.prj;

import java.util.Scanner;

public class RangeOfPrime {

	public static void main(String[] args) {

		System.out.println("Enter lower range:");
		Scanner scan = new Scanner(System.in);
		int low = scan.nextInt();
		System.out.println("Enter higer range:");
		int high = scan.nextInt();

		while (low < high) {
			boolean flag = false;

			if (low <= 1) {
				low++;
			}
			for (int i = 2; i <= low / 2; ++i) {
				if (low % i == 0) {
					flag = true;
					break;
				}
			}

			if (flag == false) {
				System.out.println(low);
			} else {
				System.out.println("");
			}
			low++;
		}
	}
}
