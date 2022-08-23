package com.DS;

import java.util.Arrays;

class DynamicArray<T>
{
	private static final int initialCapacity = 8 ;
	private int size , capacity ;
	private T arr[] ;
	
	@SuppressWarnings("unchecked")
	DynamicArray()
	{
		size = 0 ;
		capacity = initialCapacity ;
		arr = (T[]) new Object[initialCapacity] ;
	}
	
	private void expandArray()
	{
		capacity *= 2 ;
		arr = Arrays.copyOf(arr, capacity) ;
	}
	
	private void shrinkArray()
	{
		capacity /= 2 ;
		arr = Arrays.copyOf(arr, capacity) ;
	}
	
	public void addbeg(T value)
	{
		if(size == capacity)
			expandArray() ;
		else
		{
			for(int i = size-1 ; i >= 0 ; i--)
				arr[i+1] = arr[i] ;
			arr[0] = value ;
			size++ ;
			System.out.println("Inserted SuccessFully....\n");
		}
	}
	
	public void add(T value)
	{
		if(size == capacity)
			expandArray() ;
		else
		{
			arr[size++] = value ;
			System.out.println("Inserted SuccessFully....\n");
		}
	}
	
	public void add(int pos , T value)
	{
		if(size == capacity)
			expandArray() ;
		else
		{
			for(int i = size-1 ; i >= pos ; i--)
				arr[i+1] = arr[i] ;
			arr[pos] = value ;
			size++ ;
			System.out.println("Inserted SuccessFully....\n");
		}
	}
	
	public void deletebeg()
	{
		if(size < 0)
			throw new IndexOutOfBoundsException("List is Empty.") ;
		else
		{
			for(int i = 0 ; i <= size ; i++)
				arr[i] = arr[i+1] ;
			size-- ;
			System.out.println("Deleted SuccessFully...");
		}
	}
	
	public void delete()
	{
		if(size < 0)
			throw new IndexOutOfBoundsException("List is Empty.") ;
		else {
			size-- ;
			System.out.println("Deleted SuccessFully....\n");
		}
		
		if(capacity > initialCapacity && capacity > 3*size)
			shrinkArray() ;
	}
	
	public void delete(int pos)
	{
		if(size < 0)
			throw new IndexOutOfBoundsException("List is Empty.") ;
		else
		{
			for(int i = pos ; i < size ; i++)
				arr[i] = arr[i+1] ;
			size-- ;
			System.out.println("Deleted SuccessFully....\n");
		}
		
		if(capacity > initialCapacity && capacity > 3*size)
			shrinkArray() ;
	}
	
	public void search(T value)
	{
		int flag = 0 ;
		for(int i = 0 ; i < size ; i++)
		{
			if(arr[i].equals(value))
			{
				System.out.println(value + " Found at the Position " + (i+1) + ".");
				flag = 1 ;
				break ;
			}
		}
		
		if(flag == 0)
			throw new IllegalArgumentException("Element Not Found.") ;
	}
	
	public boolean contains(T value)
	{
		for(int i = 0 ; i < size ; i++)
		{
			if(arr[i].equals(value))
			{
				return true ;
			}
		}
		return false ;
	}
	
	public void update(int pos , T value)
	{
		arr[pos] = value ;
		System.out.println("\nUpdated SuccessFully...");
	}
	
	public void display()
	{
		System.out.println("\nElements in the List : ") ;
		for(int i = 0 ; i < size ; i++)
			System.out.print(arr[i] + "\t");
	}
}
