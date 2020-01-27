package edu.westga.cs6312.inheritance.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.inheritance.model.Vampire;

class VampireWhenPintsOfBloodNeededSetOrGet {

	/**
	 * Test the getPintsOfBloodNeeded method. Make Vampire with the following
	 * information set at creation and get its pints of blood needed using the
	 * getter: Name: Carl Health: 80 Pints Needed: 5 Expected Result: 5
	 */
	@Test
	void testVampireGetPintsOfBloodNeededExpect5() {
		Vampire theVampire = new Vampire("Carl", 80, 5);
		int report = theVampire.getPintsOfBloodNeeded();
		assertEquals(5, report);
	}

	/**
	 * Test the setPintsOfBloodNeeded method. Make Vampire with the following
	 * information set at creation then change the pints needed using
	 * setPintsOfBloodNeeded and get its name using the getter: Name: Carl Health:
	 * 80 Original Pints Needed: 5 New Pints Needed: 3 Expected Result: 3
	 */
	@Test
	void testVampireSetPintsOfBloodNeeded3() {
		Vampire theVampire = new Vampire("Carl", 80, 5);
		theVampire.setPintsOfBloodNeeded(3);
		int report = theVampire.getPintsOfBloodNeeded();
		assertEquals(3, report);
	}

	/**
	 * Test the setPintsOfBloodNeeded method. Make Vampire with the following
	 * information set at creation then change the pints needed using
	 * setPintsOfBloodNeeded and get its name using the getter: Name: Carl Health:
	 * 80 Original Pints Needed: 5 New Pints Needed: 10 Expected Result: 10
	 */
	@Test
	void testVampireSetPintsOfBloodNeeded10() {
		Vampire theVampire = new Vampire("Carl", 80, 5);
		theVampire.setPintsOfBloodNeeded(10);
		int report = theVampire.getPintsOfBloodNeeded();
		assertEquals(10, report);
	}

	/**
	 * Test the setPintsOfBloodNeeded method. Make Vampire with the following
	 * information set at creation then change the pints needed using
	 * setPintsOfBloodNeeded and get its name using the getter: Name: Carl Health:
	 * 80 Original Pints Needed: 5 New Pints Needed: 0 Expected Result: 0
	 */
	@Test
	void testVampireSetPintsOfBloodNeeded0() {
		Vampire theVampire = new Vampire("Carl", 80, 5);
		theVampire.setPintsOfBloodNeeded(0);
		int report = theVampire.getPintsOfBloodNeeded();
		assertEquals(0, report);
	}

	/**
	 * Test the setPintsOfBloodNeeded method when invalid value sent. Make Vampire
	 * with the following information set at creation then change the pints needed
	 * using setPintsOfBloodNeeded and get its name using the getter: Name: Carl
	 * Health: 80 Original Pints Needed: 5 New Pints Needed: -3 Expected Result: 5
	 */
	@Test
	void testVampireSetPintsOfBloodNeededNeg3Expect5() {
		Vampire theVampire = new Vampire("Carl", 80, 5);
		theVampire.setPintsOfBloodNeeded(-3);
		int report = theVampire.getPintsOfBloodNeeded();
		assertEquals(5, report);
	}

	/**
	 * Test the setPintsOfBloodNeeded method when invalid value sent. Make Vampire
	 * with the following information set at creation then change the pints needed
	 * using setSoundMade and get its name using the getter: Name: Carl Health: 80
	 * Original Pints Needed: 5 New Pints Needed: 12 Expected Result: 5
	 */
	@Test
	void testVampireSetPintsOfBloodNeeded12Expect5() {
		Vampire theVampire = new Vampire("Carl", 80, 5);
		theVampire.setPintsOfBloodNeeded(12);
		int report = theVampire.getPintsOfBloodNeeded();
		assertEquals(5, report);
	}

}
