package edu.westga.cs6312.inheritance.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.inheritance.model.Zombie;

class ZombieWhenSoundMadeSetOrGet {

	/**
	 * Test the getSoundMade method. Make Zombie with the following information set
	 * at creation and get its sound using the getter: Name: Carl Health: 100
	 * (default) Sound: Meow Expected Result: Meow
	 */
	@Test
	void testZombieGetSoundMadeExpectMeow() {
		Zombie theZombie = new Zombie("Carl", "Meow");
		String report = theZombie.getSoundMade();
		assertEquals("Meow", report);
	}

	/**
	 * Test the setSoundMade method. Make Zombie with the following information set
	 * at creation then change the sound to Arff using setSoundMade and get its name
	 * using the getter: Original Name: Carl Health: 100 (default) Original Sound:
	 * Meow New Sound: Arff Expected Result: Arff
	 */
	@Test
	void testZombieSetSoundMadeArff() {
		Zombie theZombie = new Zombie("Carl", "Meow");
		theZombie.setSoundMade("Arff");
		String report = theZombie.getSoundMade();
		assertEquals("Arff", report);
	}

}
