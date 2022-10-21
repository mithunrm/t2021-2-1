package Test;

import java.util.Scanner;

public class problem3
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the a value");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
				if(a%2!=0)
		{
		for (int i = 1; i <=a*2; i++)
		{	
			if((i%2!=0))
			{
				System.out.println(i);
			}}
	}
	else 
	{
		--a;
		for (int i = 1; i <=a*2; i++)
		{	
			if((i%2!=0))
			{
				System.out.println(i);
			}
		}
	}
	}
}
