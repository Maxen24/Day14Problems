/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
public class SimpleLinkedList<K> {

	 K key;
	SimpleLinkedList next;
	
	public SimpleLinkedList(K key) {
		super();
		this.key = key;
		this.next=null;
	}
	

	public SimpleLinkedList getNext() {
		return next;
	}


	public void setNext(SimpleLinkedList next) {
		this.next = next;
	}


	public static void main(String[] args) {
		System.out.println("Welcome to Linked list");
		SimpleLinkedList<Integer>firstNode=new SimpleLinkedList <Integer>(56);
		SimpleLinkedList<Integer>secondNode=new SimpleLinkedList <Integer>(30);
		SimpleLinkedList<Integer>thirdNode=new SimpleLinkedList <Integer>(70);
		// Every node will have null as next
		// currently it is not linked list
		
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		
		
		
	}

}
