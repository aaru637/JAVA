package com.DS;

public class QueueList<T> {
	Node front , rear ;
	
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

	public QueueList() {
		front = rear = null ;
	}
	
	public void enqueue(T val)
	{
		Node newNode = new Node(val) ;
		if(front == null)
			front = newNode ;
		else
			rear.next = newNode ;
		rear = newNode ;
	}
	
	public T deque()
	{
		if(front == null)
			throw new IndexOutOfBoundsException("Queue is Empty.") ;
		T value = front.data ;
		front = front.next ;
		
		if(front == null)
			rear = null ;
		
		return value ;
	}
	
	public void display()
	{
		Node temp = front ;
		
		while(temp != null)
		{
			System.out.print(temp.data + "\t");
			temp = temp.next ;
		}
	}
	
	public boolean isEmpty()
	{
		return front == null ;
	}

}
