package Akki;
import java.util.*;
public class Repeated_Sum 
{

	public static void main(String[] args) 
	{
		//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
		System.out.println("Enter a Number: ");
		Scanner sc=new Scanner(System.in);
		int Num=sc.nextInt();
		int sum=0;
		while(Num>9) {
			sum=0;
		while(Num>0)
		{
			int digit=Num%10;
			sum=sum+digit;
			Num=Num/10;
			
		}
		Num=sum;
		}
	System.out.print(Num);
	sc.close();
		
	}
	

}
