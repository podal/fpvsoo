package se.mejsla.podal.fpvsoo.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testAddHead() {
		LinkedList<String> list0 = new LinkedList<String>();
		LinkedList<String> list1 = list0.addHead("1");
		LinkedList<String> list2 = list1.addHead("2");
		LinkedList<String> list3 = list2.addHead("3");
		LinkedList<String> list4 = list3.addHead("4");
		LinkedList<String> list5 = list4.addHead("5");
		assertEquals("5", list5.head());
		assertEquals("4", list4.head());
		assertEquals("3", list3.head());
		assertEquals("2", list2.head());
		assertEquals("1", list1.head());
	}

	@Test
	public void testTail() {
		LinkedList<String> list0 = new LinkedList<String>();
		LinkedList<String> list1 = list0.addHead("1");
		LinkedList<String> list2 = list1.addHead("2");
		LinkedList<String> list3 = list2.addHead("3");
		LinkedList<String> list4 = list3.addHead("4");
		LinkedList<String> list5 = list4.addHead("5");
		assertEquals("4", list5.tail().head());
		assertEquals("3", list5.tail().tail().head());
		assertEquals("2", list5.tail().tail().tail().head());
		assertEquals("1", list5.tail().tail().tail().tail().head());
	}

	@Test(expected = EmptyListException.class)
	public void testTail_Exception() {
		LinkedList<String> list = new LinkedList<String>();
		list.tail();
	}
	 @Test
	public void testToString() throws Exception {
			LinkedList<String> list0 = new LinkedList<String>();
			LinkedList<String> list1 = list0.addHead("1");
			LinkedList<String> list2 = list1.addHead("2");
			LinkedList<String> list3 = list2.addHead("3");
			LinkedList<String> list4 = list3.addHead("4");
			LinkedList<String> list5 = list4.addHead("5");
			assertEquals("[5, 4, 3, 2, 1]", list5.toString());
	}
}
