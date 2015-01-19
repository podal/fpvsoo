package se.mejsla.podal.fpvsoo.testtemplate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static se.mejsla.podal.fpvsoo.util.Lists.list;

import org.junit.Test;

import se.mejsla.podal.fpvsoo.Lab6;

public class Lab6Test {

	@Test
	public void addInOrder_order() {
		assertTrue(Lab6.inOrder(list(1, 2, 3, 4, 5)));
	}

	@Test
	public void addInOrder_unorder() {
		assertFalse(Lab6.inOrder(list(3, 2, 3, 4, 5)));
	}

	@Test
	public void addInOrder_duplicated() {
		assertTrue(Lab6.inOrder(list(1, 1, 2, 2, 4, 4, 5, 5)));
	}

}
