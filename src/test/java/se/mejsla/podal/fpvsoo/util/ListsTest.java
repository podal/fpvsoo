package se.mejsla.podal.fpvsoo.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static se.mejsla.podal.fpvsoo.util.Lists.emptyList;
import static se.mejsla.podal.fpvsoo.util.Lists.list;
import static se.mejsla.podal.fpvsoo.util.Lists.sort;

import org.junit.Test;

public class ListsTest {

	@Test
	public void testEmptyList() {
		assertTrue(emptyList().isEmpty());
	}

	@Test
	public void testSort() {
		assertEquals(list(1, 3, 5, 6, 6, 7), sort(list(1, 6, 3, 7, 5, 6)));
	}

	@Test
	public void testList() {
		assertEquals("[1, 2, 3, 4, 5]", list(1, 2, 3, 4, 5).toString());
	}

	@Test
	public void testAddTail() throws Exception {
		List<String> addTail = emptyList();
		assertEquals("1", addTail.addTail("1").head());
		assertEquals("1", addTail.addTail("1").addTail("2").head());
		assertEquals("2", addTail.addTail("1").addTail("2").tail().head());
	}

}
