package helloworld;

import java.util.Arrays;
//import java.util.Collections;

public class arsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,5};
		int arr1[]= {1,2,5};
		//String str[]= {"hello.you","Alpha.is","cat alpha","you alpha","geek"};
		
		//Arrays.sort(arr);
		boolean res=Arrays.equals(arr, arr1	);
		if (res==true)
			System.out.println("both the array are same");
		else
			System.out.println("arrays are different");
		
		
		int a=arr.length;
		int b=arr1.length;
		int c1=a+b;
		
		int [] c=new int[c1];
		
		System.arraycopy(arr, 0,c,0,a);
		System.arraycopy(arr1,0,c,a,b);
		
		
		//for(int i=0;i<=k;i++)
		//{
		//	if
		//}
		
		System.out.println("modified arr is " + Arrays.toString(c));
	}

}
