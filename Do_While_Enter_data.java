package Akki;
import java.util.*;
public class Do_While_Enter_data 
{

	public static void main(String[] args)
	{
		/*Write a Java Program to accept student details for N number of students and display them using do while loop */
		String ch="y";
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter the Name: ");
			String Name=sc.next();
			System.out.println("Enter the Roll No: ");
			int Roll_No=sc.nextInt();
			System.out.println("Name is: "+Name);
			System.out.println("Roll No is: "+Roll_No);
			System.out.println("Do you want to Continue,Enter y/n: ");
	        ch=sc.next();		
		}
		while(ch.equals("y"));
		sc.close();	
	}

}
