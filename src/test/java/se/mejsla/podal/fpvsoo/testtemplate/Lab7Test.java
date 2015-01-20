package se.mejsla.podal.fpvsoo.testtemplate;

import static org.junit.Assert.assertEquals;
import static se.mejsla.podal.fpvsoo.util.ListUtil.Lists;

import org.junit.Test;

import se.mejsla.podal.fpvsoo.Lab7;

public class Lab7Test {

	@Test
	public void addInOrder_first() {
		assertEquals(Lists.list(0, 1, 2, 3, 4, 5), Lab7.addInOrder(Lists.list(1, 2, 3, 4, 5), 0));
	}

	@Test
	public void addInOrder_last() {
		assertEquals(Lists.list(1, 2, 3, 4, 5, 6), Lab7.addInOrder(Lists.list(1, 2, 3, 4, 5), 6));
	}

	@Test
	public void addInOrder_middle() {
		assertEquals(Lists.list(1, 2, 3, 4, 5), Lab7.addInOrder(Lists.list(1, 2, 4, 5), 3));
	}

}
