package se.mejsla.podal.fpvsoo.testtemplate;

import static org.junit.Assert.assertEquals;
import static se.mejsla.podal.fpvsoo.util.ListUtil.Lists;

import org.junit.Test;

import se.mejsla.podal.fpvsoo.Lab2;

public class Lab2Test {

	@Test
	public void replace_noChanges() {
		assertEquals(Lists.list(1, 2, 3, 4, 5), Lab2.replace(Lists.list(1, 2, 3, 4, 5), 6, 5));
	}

	@Test
	public void replace_change_one() {
		assertEquals(Lists.list(1, 2, 3, 4, 5), Lab2.replace(Lists.list(1, 2, 3, 4, 6), 6, 5));
	}

	@Test
	public void replace_change_two() {
		assertEquals(Lists.list(1, 5, 3, 4, 5), Lab2.replace(Lists.list(1, 6, 3, 4, 6), 6, 5));
	}
}
