package main;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<Integer> simpleLinkedList = new LinkedList<>();//Simple Linked List
		
		//Adding Data to Linked List
		simpleLinkedList.add(56);
		simpleLinkedList.add(30);
		simpleLinkedList.add(70);
		
		System.out.println(simpleLinkedList);
	}
}
