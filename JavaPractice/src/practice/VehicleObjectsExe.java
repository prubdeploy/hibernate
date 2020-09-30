package practice;

import OOPS1.Vehicle;

public class VehicleObjectsExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Vehicle vle1 =new Vehicle();
		vle1.setvName("Honda");
		vle1.setvModelType("Accord");
		vle1.setvYear(2006);
		vle1.setvColor("Black");
		
	
		vle1.display();
		
		Vehicle vle2 =new Vehicle();
		vle2.setvName("Hyundai");
		vle2.setvModelType("Elantra");
		vle2.setvYear(2014);
		vle2.setvColor("Gold");
		
		vle2.display();
		
		Vehicle vle3 =new Vehicle();
		vle3.setvName("Accura");
		vle3.setvModelType("TLX");
		vle3.setvYear(2018);
		vle3.setvColor("White");
		
		vle3.display();
		
		Vehicle vle4 =new Vehicle();
		vle4.setvName("Lexus");
		vle4.setvModelType("RX350");
		vle4.setvYear(2020);
		vle4.setvColor("Grey");
		
		vle4.display();

	}

}