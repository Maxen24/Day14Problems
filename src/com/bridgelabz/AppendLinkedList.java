/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
public class AppendLinkedList {

	private INode head;
	private INode tail;

	public AppendLinkedList() {
		this.head=null;
		this.tail=null;
		
		// TODO Auto-generated constructor stub
	}
	
	public void append(INode newNode) {
		if(this.head==null) {
			this.head=newNode;
		}if (this.tail==null) {
			this.tail=newNode;
		}
		else {
			INode tempNode=this.tail;
			this.tail=newNode;
			this.tail.setNext(tempNode);
			
		}
	}
	public void printAppendLinkedList() {
		System.out.println("My Append Linked List :"+" "+tail);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNode<Integer>firstNode=new MyNode<Integer>(56);
		MyNode<Integer>secondNode=new MyNode<Integer>(30);
		MyNode<Integer>thirdNode=new MyNode<Integer>(70);
		
		AppendLinkedList myAppendLinkedList=new AppendLinkedList();
		
		myAppendLinkedList.append(firstNode);
		myAppendLinkedList.append(secondNode);
		myAppendLinkedList.append(thirdNode);
		
		myAppendLinkedList.printAppendLinkedList();
	}

}
