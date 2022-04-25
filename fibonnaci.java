package helloworld;

import java.util.Scanner;

public class fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println("enter any number ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		fibo(n);
				
	}
	
	public static void fibo(int n)
	{
		int fib[]= new int[n];
		fib[0]=0;
		fib[1]=1;
		System.out.println(fib[0]);
		System.out.println(fib[1]);
		
		for(int i=2;i<n;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
			System.out.println(fib[i]);
		
	}

}

}