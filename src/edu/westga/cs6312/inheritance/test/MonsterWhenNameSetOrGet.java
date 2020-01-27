package edu.westga.cs6312.inheritance.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.inheritance.model.Monster;

/**
 * This will serve as the test class for the Monster name setter and getter
 * methods.
 * 
 * @author J. Allen Burton
 * @version Jan 26, 2020
 *
 */
class MonsterWhenNameSetOrGet {

	/**
	 * Test the getName method. Make Monster with the following information set at
	 * creation and get its name using the getter: Name: Carl Health: 100 Expected
	 * Result: Carl
	 */
	@Test
	void testMonsterGetNameExpectCarl() {
		Monster theMonster = new Monster("Carl", 100);
		String report = theMonster.getName();
		assertEquals("Carl", report);
	}

	/**
	 * Test the setName method. Make Monster with the following information set at
	 * creation then change the name to Bob using setName and get its name using the
	 * getter: Original Name: Carl Health: 100 New Name: Bob Expected Result: Bob
	 */
	@Test
	void testMonsterSetNameExpectBob() {
		Monster theMonster = new Monster("Carl", 100);
		theMonster.setName("Bob");
		String report = theMonster.getName();
		assertEquals("Bob", report);
	}

}
