package practice;

import java.util.Scanner;

public class SubstractTwoNumbers {

	public static void main(String[] args) {

		int a, b, c;
		System.out.println("Please enter first value");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		System.out.println("Please enter second value");
		b = sc.nextInt();

		c = a - b;

		System.out.println("The result is " + c);

	}
}