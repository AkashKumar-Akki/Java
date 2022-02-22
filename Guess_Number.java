package Akki;
import java.util.*;
public class Guess_Number 
{

	public static void main(String[] args) 
	{
		/*Write a Java Program to guess a Number and trying to match with Random Number*/
		System.out.println("Enter a Number that you guessed between 0 to 10:  ");
		Scanner sc=new Scanner(System.in);
		int Guess_Number=sc.nextInt();
		int Random_Number=(int)(Math.random()*10);
		System.out.println("The Random Number is: "+Random_Number);
		if (Guess_Number==Random_Number)
		{
			System.out.println("Hurrraaaaaaaahhhhh ,You Won it....!!!!!!!!!!");
		}
		else
		{
			System.out.println("Ooops You Lossed it..!!!!!!!!");
		}
		sc.close();
		

	}

}
