/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
public class StackPopLinkedList {
private INode top;
private INode tail;

	public StackPopLinkedList() {
	this.top=null;
	this.tail=null;
	}
	// UC2 
	//Ability to peak and
	//pop from the Stack
	//till it is empty
	
	public void Pop(INode newNode) {
		if (this.top!=null) {
			this.top=newNode;
			newNode=null;
		}if  (this.tail!=null) {
			this.tail=newNode;
			newNode=null;
		}
		else {
			INode tempNode=this.tail;
			this.tail=newNode;
			this.tail.setNext(tempNode);
		}
	}
	
	
	public void printPopLinkedList() {
		System.out.println("My pop linked list are :"+tail);
	}


	public static void main(String[] args) {
		MyNode<Integer>firstNode=new MyNode<Integer>(56);
		MyNode<Integer>secondNode=new MyNode<Integer>(30);
		MyNode<Integer>thirdNode=new MyNode<Integer>(70);
		
		System.out.println(firstNode);
		System.out.println(secondNode);
		System.out.println(thirdNode);
		
	StackPopLinkedList myPopStackLinkedList=new StackPopLinkedList();
	myPopStackLinkedList.Pop(firstNode);
	myPopStackLinkedList.Pop(secondNode);
	myPopStackLinkedList.Pop(thirdNode);
	
	myPopStackLinkedList.printPopLinkedList();
	

	}

}
