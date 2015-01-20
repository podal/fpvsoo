package se.mejsla.podal.fpvsoo.testtemplate;

import static se.mejsla.podal.fpvsoo.util.ListUtil.Lists;
import se.mejsla.podal.fpvsoo.util.List;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

import se.mejsla.podal.fpvsoo.Lab3;

public class Lab3Test {

	@Test
	public void distinct() {
		List<Integer> returnList = Lab3.distinct(Lists.list(1, 1, 2, 3, 4, 5, 2, 4));		
		assertEquals(Lists.list(1, 2, 3, 4, 5), Lists.sort(returnList));
	}

	@Test
	public void distinct_noDuplicates() {
		List<Integer> returnList = Lab3.distinct(Lists.list(1, 2, 3, 4, 5));
		assertEquals(Lists.list(1, 2, 3, 4, 5), Lists.sort(returnList));
	}
}
