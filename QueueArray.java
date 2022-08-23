package com.DS;

import java.util.Arrays;

public class QueueArray<T> {
	private static final int initialCapacity = 8 ;
	private int size , capacity ;
	private T arr[] ;

	@SuppressWarnings("unchecked")
	public QueueArray() {
		size = 0 ;
		capacity = initialCapacity ;
		arr = (T[]) new Object[initialCapacity] ;
	}
	
	private void expandArray()
	{
		capacity *= 2 ;
		arr = Arrays.copyOf(arr, capacity) ;
	}
	
	public void enqueue(T val)
	{
		if(size == capacity)
			expandArray() ;
		else
		{
			for(int i = size ; i >= 0 ; i--)
			{
				arr[i+1] = arr[i] ;
			}
			arr[0] = val ;
			size++ ;
		}
	}
	
	public T deque()
	{
		T value = arr[size-1] ;
		if(size < 0)
			throw new IndexOutOfBoundsException("Queue Underflow.") ;
		else {
			size-- ;
		}
		return value ;
	}
	
	public void display()
	{
		for(int i = 0 ; i < size ; i++)
			System.out.print(arr[i] + "\t");
	}
	
	public boolean isEmpty()
	{
		return size == 0 ;
	}

}
