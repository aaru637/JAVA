package com.DS;

public class StackList<T> {
	Node head ;
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

	public StackList() {
		head = null ;
	}
	
	public void push(T data)
	{
		Node newNode = new Node(data) ;
		
		if(head == null)
			head = newNode ;
		else {
			newNode.next = head ;
			head = newNode ;
		}
	}
	
	public T pop()
	{
		T value = null ;
		if(head == null)
			throw new IndexOutOfBoundsException("Stack UnderFlow") ;
		
		else
		{
			value = head.data ;
			head = head.next ;
			return value ;
		}
	}
	
	public void display()
	{
		if(head == null)
			throw new IndexOutOfBoundsException("Stack UnderFlow") ;
		else
		{
			Node temp = head ;
			while(temp != null)
			{
				System.out.print(temp.data + "\t");
				temp = temp.next ;
			}
		}
	}
	
	public T peek()
	{
		if(head == null)
			throw new IndexOutOfBoundsException("Stack UnderFlow") ;
		else
		{
			Node temp = head ;
			Node prev = head ;
			while(temp != null)
			{
				prev = temp ;
				temp = temp.next ;
			}
			return prev.data ;
		}
			
	}
	
	public boolean isEmpty()
	{
		return head == null ;
	}

}
