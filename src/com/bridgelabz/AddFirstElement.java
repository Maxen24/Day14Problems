/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
import java.util.LinkedList;
public class AddFirstElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	LinkedList<Integer> mylist=new LinkedList();
	mylist.add(30);
	mylist.add(56);
	mylist.addFirst(70);
	System.out.println("My list is "+" "+mylist);
	}

}
