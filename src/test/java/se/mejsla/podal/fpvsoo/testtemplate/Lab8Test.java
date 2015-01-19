package se.mejsla.podal.fpvsoo.testtemplate;

import static org.junit.Assert.assertEquals;
import static se.mejsla.podal.fpvsoo.util.Lists.list;

import org.junit.Test;

import se.mejsla.podal.fpvsoo.Lab8;

public class Lab8Test {

	@Test
	public void sort_order() {
		assertEquals(list(1, 2, 3, 4, 5), Lab8.sort(list(1, 2, 3, 4, 5)));
	}

	@Test
	public void sort_unorder() {
		assertEquals(list(1, 3, 5, 6, 6, 7), Lab8.sort(list(1, 6, 3, 7, 5, 6)));
	}
}
