package Akki;
import java.util.*;
public class Happy_Number 
{

	public static void main(String[] args) 
	{
		/*Write a Java Program to check that is Happy or Not*/
		System.out.println("Enter a number to check it is Happy or Not:");
		Scanner sc=new Scanner(System.in);
		int Num=sc.nextInt();
		int sum=0;
		while(Num>0)
		{
			int digit=Num%10;
			sum=sum+(digit*digit);
			Num=Num/10;
			System.out.println("sum is: "+sum);
			System.out.println("Num is: "+Num);
			
		}
		sum=Num;
		while(Num>0)
		{
			int digit=Num%10;
			sum=sum+(digit*digit);
			Num=Num/10;
			System.out.println("sum is: "+sum);
			System.out.println("Num is: "+Num);
			
		}
		
		sc.close();
		
	}

}
