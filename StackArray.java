package com.DS;

import java.util.Arrays;

public class StackArray<T> {

	private static final int initialCapacity = 8 ;
	private int size , capacity ;
	private T arr[] ;
	
	@SuppressWarnings("unchecked")
	StackArray()
	{
		size = -1 ;
		capacity = initialCapacity ;
		arr = (T[]) new Object[initialCapacity] ;
	}
	
	private void expandArray()
	{
		capacity *= 2 ;
		arr = Arrays.copyOf(arr, capacity) ;
	}
	
	public void push(T item)
	{
		if(size == capacity)
			expandArray() ;
		else {
			for(int i = size ; i >= 0 ; i--)
			{
				arr[i+1] = arr[i] ;
			}
			arr[0] = item ;
			size++ ;
		}
			
	}
	
	public T pop()
	{
		T val = arr[0] ;
		if(size < 0)
			throw new IllegalArgumentException("Stack UnderFlow...") ;
		else
		{
			for(int i = 0 ; i <= size ; i++)
				arr[i] = arr[i+1] ;
			size-- ;
			return val ;
		}
	}
	
	public T peek()
	{
		if(size < 0)
			throw new IllegalArgumentException("Stack UnderFlow...") ;
		else
			return arr[size] ;
	}
	
	public boolean isEmpty()
	{
		return size == -1 ;
	}
	
	public void display()
	{
		for(int i = 0 ; i <= size ; i++)
			System.out.print(arr[i]+"\t");
		System.out.println();
	}
}
