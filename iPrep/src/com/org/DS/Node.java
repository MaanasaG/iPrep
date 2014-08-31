package com.org.DS;

public class Node {
private int data;
private Node nextNode;
  

   public Node(int data){
    	this.data=data;
    }
	
	public int getData(){
		return this.data;
	}
	public Node getNextNode(){
		return this.nextNode;
	}
	public void setData(int data){
		this.data=data;
	}
	public void setNextNode(Node next){
		this.nextNode=next;
	}
	@Override
	public String toString(){
		return "Data :"+ this.data;
	}
}
