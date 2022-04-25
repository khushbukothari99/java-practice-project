package helloworld;

import java.util.Scanner;

public class swap {
	
	public static void main(String[] args)
	
	{
		System.out.println("enter first number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	   
		System.out.println("enter second number");
		
		int b=sc.nextInt();
		
		
		swap1(a,b);
		System.out.println("after swapping value " + a + b);
		
	}

	public static void swap1(int a,int b)
	{
	    a=a-b;
		//now b value 10
		b=a+b;
		a=b-a;
		System.out.println("after swapping in method valuyw" + a + b);
	}
}
