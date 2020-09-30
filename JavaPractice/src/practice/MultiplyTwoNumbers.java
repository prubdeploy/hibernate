package practice;

import java.util.Scanner;

public class MultiplyTwoNumbers {

	public static void main(String[] args) {

		int a, b, c;
		System.out.println("Please enter first value");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		System.out.println("Please enter second value");
		b = sc.nextInt();

	     multiplication(a,b);
		
        
        String x="hi";
        String y="Prudhvi";
        multiplication(x ,y);
        
     
        
		
	}
	 private static void multiplication(int d, int e)
	 {
		 int c;
		 c=d*e;
		 print(c);
	 }
	 private static void multiplication(String d, String e)
	 {
		 String c;
		 c=d+e;
		   System.out.println("THe multiplication is "+c);
	 }
	 
	 private static void print(int result) {
		 System.out.println("result is "+result);
	 }
}