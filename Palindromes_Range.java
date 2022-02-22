package Akki;
import java.util.*;
public class Palindromes_Range
{

	public static void main(String[] args)
	{
		//Write a Java Program to print all the Palindromes in a given range
		
		System.out.println("Enter the Minimum Range: ");
		Scanner sc=new Scanner(System.in);
		int Min_Range=sc.nextInt();
		System.out.println("Enter the Maximum Range: ");
		int Max_Range=sc.nextInt();
		int Num=0;
		int Rev=0;
		for(int i=Min_Range;i<=Max_Range;i++)
		{
			Num=i;
			Rev=0;
			while(Num>0)
			{
				int digit=Num%10;
				Rev=Rev*10+digit;
				Num=Num/10;
			}
			if(i==Rev)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}
	
	

}
