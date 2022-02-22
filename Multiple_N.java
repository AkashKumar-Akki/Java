package Akki;
import java.util.*;
public class Multiple_N 
{

	public static void main(String[] args)
	{
		/*Write a Java Program to Display multiples of 3 and 5 for a given range*/
		System.out.println("Enter the Range: ");
		Scanner sc=new Scanner(System.in);
		int Range=sc.nextInt();
		System.out.println("Multiples of 3 are: ");
		for(int i=1;i<=Range;i++)
		{
			int product=3*i;
			System.out.println(product);
			if(product==Range)
					break;
			
			
		}
		System.out.println("Multiples of 5 are: ");
		for(int i=1;i<=Range;i++)
		{
			int product=5*i;
			System.out.println(product);
			if(product==Range)
				break;
		}
		sc.close();

	}

}
