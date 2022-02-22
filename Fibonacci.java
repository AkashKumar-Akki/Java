package Akki;
import java.util.*;
public class Fibonacci
{

	public static void main(String[] args) 
	{
		//Write a Java Program to display fibonacci series upto the number.
		System.out.println("Enter how many fibonacci numbers you want to print: ");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int m=0;
		int n=1;
		System.out.println(+m);
		System.out.println(+n);
		for(int i=0;i<(N-2);i++)
		{
			int X=m+n;
			System.out.println(X);
			m=n;
			n=X;
		}
	
		sc.close();

	}

}
