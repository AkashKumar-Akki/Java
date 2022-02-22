package Akki;
import java.util.*;
public class Ques 
{

	public static void main(String[] args)
	{
		//Write a Java Program on Ques
		Deque<String> d=new ArrayDeque<String>();
		d.offer("Akash");
		d.offer("Akki");
		d.offer("Akki");
		d.offer("Akash Kumar");
		for(String s:d)
		{
			System.out.println(s);
		}
		d.pollFirst();
		d.pollLast();
		System.out.println("After PollLast(): ");
		for(String s:d)
		{
			System.out.println(s);
		}

	}

}
