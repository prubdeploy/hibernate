package OOPS1;

public class Circle {
	Operation op;
	double pi=3.14;
	
	public double area(int r)
	{
	    op=new Operation();
		double area= this.pi*op.square(r);
		return area;
	}

}
