/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
public class StackLinkedList {
	private INode top;
	private INode tail;
	
	
	public StackLinkedList() {
		this.top=null;
		this.tail=null;
	}
	//UC 1 Stack
	//Ability to create a Stack of
	//56->30->70
	// Use LinkedList to do the Stack
	//Operations- Here push will internally call add method
	//on LinkedList.So 70 will be added first then 30 and
	//then 56 to make 56 on top of the Stack
	
	public void push(INode newNode) {
		if(this.top==null) {
		this.top=newNode;
		}if (this.tail==null) {
			this.tail=newNode;
		
	}else {
		INode tempNode=this.top;
		this.top=newNode;
		this.top.setNext(tempNode);

		
	}
	}
	public void printStackLinkedList() {
		System.out.println("My Stack Linked List are :"+" "+top);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNode<Integer>firstNode=new MyNode<Integer>(56);
		MyNode<Integer>secondNode=new MyNode<Integer>(30);
		MyNode<Integer>thirdNode=new MyNode<Integer>(70);
		
		StackLinkedList myStackLinkedList=new StackLinkedList();
		myStackLinkedList.push(firstNode);
		myStackLinkedList.push(secondNode);
		myStackLinkedList.push(thirdNode);

		myStackLinkedList.printStackLinkedList();
}
}