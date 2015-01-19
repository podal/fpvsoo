package se.mejsla.podal.fpvsoo.testtemplate;

import static org.junit.Assert.assertEquals;
import static se.mejsla.podal.fpvsoo.util.Lists.list;

import org.junit.Test;

import se.mejsla.podal.fpvsoo.Lab2;

public class Lab2Test {

	@Test
	public void replace_noChanges() {
		assertEquals(list(1, 2, 3, 4, 5), Lab2.replace(list(1, 2, 3, 4, 5), 6, 5));
	}

	@Test
	public void replace_change_one() {
		assertEquals(list(1, 2, 3, 4, 5), Lab2.replace(list(1, 2, 3, 4, 6), 6, 5));
	}

	@Test
	public void replace_change_two() {
		assertEquals(list(1, 5, 3, 4, 5), Lab2.replace(list(1, 6, 3, 4, 6), 6, 5));
	}
}
