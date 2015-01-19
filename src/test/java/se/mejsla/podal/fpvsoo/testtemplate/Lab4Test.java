package se.mejsla.podal.fpvsoo.testtemplate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static se.mejsla.podal.fpvsoo.util.Lists.list;

import org.junit.Test;

import se.mejsla.podal.fpvsoo.Equals;
import se.mejsla.podal.fpvsoo.Lab1;
import se.mejsla.podal.fpvsoo.Lab4;
import se.mejsla.podal.fpvsoo.util.List;

public class Lab4Test {

	private static class Employee {
		private String name;
		private String position;

		public Employee(String name, String position) {
			this.name = name;
			this.position = position;
		}

		@Override
		public int hashCode() {
			return (name + position).hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj == null) {
				return false;
			} else if (!obj.getClass().equals(Employee.class)) {
				return false;
			}
			Employee e2 = (Employee) obj;
			return (name + position).equals((e2.name + e2.position));
		}
	}

	private Equals<Employee> EMPLOYEE_POSITION = new Equals<Employee>() {
		@Override
		public boolean isEqual(Employee t1, Employee t2) {
			return t1.position.equals(t2.position);
		}
	};
	private static final Employee ANCI = new Employee("Anci", "Försäljning");
	private static final Employee DANIEL = new Employee("Daniel", "Konsult");
	private static final Employee GUSTAF = new Employee("Gustaf", "Konsult");
	private static final Employee KRISTOFFER = new Employee("Kristoffer", "Konsult");
	private static final Employee MARIE = new Employee("Marie", "VD");
	private static final Employee MICHAEL = new Employee("Michael", "VD");

	private static final List<Employee> OLD_MEJSLA = list(MARIE, KRISTOFFER, GUSTAF, DANIEL);

	@Test
	public void replaceOrAdd_replace() {
		Employee newVD = MICHAEL;
		List<Employee> newMejsla = Lab4.replaceOrAdd(OLD_MEJSLA, EMPLOYEE_POSITION, newVD);
		assertEquals(4, newMejsla.size());
		assertTrue(Lab1.exists(newMejsla, MICHAEL));
		assertFalse(Lab1.exists(newMejsla, MARIE));
	}

	@Test
	public void replaceOrAdd_add() {
		Employee newSälj = ANCI;
		List<Employee> newMejsla = Lab4.replaceOrAdd(OLD_MEJSLA, EMPLOYEE_POSITION, newSälj);
		assertEquals(5, newMejsla.size());
		assertTrue(Lab1.exists(newMejsla, ANCI));
	}
}
