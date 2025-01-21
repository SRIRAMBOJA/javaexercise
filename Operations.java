package com.sriram.java;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.println("SUM : " + (num1 + num2));
		System.out.println("SUB : " + (num1 - num2));
		System.out.println("mul : " + (num1 * num2));
		System.out.println("div : " + (num1 / num2));

	}

}
