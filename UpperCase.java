package Akki;
import java.util.*;
public class UpperCase 
{

	public static void main(String[] args) 
	{
		/*Write a Java Program to convert lowercase letters into Uppercase*/
		System.out.println("Enter a word in lowercase to convert it into uppercase: ");
		Scanner sc=new Scanner(System.in);
		String Name=sc.next();
		System.out.println("The word you entered in Uppercase is: "+Name.toUpperCase());
		sc.close();
	}

}
