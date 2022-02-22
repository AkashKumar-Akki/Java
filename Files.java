package Akki;
import java.io.*;
public class Files 
{

	public static void main(String[] args)
	{
		// Write a Java Program to display Files and Directories present in c
		int c=0;
		File obj=new File("c:\\");
		String s[]=obj.list();
		for(String s1:s)
		{
			
			System.out.println(s1);
			c++;
		}
		System.out.println("Count="+c);

	}

}
