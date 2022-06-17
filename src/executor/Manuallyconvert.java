// write a program to covert array into arraylist by using manual method
package executor;

import java.util.ArrayList;
import java.util.Collections;
public class Manuallyconvert {
	public static void main(String[] args) {
		String a[]= {"priya","ramya","kavi","nish"};//array intialization
		ArrayList<String> s=new ArrayList<String>();
		//convert array into arraylist by using manual method
		for(int i=0;i<a.length;i++)
	    s.add(a[i]);
		System.out.println("The numbers of the arraylist are");//to display the elements
		for(String c:s)
		{
			System.out.println(c);
		}

	}

}
