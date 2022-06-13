// write a program in java to merge array
package service;
public class Service {
	public static void disp()
	{
	
	int a[]= {10,20,30,40,50};//array 1
	int b[]= {60,70,80,90,100,110};//array 2
	int c[]=new int[a.length + b.length];//add both arrays length
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		c[i]=a[i];//array 1 is stored in c
		count++;
		
		
	}
	for(int j=0;j<b.length;j++)
	{
		c[count++]=b[j];
	}
	for(int k = 0;k<c.length;k++)
	{
	System.out.print(c[k]+" ");
}
}
}