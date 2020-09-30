		// char & double
package practice;

public class DoubleCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[]  alphabets =new char[10];
		alphabets[0]='a';
		alphabets[1]='b';
		alphabets[2]='c';
		alphabets[4]='e';

	    for(int i=0;i<alphabets.length; i++)
			 System.out.println(alphabets[i]);
	    
	    
	    
	    double[] decimals= {103.1, 106.1, 107.99, 100.11, 93.5};
		
		 for(int i=0;i<decimals.length; i++)
			 System.out.println(decimals[i]);
		 
		    double[] pointers = new double[5];
		    pointers[0]=103.1;
		    pointers[1]=106.1;
		    pointers[2]=102;
		    pointers[4]=104.7;
		    for(int i=0;i<pointers.length;i++)
		    	System.out.println(pointers[i]);
		
		
	}

}
