package Akki;
import java.util.*;
public class Sum_2_Matrices 
{

	public static void main(String[] args) 
	{
		/*Write a Java Program to Display the sum of 2 Matrices*/
		System.out.println("Enter number of Rows in First Matrix: ");
		Scanner sc=new Scanner(System.in);
		int F_R=sc.nextInt();
		System.out.println("Enter number of Columns in First Matrix: ");
		int F_C=sc.nextInt();
		
		int Array1[][]=new int[F_R][F_C];
		System.out.println("Enter the elements into First Matrix: ");
		for(int i=0;i<F_R;i++)
		{
			for(int j=0;j<F_C;j++)
			{
				Array1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("First Matrix elements are: ");
		for(int i=0;i<F_R;i++)
		{
			for(int j=0;j<F_C;j++)
			{
				System.out.print(Array1[i][j]+" ");
				
			}
			System.out.println();
		} 
		
	 
		System.out.println("Enter number of Rows in Second Matrix: ");
		int S_R=sc.nextInt();
		System.out.println("Enter number of Columns in Second Matrix: ");
		int S_C=sc.nextInt();
		System.out.println("Enter the elements into Second Matrix: ");
		int Array2[][]=new int[S_R][S_C];
		for(int i=0;i<S_R;i++)
		{
			for(int j=0;j<S_C;j++)
			{
				Array2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<S_R;i++)
		{
			for(int j=0;j<S_C;j++)
			{
				Array2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Second Matrix elements are: ");
		for(int i=0;i<S_R;i++)
		{
			for(int j=0;j<S_C;j++)
			{
				System.out.println(Array2[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	 }
}	
		

