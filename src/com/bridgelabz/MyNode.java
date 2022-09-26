package com.bridgelabz;

public class MyNode<T> implements INode<T>{
	
	private T key;
	private INode <T> next;
	
	public MyNode(T key) {
		super();
		this.key=key;
		this.next=null;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the key
	 */
	public T getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(T key) {
		this.key = key;
	}

	/**
	 * @return the next
	 */
	public INode getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(INode next) {
		this.next = next;
		
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyNode [key=");
		builder.append(key);
		builder.append(", next=");
		builder.append(next);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public INode getnext() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	