package Akki;
import java.util.*;
public class Palindrome_Num 
{

	public static void main(String[] args) 
	{
		/*Write a Java Program to Check whether it is a Palindrome or Not*/
		System.out.println("Enter a Number to check whether it is a Palindrome or Not: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int new_num=num;
		int rev=0;
		
		while(num>0)
		{
			int digit=num%10;
			rev=(rev*10)+digit;
			num=num/10;
		}
		if (new_num==rev)
		{
			System.out.println("Yes, It is a Palindrome number");
		}
		else
		{
			System.out.println("No,It is not a Palindrome number");
		}
		sc.close();
		

	}

}
