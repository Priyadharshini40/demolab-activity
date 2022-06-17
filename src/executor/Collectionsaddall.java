//write a program to convert array into arraylist using Collects.addAll
package executor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collectionsaddall {

	public static void main(String[] args) {
		String a[]= {"priya","ramya","kavi","nish"};//array intialization
		ArrayList<String> s=new ArrayList<String>();//convert array into arraylist by using Collections.addAll
		Collections.addAll(s, a);
		s.add("ram");
		System.out.println("The numbers of the arraylist are");//to display the elements
		for(String c:s)
		{
			System.out.println(c);
		}
		
		
		
	}


	}


