package se.mejsla.podal.fpvsoo.testtemplate;

import static org.junit.Assert.assertEquals;
import static se.mejsla.podal.fpvsoo.util.ListUtil.Lists;

import org.junit.Test;

import se.mejsla.podal.fpvsoo.Lab5;
import se.mejsla.podal.fpvsoo.util.List;

public class Lab5Test {

	@Test
	public void remove_notfound() {
		List<Integer> list = Lab5.remove(Lists.list(1, 2, 3, 4, 5), 6);
		assertEquals(Lists.sort(Lists.list(1, 2, 3, 4, 5)), Lists.sort(list));
	}

	@Test
	public void replaceOrAdd_add() {
		List<String> list = Lab5.remove(Lists.list("Karl", "Anci", "Karin", "Johan", "Jesper"), "Jesper");
		assertEquals(Lists.sort(Lists.list("Anci", "Johan", "Karin", "Karl")), Lists.sort(list));
	}
}
