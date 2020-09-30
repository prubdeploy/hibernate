package practice;

import OOPS1.Person;

public class PersonObjectsExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Person p1 =new Person();
		p1.setpName("Prudhvi");
		p1.setpGender("Male");
		p1.setpOccupation("Teacher");
		p1.setpAddress("Victoria Park");
		
		p1.display();
		
		Person p2 =new Person();
		p2.setpName("Sarika");
		p2.setpGender("Female");
		p2.setpOccupation("Software Engineer");
		p2.setpAddress("Scarborough Town Center");
		
		p2.display();
		
		
		Person p3 =new Person();
		p3.setpName("Anand");
		p3.setpGender("Male");
		p3.setpOccupation("Manager");
		p3.setpAddress("Square One");
		
		p3.display();
		
		
		Person p4 =new Person();
		p4.setpName("Swetha");
		p4.setpGender("Female");
		p4.setpOccupation("Recruiter");
		p4.setpAddress("Erin Mills");
		
		p4.display();
		
		
	}

}