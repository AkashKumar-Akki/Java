package Akki;
import java.util.*;
public class Factorial {

	public static void main(String[] args) 
	{
		/*Write a Java Program to find the Factorial of the given Number*/
		System.out.println("Enter a Number to find it's Factorial: ");
		Scanner sc=new Scanner(System.in);
		int Num=sc.nextInt();
		int Fact=1;
		for(int i=1;i<=Num;i++)
		{
			Fact=Fact*i;
		}
		
		System.out.println(Fact);
		sc.close();

	}

}
