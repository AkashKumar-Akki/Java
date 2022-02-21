package Akki;
import java.util.*;
public class Prime_Not 
{

	public static void main(String[] args) 
	{
		/*Write a Java Program to check whether it is Prime or Not*/
		System.out.println("Enter a number to check whether it is Prime or Not: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean Flag=false;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				Flag=true;
			}
		}
		
		if(Flag==true)
		{
			System.out.println("No,It is Not a Prime Number");
		}
		else
		{
			System.out.println("Yes,It is a Prime Number");
		}
		
		sc.close();
	}
}	
		
		
	
	

	

