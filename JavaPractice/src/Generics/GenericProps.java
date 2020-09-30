package Generics;

public class GenericProps {
	public static void main(String args[]) {
	
	Test<Integer,String> t1 = new Test<Integer,String>();
	t1.setProp1(1);
	t1.setProp2("Prudhvi");
//	t1.setProps(1, "prudhvi");
	t1.print();
	

	

}
}
