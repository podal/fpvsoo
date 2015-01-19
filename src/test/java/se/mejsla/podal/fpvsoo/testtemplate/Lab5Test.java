package se.mejsla.podal.fpvsoo.testtemplate;

import static org.junit.Assert.assertEquals;
import static se.mejsla.podal.fpvsoo.util.Lists.list;
import static se.mejsla.podal.fpvsoo.util.Lists.sort;

import org.junit.Test;

import se.mejsla.podal.fpvsoo.Lab5;
import se.mejsla.podal.fpvsoo.util.List;

public class Lab5Test {

	@Test
	public void remove_notfound() {
		List<Integer> list = Lab5.remove(list(1, 2, 3, 4, 5), 6);
		assertEquals(sort(list(1, 2, 3, 4, 5)), sort(list));
	}

	@Test
	public void replaceOrAdd_add() {
		List<String> list = Lab5.remove(list("Karl", "Anci", "Karin", "Johan", "Jesper"), "Jesper");
		assertEquals(sort(list("Anci", "Johan", "Karin", "Karl")), sort(list));
	}
}
