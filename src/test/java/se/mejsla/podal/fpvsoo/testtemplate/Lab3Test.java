package se.mejsla.podal.fpvsoo.testtemplate;

import static org.junit.Assert.assertEquals;
import static se.mejsla.podal.fpvsoo.util.Lists.list;
import static se.mejsla.podal.fpvsoo.util.Lists.sort;

import org.junit.Test;

import se.mejsla.podal.fpvsoo.Lab3;
import se.mejsla.podal.fpvsoo.util.List;

public class Lab3Test {

	@Test
	public void distinct() {
		List<Integer> returnList = Lab3.distinct(list(1, 1, 2, 3, 4, 5, 2, 4));		
		assertEquals(list(1, 2, 3, 4, 5), sort(returnList));
	}

	@Test
	public void distinct_noDuplicates() {
		List<Integer> returnList = Lab3.distinct(list(1, 2, 3, 4, 5));
		assertEquals(list(1, 2, 3, 4, 5), sort(returnList));
	}
}
