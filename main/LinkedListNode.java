package main;

public class LinkedListNode<K> {

	private K next;

	public LinkedListNode(K next) {
		this.next = next;
	}

	public Object getnext() {
		return next;
	}
	
	public void setnext(K next) {
		this.next = next;
	}
}
