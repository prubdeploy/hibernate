package Generics;

public class Test<T,U> {
	
	T prop1;
	U prop2;
	
//	[[[\\public void setProps([ t, U u)
//	{
//		this.prop1=t;
//		this.prop2=u;
//	}
	
	public T getProp1() {
		return prop1;
	}

	public void setProp1(T prop1) {
		this.prop1 = prop1;
	}

	public U getProp2() {
		return prop2;
	}

	public void setProp2(U prop2) {
		this.prop2 = prop2;
	}

	public void print() {
		System.out.println(this.prop1);
		System.out.println(this.prop2);
	}

}
