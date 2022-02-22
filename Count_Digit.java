package Akki;
import java.util.*;
public class Count_Digit
{

	public static void main(String[] args) 
	{
		/*Write a Java Program to display the Count of digits in a number*/
		System.out.println("Enter a number to count the digits: ");
		Scanner sc=new Scanner(System.in);
		int Num=sc.nextInt();
		int count=0;
		while(Num>0)
		{
			Num=Num/10;
			count++;
			
		}
		System.out.println("Count of the Number is: "+count);
		sc.close();
		
	}

}
