package com.DS;

public class Searching {
	
	// Linear Search
	public static void linearSearch(int arr[] , int value)
	{
		int flag = 0 ;
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] == value)
			{
				flag = 1 ;
				System.out.println(value + " Found at Position " + i);
				break ;
			}
		}
		
		if(flag == 0)
			System.out.println(value + " not Found in the Array.");
	}
	
	// Linear Search for Two Dimensional Array
	public static void linearSearch(int arr[][] , int value)
	{
		int flag = 0 ;
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < arr[0].length ; j++)
			{
				if(arr[i][j] == value)
				{
					flag = 1 ;
					System.out.println(value + " Found at Position row = " + i + " Column = " +j);
					break ;
				}
			}
		}
		if(flag == 0)
			System.out.println(value + " not Found in the Array.");
	}
	
	// Binary Search
	public static void binarySearch(int arr[] , int value)
	{
		int start = 0 ;
		int end = arr.length - 1 ;
		int flag = 0 ;
		
		while(start < end)
		{
			int mid = (start + end) / 2 ;
			
			if(arr[mid] == value)
			{
				flag = 1 ;
				System.out.println(value + " Found at Position " + mid);
				break ;
			}
			
			else if(arr[mid] < value)
				start = mid+1 ;
			else 
				end = mid - 1 ;
		}
		if(flag == 0)
			System.out.println(value + " not Found in the Array.");
		
	}

}
