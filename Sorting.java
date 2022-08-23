package com.DS;

public class Sorting {
	
	// Quick Sort
	public static void quickSort(int arr[] , int low , int high)
	{
		if(low >= high)
			return ;
		int start = low ;
		int end = high ;
		int mid = (start + end)/2 ;
		int pivot = arr[mid] ;
		
		while(start <= end)
		{
			while(arr[start] < pivot)
				start++ ;
			while(arr[end] > pivot)
				end-- ;
			if(start <= end)
			{
				int temp = arr[start] ;
				arr[start] = arr[end] ;
				arr[end] = temp ;
				start++ ;
				end-- ;
			}
		}
		
		quickSort(arr , low , end) ;
		quickSort(arr , start , high) ;
	}
	
	// Bubble Sort
	public static void bubbleSort(int arr[] , int start)
	{
		for(int i = 1 ; i < start ; i++)
		{
			boolean swapped = false ;
			for(int j = 0 ; j < start - i ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					swapped = true ;
					int temp = arr[j] ;
					arr[j] = arr[j+1] ;
					arr[j+1] = temp ;
				}
			}
			if(!swapped)
				break ;
		}
	}
	
	// Selection Sort
	public static void selectionSort(int arr[] , int length)
	{
		for(int i = 0 ; i < length ; i++)
		{
			int minIndex = i ;
			
			// To find the smallest element in the list
			for(int j = i+1 ; j < length ; j++)
			{
				if(arr[j] < arr[minIndex])
				{
					minIndex = j ;
				}
			}
			
			// To swap the smallest element with the i^th position.
			int temp = arr[i] ;
			arr[i] = arr[minIndex] ;
			arr[minIndex] = temp ;
		}
	}
	
	// Insertion Sort
	public static void insertionSort(int arr[] , int length)
	{
		for(int i = 1 ; i < length ; i++)
		{
			for(int j = i ; j > 0 ; j--)
			{
				if(arr[j] < arr[j-1])
				{
					int temp = arr[j] ;
					arr[j] = arr[j-1] ;
					arr[j-1] = temp ;
				}
				else
					break ;
			}
		}
	}
	
	// Merge Sort
	public static void mergeSort(int arr[] , int start , int end)
	{
		if(end-start == 1)
			return ;
		int mid = (start+end)/2 ;
		
		mergeSort(arr , start ,mid) ;
		mergeSort(arr , mid , end) ;
		
		merge(arr , start , mid , end) ;
	}
	
	private static void merge(int arr[] , int start , int mid , int end)
	{
		int[] join = new int[end-start] ;

		int i , j , k = 0 ;
		i = start ;
		j = mid ;
		
		while(i < mid && j < end)
		{
			if(arr[i] < arr[j])
				join[k++] = arr[i++] ;
			else
				join[k++] = arr[j++] ;
		}
		
		while(i < mid)
			join[k++] = arr[i++] ;
		while(j < end)
			join[k++] = arr[j++] ;
		
		for(k = 0 ; k < join.length ; k++)
			arr[start+k] = join[k] ;
	}

}
