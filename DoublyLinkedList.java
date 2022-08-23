package com.DS;

public class DoublyLinkedList<T> {
	Node head, tail;

	class Node {
		T data;
		Node prev;
		Node next;

		Node(T val) {
			data = val;
		}
	}

	DoublyLinkedList() {
		head = null;
		tail = null;
	}

	public void addbeg(T val) {
		Node newNode = new Node(val);
		newNode.next = head;

		if (head == null)
			tail = newNode;
		else {
			head.prev = newNode;
		}
		head = newNode;
	}

	public void add(int pos, T val) {
		if (pos == 0)
			addbeg(val);
		else {
			Node newNode = new Node(val);
			Node temp = head;

			for (int i = 1; i < pos ; i++) {
				temp = temp.next;
				if (temp == null)
					throw new IllegalArgumentException("Invalid Position");
			}
			
			if(temp != tail) {
				temp.next.prev = newNode;
				newNode.prev = temp;
				newNode.next = temp.next;
				temp.next = newNode;
			}
			
			else
			{
				addend(val) ;
			}

		}
	}

	public void addend(T val) {
		if (head == null)
			addbeg(val);

		else {
			Node newNode = new Node(val);
			Node temp = head;
			Node prenode = head;

			while (temp != null) {
				prenode = temp;
				temp = temp.next;
			}

			newNode.next = prenode.next;
			newNode.prev = prenode;
			prenode.next = newNode;
			tail = newNode;
		}
	}

	public void deletebeg() {
		if (head == null)
			throw new NullPointerException("List is Empty...");
		else {
			head = head.next;
		}
	}

	public void delete(int pos) {
		if(head == null)
			throw new IndexOutOfBoundsException("List is Empty...") ;
		if (pos == 0)
			deletebeg();
		else {
			Node temp = head;
			Node prenode = head;

			for (int i = 1; i <= pos ; i++) {
				prenode = temp;
				temp = temp.next;
				if(temp == null)
					throw new IllegalArgumentException("Invalid Position");
			}
			
			if(temp.next != null) {
				temp.next.prev = prenode;
				prenode.next = temp.next;
			}
			else
				deleteend() ;
		}
	}
	
	public void deleteend()
	{
		if(head == null)
			throw new IndexOutOfBoundsException("List is Empty...") ;
		Node temp , prenode ;
		temp = head ;
		prenode = head ;
		
		if(temp.next == null)
			deletebeg();
		
		while(temp.next != null)
		{
			prenode = temp ;
			temp = temp.next ;
		}
		
		prenode.next = temp.next ;
		tail = prenode ;
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

	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}
	}

	public void displayrev() {
		Node temp = tail;

		while (temp != null) {
			System.out.print(temp.data + "\t");
			temp = temp.prev;
		}
	}
}
