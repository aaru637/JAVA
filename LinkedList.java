package com.DS;


public class LinkedList<T> {
	Node head ;
	Node a = null , b = null ;
	
	LinkedList()
	{
		head = null ;
	}
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
	
	private int getLen()
	{
		int length = 0;
		Node temp = head ;
		while(temp != null)
		{
			length++ ;
			temp = temp.next ;
		}
		return length ;
	}
	
	public void addbeg(T val)
	{
		Node newNode = new Node(val) ;
		if(head == null) {
			head = newNode ;
			System.out.println("\nInserted Successfully...");
		}
		else
		{
			newNode.next = head ;
			head = newNode ;
			System.out.println("\nInserted Successfully...");
		}
	}
	
	public void add(int pos , T val)
	{
		
		if(pos == 0)
		{
			addbeg(val) ;
		}
		else
		{
			Node newNode = new Node(val) ;
			Node temp = head ;
			
			for(int i = 0 ; i < pos-1 ; i++)
			{
				temp = temp.next ;
				if(temp == null)
				{
					throw new IllegalArgumentException("Invalid Position.") ;
				}
			}
			
			newNode.next = temp.next ;
			temp.next = newNode ;
			System.out.println("\nInserted Successfully...");
		}
	}
	
	public void addend(T val)
	{
		if(head == null) {
			addbeg(val) ;
			return ;
		}
		Node newNode = new Node(val) ;
		Node temp = head ;
		Node prev = head ;
		
		while(temp != null)
		{
			prev = temp ;
			temp = temp.next ;
		}
		
		prev.next = newNode ;
	}
	
	public void deletebeg()
	{
		if(head == null)
			throw new IndexOutOfBoundsException("List is Empty.") ;
		else
			head = head.next ;
	}
	
	public void delete(int pos)
	{
		if(head == null)
		{
			throw new IndexOutOfBoundsException("List is Empty.") ;
		}
		
		if(pos == 0) {
			deletebeg() ;
			return ;
		}
		
		Node temp = head ;
		Node prev = head ;
		
		for(int i = 1 ; i <= pos ; i++)
		{
			prev = temp ;
			temp = temp.next ;
		}
		
		prev.next = temp.next ;
	}
	
	public void deleteend()
	{
		Node temp = head ;
		Node prev = head ;
		
		while(temp.next != null)
		{
			prev = temp ;
			temp = temp.next ;
		}
		
		prev.next = null ;
	}
	
	public void search(T value)
	{
		int flag = 0 , count = 0 ;
		Node temp = head ;
		
		while(temp != null)
		{
			if(value.equals(temp.data)) {
				flag = 1 ;
				System.out.println(value + " Found at the Position " + count+".");
				break ;
			}
			temp = temp.next ;
			count++;
		}
		if(flag == 0)
			throw new IllegalArgumentException("Element Not Found.") ;
	}
	
	public boolean contains(T value)
	{
		Node temp = head ;
		
		while(temp != null)
		{
			if(value.equals(temp.data))
				return true ;
			temp = temp.next ;
		}
		return false ;
	}
	
	public void update(int pos , T value)
	{
		Node temp ;
		temp = head ;
		
		for(int i = 0 ; i < pos ; i++)
		{
			temp = temp.next ;
		}
		temp.data = value ;
		System.out.println("\nUpdated SuccessFully...");
	}
	
	public void reverse()
	{
		Node prev , current , nextnode ;
		prev = null ;
		current = head ;
		nextnode = current.next ;
		
		while(current != null)
		{
			nextnode = current.next ;
			current.next = prev ;
			prev = current ;
			current = nextnode;
		}
		
		head = prev ;
	}
	
	public Node cycleFind()
	{
		Node slow , fast , prev ;
		slow = fast = prev = head ;
		
		while(slow != null && fast != null && fast.next != null)
		{
			slow = slow.next ;
			fast = fast.next.next ;
			
			if(fast == slow)
			{
				slow = head ;
				while(slow != fast)
				{
					prev = fast ;
					slow = slow.next ;
					fast = fast.next ;
				}
				prev.next = null ;
				return slow ;
			}
		}
		return null ;
	}
	
	public void middle()
	{
		if(head != null)
		{
			int length = getLen() ;
			Node temp = head ;
			int middlelength = length/2 ;
			
			while(middlelength != 0)
			{
				temp = temp.next ;
				middlelength-- ;
			}
			
			System.out.println("Middle Element is : " +temp.data);
		}
	}
	
	public int repeat(T val)
	{
		Node temp = head ;
		int count = 0 ;
		
		while(temp != null)
		{
			if(temp.data.equals(val))
				count++ ;
			temp = temp.next ;
		}
		
		return count ;
	}
	
	public boolean isPalindrome()
	{
		boolean isPalin = true ;
		StackList<T> stack = new StackList<T>() ;
		Node temp = head ;
		
		while(temp != null)
		{
			stack.push(temp.data);
			temp = temp.next ;
		}
		
		Node ref = head ;
		
		while(ref != null)
		{
			T i = stack.pop() ;
			
			if(ref.data.equals(i))
				isPalin = true ;
			else {
				isPalin = false ;
				break ;
			}
			
			ref = ref.next ;
		}
		return isPalin ;
	}
	
	public void removeDuplicateInSort()
	{
		Node temp ;
		temp = head ;
		
		while(temp.next != null)
		{
			Node prev = temp ;
			
			while(prev != null && prev.data.equals(temp.data))
				prev = prev.next ;
			temp.next = prev ;
			temp = temp.next ;
		}
		display() ;
	}
	
	public void removeDuplicateUnSort()
	{
		Node temp = head ;
		
		while(temp.next != null && temp != null)
		{
			Node prev = temp ;
			while(prev.next != null)
			{
				if(temp.data.equals(prev.next.data))
					prev.next = prev.next.next ;
				else
					prev = prev.next ;
			}
			temp = temp.next ;
		}
		
		display() ;
	}
	
	public void swapNodes(T x , T y)
	{
		if(x == y)
			return ;
		
		Node X = head , xNode = null ;
		while(X != null && X.data != x)
		{
			xNode = X ;
			X = X.next ;
		}
		
		Node Y = head , yNode = null ;
		while(Y != null && Y.data != y)
		{
			yNode = Y ;
			Y = Y.next ;
		}
		
		if(X == null && Y == null)
			return ;
		
		if(xNode != null)
			xNode.next = Y ;
		else
			head = Y ;
		
		if(yNode != null)
			yNode.next = X ;
		else
			head = X ;
		
		Node temp = X.next ;
		X.next = Y.next ;
		Y.next = temp ;
		
		display() ;
	}
	
	public void swapPairNodes()
	{
		Node temp = head ;
		T key ;
		
		while(temp != null && temp.next != null)
		{
			key = temp.data ;
			temp.data = temp.next.data ;
			temp.next.data = key ;
			temp = temp.next.next ;
		}
		display();
	}
	
	public void secLast()
	{
		Node temp , prev ;
		temp = prev = head ;
		
		while(temp.next != null)
		{
			prev = temp ;
			temp = temp.next ;
		}
		prev.next = null ;
		temp.next = head ;
		head = temp ;
		display() ;
	}
	
	public void display()
	{
		Node temp = head ;
		
		while(temp != null)
		{
			System.out.print(temp.data + "\t");
			temp = temp.next ;
		}
	}

}
