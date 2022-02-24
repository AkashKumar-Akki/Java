package Akki;
import java.util.*;
public class Bubble_Sort 
{

	public static void main(String[] args)
	{
		//Write a Java Program to sort the elements in a Array using Bubble_Sort
		System.out.println("Enter the Size of the Array: ");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println("Enter the Elements into Array: ");
		int Arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			Arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<N-1;i++)
		{
			for(int j=0;j<(N-i)-1;j++)
			{
				if(Arr[j]>Arr[j+1])
				{
					int temp=Arr[j];
					Arr[j]=Arr[j+1];
					Arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<N;i++)
		{
			System.out.println(Arr[i]);
		}
		sc.close();

	}

}
