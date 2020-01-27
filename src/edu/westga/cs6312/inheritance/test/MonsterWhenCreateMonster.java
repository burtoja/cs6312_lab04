package edu.westga.cs6312.inheritance.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.inheritance.model.Monster;

/**
 * This will serve as the test class for the Monster constructor and toString
 * 
 * @author J. Allen Burton
 * @version Jan 26, 2020
 *
 */
class MonsterWhenCreateMonster {

	/**
	 * Test Monster constructor using the toStringMethod output to verify it was
	 * created correctly. Values used to create Monster: Name = Carl Health = 100
	 */
	@Test
	void testCreateNewMonsterNamedCarlWith100Health() {
		Monster theMonster = new Monster("Carl", 100);
		String report = theMonster.toString();
		assertEquals("Name: Carl -- Health: 100", report);
	}

	/**
	 * Test Monster constructor using the toStringMethod output to verify it was
	 * created correctly. Values used to create Monster: Name = Ned Health = 50
	 */
	@Test
	void testCreateNewMonsterNamedNedWith50Health() {
		Monster theMonster = new Monster("Ned", 50);
		String report = theMonster.toString();
		assertEquals("Name: Ned -- Health: 50", report);
	}

	/**
	 * Test Monster constructor when value outsied precondition for health is
	 * supplied. This test will use the toStringMethod output to verify it was
	 * created correctly. Values used to create Monster: Name = Ned Health = 50
	 */
	@Test
	void testCreateNewMonsterNamedNedWithNeg50HealthExpect100Health() {
		Monster theMonster = new Monster("Ned", -50);
		String report = theMonster.toString();
		assertEquals("Name: Ned -- Health: 100", report);
	}

}
