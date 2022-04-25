package helloworld;

import java.util.Arrays;

public class arsearch {

	public static void main(String[] args) {
		
		int ar[]= {4,8,10,1,5};
		int chkvalue=5;
		
		System.out.println(Arrays.toString(ar));
		check(ar,chkvalue);
		
	}
	
		// TODO Auto-generated method stub

		public static void check(int arr[],int chkvalue)
		{
			boolean test=false;
			int k= arr.length;
			
			Arrays.sort(arr);
		
			System.out.println(arr[k-1]);
			//int res=Arrays.binarySearch(arr, chkvalue);
			
			
			for(int i=0;i<k;i++)
			{
				if (arr[i]==chkvalue)
				{
					System.out.println("value is present at position" + i);
				 //  arr[i]=arr[i+1];
					test=true;
					break;
				}
				
			}
			if (test==false)
			{
				System.out.println("number not present in array");
			}
		}
	}


