package Akki;
import java.util.*;
public class Primes_Upto
{

	public static void main(String[] args) 
	{
		/*Write a Java Program to Print upto required number of Prime Numbers*/
		System.out.println("Enter how many Prime numbers upto you want to print: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=2;i<=num;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				count++;
			}
			if(count==2)
				System.out.println(i+" is prime");
		}
		sc.close();
				
	}
}
