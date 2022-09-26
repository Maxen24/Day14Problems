/**
 * 
 */
package com.bridgelabz;

import java.util.LinkedList;

/**
 * @author mshub
 *
 */
public class InsertElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Integer> mylist=new LinkedList();
		mylist.add(56);
		mylist.add(70);
		mylist.add(1, 30);
		System.out.println("My list is "+" "+mylist);
	}

}
