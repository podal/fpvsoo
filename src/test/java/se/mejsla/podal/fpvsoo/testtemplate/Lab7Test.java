package se.mejsla.podal.fpvsoo.testtemplate;

import static org.junit.Assert.assertEquals;
import static se.mejsla.podal.fpvsoo.util.Lists.list;

import org.junit.Test;

import se.mejsla.podal.fpvsoo.Lab7;

public class Lab7Test {

	@Test
	public void addInOrder_first() {
		assertEquals(list(0, 1, 2, 3, 4, 5), Lab7.addInOrder(list(1, 2, 3, 4, 5), 0));
	}

	@Test
	public void addInOrder_last() {
		assertEquals(list(1, 2, 3, 4, 5, 6), Lab7.addInOrder(list(1, 2, 3, 4, 5), 6));
	}

	@Test
	public void addInOrder_middle() {
		assertEquals(list(1, 2, 3, 4, 5), Lab7.addInOrder(list(1, 2, 4, 5), 3));
	}

}
