package Akki;
import java.util.*;
public class Sum_Num 
{

	public static void main(String[] args)
	{
		/*Write a Java Program to display the sum of the Number*/
		System.out.println("Enter a Number to get its Sum: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("The sum of the given number is: "+sum);
		sc.close();

	}

}
