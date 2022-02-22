package Akki;
import java.util.*;
public class Swapping
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the Length of Array: ");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int temp;
		int array[]=new int[N];
		for(int i=0;i<N;i++)
		{
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<=N;i++)
		{
			if(array[i]>array[i+1])
			{
				temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
			System.out.println(array[i]);
		}
		
		/*for(int i=0;i<N;i++)
		{
			System.out.println(array[i]);
		}*/
		
		sc.close();

	}

}
