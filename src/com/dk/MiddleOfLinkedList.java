package com.dk;

class LinkedList {

    Node head = null;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addEnd(int data) {
            Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int findMiddleNode() {
        Node slow, fast;
        slow = fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}

public class MiddleOfLinkedList {
    public static void main(String... args) {
        LinkedList list = new LinkedList();
        for(int i = 1 ; i <= 5 ; i++) {
            list.addEnd(i);
        }
        System.out.print("Elements : ");
        list.display();
        System.out.println("Middle Element : " + list.findMiddleNode());
    }
}
