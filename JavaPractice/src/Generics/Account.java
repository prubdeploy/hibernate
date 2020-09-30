package Generics;

public class Account {
	
	
	String name;
	
	public <T> void  genericDisplay(T element)
	{
	   System.out.println(element);
	}
	
	public <T,U> void  genericDisplay(T element, U element1)
	{
	   System.out.println(element);
	   System.out.println(element1);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAcctID() {
		return acctID;
	}
	public void setAcctID(int acctID) {
		this.acctID = acctID;
	}
	int acctID;

}
