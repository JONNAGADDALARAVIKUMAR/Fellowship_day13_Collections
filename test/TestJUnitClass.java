package test;

import org.junit.Assert;
import org.junit.Test;
import main.LinkedListNode;

public class TestJUnitClass {
	
	@Test
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void givenThreeNumbersWhenLinkedShouldPassLinkedListTest() {
		LinkedListNode firstNode = new LinkedListNode<Integer>(56);
		LinkedListNode secondNode = new LinkedListNode<Integer>(30);
		LinkedListNode thirdNode = new LinkedListNode<Integer>(70);
		
		firstNode.setnext(secondNode);
		secondNode.setnext(thirdNode);
		
		boolean result = firstNode.getnext().equals(secondNode)
				&& secondNode.getnext().equals(thirdNode);
		Assert.assertTrue(result);
	}
}
