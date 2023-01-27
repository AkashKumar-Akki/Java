/*Please contact later*/
package Akki;
import java.util.*;
public class Doctor 
{

	public static void main(String[] args)
	{
		// Write a Java Program on AI_Doctor for Fever
		System.out.println("Hello");
		System.out.println("Welcome to AI Doctor");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Please Enter 1 if you are Suffering with Fever");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Please Enter 2 if you are Suffering with Cold,Cough,Related issues");
		System.out.println("");
		System.out.println("");
		System.out.println("Please Enter 3 if you are Suffering with Skin related issues");
		System.out.println("");
		System.out.println("");
		System.out.print("Please Enter your choice here:");
		int A=sc.nextInt();
		switch(A)
		{
		case 1:
			System.out.println("You are suffering with fever,Then use Paracetmol");
			System.out.println("I hav some questions for you");
			System.out.println("For How long you are facing this Problem");
			System.out.println("Please Enter 1 if you are facing this for lass than 1 day");
			System.out.println("");
			System.out.println("");
			
			System.out.println("Please Enter 2 if you are facing this for more than 1 day");
			System.out.println("");
			System.out.println("");
			System.out.println("Please Enter 3 if you are acing this for more than 3 days");
			System.out.println("");
			System.out.println("");
			int B=sc.nextInt();
			switch(B)
			{
			case 1:
				System.out.println("Oh Nyc....!!!!!!");
				break;
			case 2:
				System.out.println("Oh ok....!!!!!!");
				break;
			case 3:
				System.out.println("Oh Noooo....!!!!!!");
				break;
			default:
				System.out.println("Please Enter Correct key");
			}
		break;
		case 2:
			System.out.println("You are suffering with Cold,Cough,Related issues,Then use DART & CITRIGEN");
		break;
		case 3:
			System.out.println("You are suffering with Skin related issues,I dont know the Medicine");
		break;
		default:
			System.out.println("Please Enter Correct key");
		}
		sc.close();

	}

}
