package edu.westga.cs6312.inheritance.model;

/**
 * This class defines Vampire objects and is a subclass of the Monster class.
 * This class will keep up with the name, health, and pints of blood needed  
 * Vampire objects. Note that health must be an integer >= 0 and pints of blood 
 * needed must be an integer between 0 and 10 (inclusive at both ends).
 * 
 * @author J. Allen Burton
 * @version Jan 27, 2020
 *
 */
public class Vampire extends Monster {
	private int pintsOfBloodNeeded; 

	/**
	 * 3 parameter constructor for Vampire objects. If invalid health value is sent, the default value of 100 
	 * will be set. If invalid value is sent for the pints of blood needed, then the default value
	 * of zero will be set.
	 *
	 * @param name	the name of the Vampire
	 * @param health	the health of the Vampire
	 * @param pintsOfBloodNeeded	the pints of blood needed by the Vampire
	 *
	 * @precondition	health >= 0 (handled by super class constructor)
	 * @precondition	pintsOfBloodNeeded >= 0 && pintsOfBloodNeeded <= 10
	 */
	public Vampire (String name, int health, int pintsOfBloodNeeded) {
		super(name, health);
		if (pintsOfBloodNeeded >= 0 && pintsOfBloodNeeded <= 10) {
			this.pintsOfBloodNeeded = pintsOfBloodNeeded;
		} else {
			this.pintsOfBloodNeeded = 0;
		}
	}
	
	/**
	 * 2 parameter constructor for Vampire objects.  The pints of blood needed
	 * is set to zero.  If invalid health value is sent, the default value of 100 
	 * will be set.
	 *
	 * @param name	the name of the Vampire
	 * @param 	health the health of the Vampire
	 *
	 * @precondition	health >= 0 (handled by super class constructor)
	 */
	public Vampire(String name, int health) {
		this(name,  health,  0);
	}
	
	@Override
	public String toString() {
		return super.toString() + " -- Pints Needed: " + this.pintsOfBloodNeeded;
	}
	

}
