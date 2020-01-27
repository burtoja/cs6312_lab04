package edu.westga.cs6312.inheritance.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.inheritance.model.Monster;

/**
 * This will serve as the test class for the Monster health setter and getter
 * methods
 * 
 * @author J. Allen Burton
 * @version Jan 26, 2020
 *
 */
class MonsterWhenHealthSetOrGet {

	/**
	 * Test the getHealth method. Make Monster with the following information set at
	 * creation and get its health using the getter: Name: Carl Health: 100 Expected
	 * Result: 100
	 */
	@Test
	void testMonsterGetHealthExpect100() {
		Monster theMonster = new Monster("Carl", 100);
		int report = theMonster.getHealth();
		assertEquals(100, report);
	}

	/**
	 * Test the setHealth method. Make Monster with the following information set at
	 * creation then change the health to 75 using setHealth and get its health
	 * using the getter: Original Name: Carl Health: 100 New Health: 75 Expected
	 * Result: 75
	 */
	@Test
	void testMonsterSetHealthto75Expect75() {
		Monster theMonster = new Monster("Carl", 100);
		theMonster.setHealth(75);
		int report = theMonster.getHealth();
		assertEquals(75, report);
	}

	/**
	 * Test the setHealth method. Make Monster with the following information set at
	 * creation then change the health to 0 using setHealth and get its health using
	 * the getter: Original Name: Carl Health: 100 New Health: 0 Expected Result: 0
	 */
	@Test
	void testMonsterSetHealthTo0Expect0() {
		Monster theMonster = new Monster("Carl", 100);
		theMonster.setHealth(0);
		int report = theMonster.getHealth();
		assertEquals(0, report);
	}

	/**
	 * Test the setHealth method when invalid value sent. Make Monster with the
	 * following information set at creation then attempt to change the health to
	 * -75 using setHealth and get its health using the getter: Original Name: Carl
	 * Health: 90 New Health Attempt: -75 Expected Result Health: 90
	 */
	@Test
	void testMonsterSetHealthtoNeg75Expect90() {
		Monster theMonster = new Monster("Carl", 90);
		theMonster.setHealth(-75);
		int report = theMonster.getHealth();
		assertEquals(90, report);
	}

}
