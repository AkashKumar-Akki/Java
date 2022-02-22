package Akki;
import java.util.*;
public class String_Length 
{

	public static void main(String[] args) 
	{
		/*Write a Java Program to Print the Length of the Word*/
		System.out.println("Please make sure that Space key will cutdown the Count.\nEnter a Word  : ");
		Scanner sc=new Scanner(System.in);
		String Word=sc.next();
		System.out.println("The Length of the Word, You Entered is: "+Word.length());
		sc.close();

	}

}
