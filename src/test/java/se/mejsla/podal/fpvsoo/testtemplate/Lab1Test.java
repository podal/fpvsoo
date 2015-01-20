package se.mejsla.podal.fpvsoo.testtemplate;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static se.mejsla.podal.fpvsoo.util.ListUtil.Lists;

import org.junit.Test;

import se.mejsla.podal.fpvsoo.Lab1;

public class Lab1Test {

	@Test
	public void exists_test1() {
		assertTrue(Lab1.exists(Lists.list("1", "2", "4", "5"), "1"));
	}
	@Test
	public void exists_test2() {
		assertFalse(Lab1.exists(Lists.list("1", "2", "4", "5"), "3"));
	}

}
