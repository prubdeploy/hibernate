package practice;

import java.util.Scanner;

public class ConcatenateStrings {

	public static void main(String[] args) {

		String a;
		String b;
		String c;
		System.out.println("Please enter first value");
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();

		System.out.println("Please enter second value");
		b = sc.nextLine();

		c = a + ' ' + b;

		System.out.println("The string is " + c);

	}
	
}