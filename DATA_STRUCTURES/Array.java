package com.dk.ds;

import java.util.Arrays;

public class Array {
	
	// 1.  Linear Search
	public static int LINEARSEARCH(int[] arr, int query)
	{
		for(int i = 0; i < arr.length ; i++)
		{
			if(arr[i] == query)
			{
				return i;
			}
		}
		return -1;
	}
	
	// 2. Binary Search
	public static int BINARYSEARCH(int[] arr, int query)
	{
		int start = 0, end = arr.length - 1;
		while(start < end)
		{
			int mid = (start + end) / 2 ;
			if(arr[mid] == query)
				return mid;
			else if(arr[mid] < query)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}
	
	// 3. Bubble Sort
	public static void BUBBLESORT(int[] arr)
	{
		for(int i = 1 ; i < arr.length ; i++)
		{
			for(int j = 0 ; j < (arr.length - i) ; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	// 4. Selection Sort
	public static void SELECTIONSORT(int[] arr)
	{
		for(int i = 0 ; i < arr.length - 1 ; i++)
		{
			int min = i;
			for(int j = i + 1 ; j < arr.length ; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	
	// 5. Insertion Sort
	public static void INSERTIONSORT(int[] arr)
	{
		for(int i = 1 ; i < arr.length ; i++)
		{
			for(int j = i ; j > 0 ; j--)
			{
				if(arr[j] < arr[j-1])
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				else
					break;
			}
		}
	}
	
	// 6. Merge Sort
	public static void MERGESORT(int[] arr, int start, int end)
	{
		if(end - start == 1)
			return ;
		int mid = (start + end) / 2;
		
		MERGESORT(arr, start, mid);
		MERGESORT(arr, mid, end);
		
		MERGE(arr, start, mid , end);
		
	}
	
	private static void MERGE(int[] arr, int start, int mid, int end)
	{
		int[] join = new int[end-start];
		
		int i = start, j = mid , k = 0 ;
		
		while(i < mid && j < end)
		{
			if(arr[i] < arr[j])
				join[k++] = arr[i++];
			else
				join[k++] = arr[j++];
		}
		
		while(i < mid)
			join[k++] = arr[i++];
		while(j < end)
			join[k++] = arr[j++];
		
		for(k = 0 ; k < join.length ; k++)
			arr[start+k] = join[k];
	}
	
	// 7. Quick Sort
	public static void QUICKSORT(int[] arr, int start, int end)
	{
		if(start >= end)
			return;
		int low = start, high = end;
		int mid = (low + high) / 2;
		int pivot = arr[mid];
		
		while(low <= high)
		{
			while(arr[low] < pivot)
				low++;
			while(arr[high] > pivot)
				high--;
			if(low <= high)
			{
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			}
		}
		
		QUICKSORT(arr, start, high);
		QUICKSORT(arr, low, end);
	}
	
	// 8. Insert Element at end in UnSorted Array
	public static void INSERTATENDUNSORTED(int[] arr, int value, int size)
	{
		arr[size++] = value;
	}
	
	// 9. Expand Array
	private static int[] EXPANDARRAY(int[] arr)
	{
		int arr1[] = Arrays.copyOf(arr, arr.length + 1);
		return arr1;
	}
	
	// 10. Insert Element at Any Position in UnSorrted Array
	public static int[] INSERTATANYUNSORTED(int[] arr, int value, int pos, int size)
	{
		if(pos > size)
			throw new IllegalArgumentException("Position is exceeded in the size of the array...");
		else
		{
			int arr1[] = EXPANDARRAY(arr);
			for(int i = size - 1 ; i > pos ; i--)
				arr1[i + 1] = arr1[i];
			arr1[pos] = value;
			size++;
			return arr1;
		}
	}
	
	// 11. Insert Element at Begining in UnSorted Array
	public static int[] INSERTATBEGINUNSORTED(int[] arr, int value, int size)
	{
		int arr1[] = EXPANDARRAY(arr);
		for(int i = size - 1 ; i >= 0 ; i--)
			arr1[i + 1] = arr1[i];
		arr1[0] = value;
		size++;
		return arr1;
	}
	
	// 12. Delete Element at Any Position in UnSorted Array
	public static void DELETEATANYUNSORTED(int[] arr, int pos, int size)
	{
		if(pos < 0)
			throw new IllegalArgumentException("Position can't be negative");
		else
		{
			for(int i = pos ; i < size ; i++)
				arr[i] = arr[i + 1];
			size--;
		}
	}
	
	// 13. Delete Element at Begining in UnSorted Array
	public static void DELETEATBEGINUNSORTED(int[] arr, int size)
	{
		for(int i = 0 ; i < size ; i++)
			arr[i] = arr[i + 1];
		size--;
	}
}
