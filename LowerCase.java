package Akki;
import java.util.*;
public class LowerCase 
{

	public static void main(String[] args) 
	{
		/*Write a Java Program to convert Uppercase letters into Lowercase*/
		System.out.println("Enter a word in Upperacase to convert it into Lowercase: ");
		Scanner sc=new Scanner(System.in);
		String Name=sc.next();
		System.out.println("The word you entered in Lowercase is: "+Name.toLowerCase());
		sc.close();

	}

}
