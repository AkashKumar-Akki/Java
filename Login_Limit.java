package Akki;
import java.util.*;
public class Login_Limit 
{

	public static void main(String[] args) 
	{
		//Write a Java Program to login with only 3 attempts
		System.out.println("Enter Username: ");
		Scanner sc=new Scanner(System.in);
		String User_Name=sc.nextLine();
		
		System.out.println("Enter Password: ");
		String Password=sc.nextLine();
		
		String User="A";
		String Pass="1";
		if(User_Name==User && Password==Pass)
		{
			System.out.println("Login Successfully");
		}
		else
		{
			System.out.println("Login Failed");
		}
		sc.close();

	}

}
