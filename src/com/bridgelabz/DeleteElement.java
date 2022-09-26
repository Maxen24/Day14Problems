/**
 * 
 */
package com.bridgelabz;

import java.util.LinkedList;

/**
 * @author mshub
 *
 */
public class DeleteElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Integer> mylist=new LinkedList();
		mylist.add(56);
		mylist.add(30);
		mylist.add(70);
		mylist.remove(0);
		System.out.println("My list is "+" "+mylist);

	}

}
