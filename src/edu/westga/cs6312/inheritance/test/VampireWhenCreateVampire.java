package edu.westga.cs6312.inheritance.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.inheritance.model.Vampire;

class VampireWhenCreateVampire {

	/**
	 * Test of the 3 parameter constructor.  Values sent:
	 * Name: Stan
	 * Health: 90
	 * Pints Needed: 4 
	 */
	@Test
	void testNewVampireNameStanHealth90Pints4() {
		Vampire theVampire = new Vampire("Stan", 90, 4);
		String report = theVampire.toString();
		assertEquals("Name: Stan -- Health: 90 -- Pints Needed: 4", report);
	}
	
	/**
	 * Test of the 3 parameter constructor with invalid pints needed value (low).  
	 * Values sent:
	 * Name: Rob
	 * Health: 85
	 * Supplied Pints Needed: -4 
	 * Expect Pints Needed: 0
	 */
	@Test
	void testNewVampireNameRobHealth85PintsNeg4() {
		Vampire theVampire = new Vampire("Rob", 85, -4);
		String report = theVampire.toString();
		assertEquals("Name: Rob -- Health: 85 -- Pints Needed: 0", report);
	}
	
	/**
	 * Test of the 3 parameter constructor with invalid pints needed value (high).  
	 * Values sent:
	 * Name: Gary
	 * Health: 75
	 * Supplied Pints Needed: 14 
	 * Expect Pints Needed: 0
	 */
	@Test
	void testNewVampireNameGaryHealth75Pints14() {
		Vampire theVampire = new Vampire("Gary", 75, 14);
		String report = theVampire.toString();
		assertEquals("Name: Gary -- Health: 75 -- Pints Needed: 0", report);
	}
	
	/**
	 * Test of the 2 parameter constructor.  
	 * Values sent:
	 * Name: Jan
	 * Health: 80
	 * Expect Pints Needed: 0
	 */
	@Test
	void testNewVampireNameJanHealth80Pints5() {
		Vampire theVampire = new Vampire("Jan", 80);
		String report = theVampire.toString();
		assertEquals("Name: Jan -- Health: 80 -- Pints Needed: 0", report);
	}
}
