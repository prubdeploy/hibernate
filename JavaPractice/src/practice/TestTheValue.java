package practice;

import java.util.Scanner;

public class TestTheValue {

	public static void main(String[] args) {

		int n;
		System.out.println("Please enter first value");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		if (n > 10000) {
		
			System.out.println("Value greater than 10000");

	}
		else {
			System.out.println("Value lesser than 10000");
		}
  }
}