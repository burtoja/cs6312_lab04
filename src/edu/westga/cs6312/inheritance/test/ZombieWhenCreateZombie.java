package edu.westga.cs6312.inheritance.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.inheritance.model.Zombie;

class ZombieWhenCreateZombie {

	/**
	 * Test 3 parameter Zombie constructor using toString output.  Expected values:
	 * Name: Bob
	 * Health: 90
	 * Sound: Meow
	 *
	 * @precondition
	 */
	@Test
	void testNewZombieWithNameBobHealth90SoundMeow() {
		Zombie theZombie = new Zombie("Bob", 90, "Meow");
		String report = theZombie.toString();
		assertEquals("Name: Bob -- Health: 90 -- Sound: Meow", report);
	}
	
	/**
	 * Test 2 parameter Zombie constructor using toString output.  Expected values:
	 * Name: Bob
	 * Health: 100
	 * Sound: Meow
	 *
	 * @precondition
	 */
	@Test
	void testNewZombieWithNameGeorgeSoundMooo() {
		Zombie theZombie = new Zombie("George", "Mooo");
		String report = theZombie.toString();
		assertEquals("Name: George -- Health: 100 -- Sound: Mooo", report);
	}

}
