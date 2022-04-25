package helloworld;

import java.util.Scanner;

public class largestThree {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		int a; int b;
		int c;
		
		
		System.out.println("Enter first numbers");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		compare(a,b,c);
		

	}
 
	
	public static void compare(int a, int b ,int c)
	
	{
		if (a >= b && a >= c )
		{
			System.out.print("largest number is " + a);
			
			
			
		}
		
		else
			
			if (b >= a && b >= c )
			{
				System.out.print("largest number is " + b);
				
				
				
			}
		
		else
			 System.out.println("largest number is" + c);
	}
	
}
