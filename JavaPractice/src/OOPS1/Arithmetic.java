package OOPS1;

public class Arithmetic {
	double a;
	double b;
	
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Arithmetic(int value1, int value2) {
	this.a = value1;
	this.b = value2;
	}
	
	 public void Addition()
	 {
		 double c;
		 c=a+b;
		 System.out.println("The result of addition is "+c);
	 }
	 
	 public void Substraction()
	 {
		 try {
		 double c;
		 c=a-b;
		 System.out.println("The result of substarction is "+c);
		 }
		 catch(ArithmeticException ex)
		 {
			 
		 }
	 }
	 public double Multiplication() throws ArithmeticException
	 {
		 double c;
		 c=a*b;
		 return c;
//		 System.out.println("The result of multiplication is "+c);
//		 String name=null ;
//		 System.out.println(name.length());
	 }
	 public void Division() throws ArithmeticException
	 {
		
		 double c;
		 c=a/b;
		 System.out.println("The result of divsion is "+c);
		
	 }
	

}
