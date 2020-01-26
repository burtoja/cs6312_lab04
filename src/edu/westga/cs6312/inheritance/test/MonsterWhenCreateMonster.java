package edu.westga.cs6312.inheritance.test;

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
	
	/**
	 * Test Monster constructor using the toStringMethod output to verify
	 * it was created correctly. Values used to create Monster: 
	 * Name = Ned
	 * Health = 50
	 */
	@Test
	void testCreateNewMonsterNamedNedWith50Health() {
		Monster theMonster = new Monster("Ned", 50);
		String report = theMonster.toString();
		assertEquals("Monster Name: Ned -- Monster Health: 50", report);
	}

}
