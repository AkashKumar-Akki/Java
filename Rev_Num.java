package Akki;
import java.util.*;
public class Rev_Num 
{

	public static void main(String[] args) 
	{
		/*Write a Java Program to print Reverse of the Number*/
		System.out.println("Enter a Number to get its Reverse : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		while(num>0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("The Reverse of the Number is : "+rev);
		sc.close();

	}

}




