//write a program to convert array into arraylist using Arrays.asList
package executor;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraysaslist {

	public static void main(String[] args) {
		String a[]= {"priya","ramya","kavi","nish"};//array intialization
		ArrayList<String> s=new ArrayList<String>(Arrays.asList(a));//convert array into arraylist
		s.add("ram");
		System.out.println("The numbers of the arraylist are");//to display the elements
		for(String c:s)
		{
			System.out.println(c);
		}
		
		
		
	}

}
