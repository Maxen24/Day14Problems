/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
public class InsertLinkedList {
	private INode head;  //head and tail are part of linkedlist
	private INode tail;
	
	public InsertLinkedList() {
		this.head=null;
		this.tail=null;
		// TODO Auto-generated constructor stub
	}
	public void insert(INode newNode) {
		if (this.head==null) {
			this.head=newNode;
		}if (this.tail==null) {
			this.tail=newNode;
		}else {
			INode temp1Node= this.head;
			this.head=newNode;
			this.head.setNext(temp1Node);
		}
		
	}
	public void printInsertLinkedList() {
		System.out.println("My Insert Linked List :"+" "+head);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNode<Integer>firstNode=new MyNode<Integer>(56);
		MyNode<Integer>secondNode=new MyNode<Integer>(30);
		MyNode<Integer>thirdNode=new MyNode<Integer>(70);
		
		InsertLinkedList myInsertLinkedList=new InsertLinkedList();
		
		myInsertLinkedList.insert(firstNode);
		myInsertLinkedList.insert(secondNode);
		myInsertLinkedList.insert(thirdNode);
		
		myInsertLinkedList.printInsertLinkedList();
	}

}
