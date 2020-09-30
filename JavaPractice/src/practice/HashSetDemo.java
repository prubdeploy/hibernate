package practice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("Hi");
		set.add("How");
		set.add("are");
		set.add("you");
		set.add("doing");
		
		System.out.println("The Set values are:" + set);
		

		for(String x : set)
			System.out.println(x);
		

		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			String str=itr.next();
			System.out.println(str);
		}
		
	}

}
