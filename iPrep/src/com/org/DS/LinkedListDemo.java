package com.org.DS;

public class LinkedListDemo {
	
	public static void main(String[] args){
LinkedList list = new LinkedList();
list.addNodeAtFirst(12);
list.addNodeAtFirst(15);
list.addNodeAtFirst(14);
list.addNodeAtFirst(19);
//list.deleteHead();
//list.deleteMiddle(19);
System.out.println(list);
System.out.println(list.getSize());
list.reverseList();
System.out.println(list);

	}
}