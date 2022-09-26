package com.bridgelabz;

public interface INode<T> {
//key
	public T getKey();
	public void setKey(T key);
	
	//Next 
	INode getnext();
	public void setNext(INode next);
	
}
