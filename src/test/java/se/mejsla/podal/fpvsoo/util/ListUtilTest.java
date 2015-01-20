package se.mejsla.podal.fpvsoo.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static se.mejsla.podal.fpvsoo.util.ListUtil.Lists;

import org.junit.Test;

public class ListUtilTest {

	@Test
	public void testEmptyList() {
		assertTrue(Lists.emptyList().isEmpty());
	}

	@Test
	public void testSort() {
		assertEquals(Lists.list(1, 3, 5, 6, 6, 7), Lists.sort(Lists.list(1, 6, 3, 7, 5, 6)));
	}

	@Test
	public void testList() {
		assertEquals("[1, 2, 3, 4, 5]", Lists.list(1, 2, 3, 4, 5).toString());
	}

	@Test
	public void testAddTail() throws Exception {
		List<String> addTail = Lists.emptyList();
		assertEquals("1", addTail.addTail("1").head());
		assertEquals("1", addTail.addTail("1").addTail("2").head());
		assertEquals("2", addTail.addTail("1").addTail("2").tail().head());
	}

}
