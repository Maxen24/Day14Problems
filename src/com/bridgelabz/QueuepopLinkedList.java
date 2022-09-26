/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
public class QueuepopLinkedList {
		private INode top;
		private INode tail;
		
		//UC4
		// Ability to dequeue
		//from the beginning-Use LinkedList to do the
		//Queue Operations
		
		public QueuepopLinkedList() {
			this.top=null;
			this.tail=null;  ///Constructor created
			// TODO Auto-generated constructor stub
		}


		public void dequeue(INode newNode) {  //method dequeue from tail element 
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
		
		
		public void printQueueLinkedList() {
			System.out.println("My Dequeue linked list are :"+tail);
		}


		public static void main(String[] args) {
			MyNode<Integer>firstNode=new MyNode<Integer>(56);
			MyNode<Integer>secondNode=new MyNode<Integer>(30);
			MyNode<Integer>thirdNode=new MyNode<Integer>(70);
			
			System.out.println(firstNode);
			System.out.println(secondNode);
			System.out.println(thirdNode);
			
			QueuepopLinkedList myQueueLinkedList=new QueuepopLinkedList();
			myQueueLinkedList.dequeue(firstNode);
			myQueueLinkedList.dequeue(secondNode);
			myQueueLinkedList.dequeue(thirdNode);
		
			myQueueLinkedList.printQueueLinkedList();
		

		}

	}
