package com.DS;

public class CircularLinkedList<T> {
	Node last ;
	class Node
	{
		T data ;
		Node next ;
		
		Node(T val)
		{
			data = val ;
			next = null ;
		}
	}

	public CircularLinkedList() {
		last = null ;
	}
	
	public void addbeg(T val)
	{
		Node newNode = new Node(val) ;
		if(last == null)
		{
			newNode.next = newNode ;
			last = newNode ;
		}
		
		else
		{
			newNode.next = last.next ;
			last.next = newNode ;
		}
	}
	
	public void add(int pos , T val)
	{
		int count = 0 ;
		if(pos == 0)
		{
			addbeg(val) ;
		}
		Node sample = last.next ;
		
		do
		{
			sample = sample.next ;
			count++ ;
		}while(sample != last.next) ;
		if(pos == count)
			addend(val) ;
		
		else if(pos > count)
			throw new IllegalArgumentException("Invalid Position.") ;
		else
		{
			Node newNode = new Node(val) ;
			Node temp = last ;
			
			for(int i = 1 ; i <= pos ; i++)
			{
				temp = temp.next ;
			}
			
			newNode.next = temp.next ;
			temp.next = newNode ;
			System.out.println("\nInserted Successfully...");
		}
	}
	
	
	public void addend(T val)
	{
		Node newNode = new Node(val) ;
		if(last == null)
		{
			newNode.next = newNode ;
			last = newNode ;
		}
		
		else
		{
			newNode.next = last.next ;
			last.next = newNode ;
			last = newNode ;
		}
	}
	
	public void deletebeg()
	{
		if(last == null)
			throw new IndexOutOfBoundsException("List is Empty...") ;
		
		if(last.next == last)
			last = null ;
		else
			last.next = last.next.next ;
	}
	
	
	public void deleteend()
	{
		if(last == null)
			throw new IndexOutOfBoundsException("List is Empty...") ;
		if(last.next == last)
			last = null ;
		else
		{
			Node temp = last.next ;
			
			while(temp.next != last)
				temp = temp.next ;
			temp.next = last.next ;
			last = temp ;
		}
	}
	
	public void search(T value)
	{
		int flag = 0 , count = 0 ;
		Node temp = last.next ;
		
		do
		{
			if(value.equals(temp.data)) {
				flag = 1 ;
				System.out.println(value + " Found at the Position " + count+".");
				break ;
			}
			temp = temp.next ;
			count++;
		}while(temp != last.next);
		if(flag == 0)
			throw new IllegalArgumentException("Element Not Found.") ;
	}
	
	public boolean contains(T value)
	{
		Node temp = last.next ;
		
		do
		{
			if(value.equals(temp.data)) {
				return true ;
			}
			temp = temp.next ;
		}while(temp != last.next);
		return false ;
	}
	
	public void update(int pos , T value)
	{
		Node temp ;
		temp = last ;
		for(int i = 0 ; i <= pos ; i++)
		{
			temp = temp.next ;
		}
		temp.data = value ;
		System.out.println("\nUpdated SuccessFully...");
	}
	public void display()
	{
		Node temp = last.next ;
		do
		{
			System.out.print(temp.data + "\t");
			temp = temp.next ;
		}while(temp != last.next) ;
	}

}
