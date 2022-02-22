package Akki;
import java.util.*;
public class Concatenate2Strings
{

	public static void main(String[] args) 
	{
		/*Write a Java Program to concatenate 2 different Strings into a Single String*/
		System.out.println("Enter a Word: ");
		Scanner sc=new Scanner(System.in);
		String Word1=sc.next();
		System.out.println("Enter another Word: ");
		String Word2=sc.next();
		String Result=Word1.concat(Word2);
		System.out.println("After Concatenation: "+Word1+Word2);
		System.out.println("After Concatenation using concat()method: "+Result);
		sc.close();
		

	}

}
