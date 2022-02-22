package Akki;
import java.util.*;
public class Array_Creation
{

	public static void main(String[] args) 
	{
		/*Write a Java Program to create an Array and entering elements to it*/
		
		System.out.println(".....Array Creation.....");
		System.out.println("Enter the Size of the Array: ");
		Scanner sc=new Scanner(System.in);
		int Size=sc.nextInt();
		int Array[] = new int[Size];
		
		
		for(int i=0;i<Size;i++)
		{
			System.out.println("Enter the element: ");
			Array[i]=sc.nextInt();
		}
		System.out.println("Array elements are: ");
		for(int i=0; i<Size;i++)
		{
			System.out.print(+Array[i]+" ");
		}
		sc.close();
		

	}

}

