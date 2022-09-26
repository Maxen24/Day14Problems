/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
public class QueueLinkedList {
	private INode top;
	private INode tail;
	
	
	public QueueLinkedList() {  //constructor created
		this.top=null;
		this.tail=null;
		// TODO Auto-generated constructor stub
	}
	
	//Use LinkedList to do the Queue
	//Operations- Here enqueue will internally call append method on LinkedList.
	//- So 56 will be added first then 30 and
	//then 70 to make 56 on top of the Stack
	
	
	public void enqueue(INode newNode) {
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
	public void printQueueLinkedList() {
		System.out.println("My Queue LinkedList are :"+top);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyNode<Integer>firstNode=new MyNode<Integer>(56);
		MyNode<Integer>secondNode=new MyNode<Integer>(30);
		MyNode<Integer>thirdNode=new MyNode<Integer>(70);
		
		QueueLinkedList myQueueLinkedList=new QueueLinkedList();
		
		myQueueLinkedList.enqueue(firstNode);
		myQueueLinkedList.enqueue(secondNode);
		myQueueLinkedList.enqueue(thirdNode);
		
		myQueueLinkedList.printQueueLinkedList();

	}

}
