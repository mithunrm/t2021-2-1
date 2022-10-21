package test;

import java.util.Scanner;

public class program2 {
public static void main(String[] args) {
	System.out.println("Enter the a value");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();

	for (int i = 1; i <=a*2; i++)
	{	
		if((i%2!=0))
		{
			System.out.println(i);
		}
	
		
	}
}
}
