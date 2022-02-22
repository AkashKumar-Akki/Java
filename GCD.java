package Akki;
import java.util.*;
public class GCD 
{

	public static void main(String[] args) 
	{
		//Write a Java Program to print GCD of 2 Numbers
		System.out.println("Enter a Number: ");
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		System.out.println("Enter a Number: ");
		int B=sc.nextInt();
		int count=0;
		for(int i=A;i>=1;i--)
		{
			if(A%i==0)
			{
				if(B%i==0)
				{
					if (i>count)
					{
						count=i;
						System.out.println("GCD is "+i);
					}
				}
			}
		}
		sc.close();
		

	}

}
