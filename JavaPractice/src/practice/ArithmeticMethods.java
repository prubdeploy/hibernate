package practice;

import java.util.Scanner;

import OOPS1.Arithmetic;

public class ArithmeticMethods {

	public static void main(String[] args) {

      try {		
		String name = "Prudhvi";
		System.out.println(name.length());
		System.out.println("After Exception");
		int a, b;
		System.out.println("Please enter first value");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if(a>100)
			throw new Exception("Input values should be less than 100");

		System.out.println("Please enter second value");
		b = sc.nextInt();
		
		System.out.println("Art 1 display");
		Arithmetic art = new Arithmetic(a,b);
		art.Addition();
		art.Substraction();
		double result =art.Multiplication();
		System.out.println("result is "+ result);
		art.Division();
		
		a=78;
		b=67;
		System.out.println("Art 2 display");
		Arithmetic art2 = new Arithmetic(a,b);
		art2.Addition();
		art2.Substraction();
		 result =art2.Multiplication();
		 System.out.println("result is "+ result);
		art2.Division();
		System.out.println("Art 2 display End");
		
		System.out.println("Art 1 display");
		art.Addition();
		art.Substraction();
		 result =art.Multiplication();
		 System.out.println("result is "+ result);
		art.Division();
		System.out.println("Art 1 display after change");
		art.setA(5);
		art.setB(3);
		art.Addition();
		art.Substraction();
		 result =art.Multiplication();
		System.out.println("result is "+ result);
		art.Division();
      }
      catch(NullPointerException  ex) {
    	  System.out.println("NullPointerException occurred");
      }
      catch(ArithmeticException  ex) {
    	  System.out.println("ArithmeticException occurred" + ex.toString());
      }
		
      catch(Exception ex) {
    	  System.out.println("Exception  occurred" + ex.toString());

      }
      finally {
    	  System.out.println("Finally executed");
      }
		
	}
	
	
}