package Akki;
import java.util.*;
public class Winner 
{

	public static void main(String[] args) 
	{
		/*Write a Java Program to enter some names and randomly displaying one Name from them.*/
		System.out.println("Enter how many Names you want to enter: ");
		Scanner sc=new Scanner(System.in);
		int Size=sc.nextInt();
		String Array[]=new String[Size];
		
		for(int i=0;i<Size;i++)
		{
			System.out.println("Enter the Name: ");
			Array[i]=sc.next();
		}
		System.out.println("The Names are: ");
		for(int i=0;i<Size;i++)
		{
			System.out.println(Array[i]+" ");
		}
		
		int Random_Name=(int)(Math.random()*Size);
		
		System.out.println("The Winner is: "+Array[Random_Name]);
		sc.close();
		

	}

}

