/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
public class LinkedList {

	private INode head;
	private INode tail;
	
	
	public LinkedList() {
		super();
	this.head=null;
	this.tail=null;
	}
//creating method
	public void add(INode newNode) {
                            //		UC2	- Node with data 70 is First Created
//		UC2	- Next 30 is added to 70
//		UC2	- Finally 56 is added to 30
//		UC2	- LinkedList Sequence: 56->30->70
		
		//when tail is null
	if (this.tail == null) {
		this.tail=newNode;
	}
	if (this.head==null) {
		this.head=newNode;
	}
	else {
		INode tempNode=this.head;
		this.head=newNode;
		this.head.setNext(tempNode);
	}
	}
	
	public void printLinkedList() {
	System.out.println("My Linked List" +head);
	
		
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("------Welcome to Data Structure: Linked list---");
	MyNode<Integer> firstNode=new MyNode(56);
	MyNode<Integer> secondNode=new MyNode(30);
	MyNode<Integer> thirdNode=new MyNode(70);
	
	LinkedList myLinkedList=new LinkedList();
	
	myLinkedList.add(firstNode);
	myLinkedList.add(secondNode);
	myLinkedList.add(thirdNode);
	
	myLinkedList.printLinkedList();
}
}
