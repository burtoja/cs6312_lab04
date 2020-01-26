package edu.westga.cs6312.inheritance.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.inheritance.model.Monster;

class MonsterWhenCreateMonster {

	/**
	 * Test Monster constructor using the toStringMethod output to verify
	 * it was created correctly. Values used to create Monster: 
	 * Name = Carl
	 * Health = 100
	 */
	@Test
	void testCreateNewMonsterNamedCarlWith100Health() {
		Monster theMonster = new Monster("Carl", 100);
		String report = theMonster.toString();
		assertEquals("Monster Name: Carl -- Monster Health: 100", report);
	}

}
