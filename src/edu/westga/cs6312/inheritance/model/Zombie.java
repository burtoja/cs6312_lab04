package edu.westga.cs6312.inheritance.model;

/**
 * This class defines a subclass of Monster called a Zombie.
 * 
 * @author J. Allen Burton
 * @version Jan 26, 2020
 *
 */
public class Zombie extends Monster {
	private String soundMade;
	
	/**
	 * Constructor for Zomie objects
	 * 
	 * @param name	sets the name of the Zombie
	 * @param health	sets the health of the Zombie
	 * @param soundMade	sets the sound the Zombie makes (handled by super class)
	 */
	public Zombie(String name, int health, String soundMade) {
		super(name, health);
		this.soundMade = soundMade;
	}
	
	/**
	 * Constructor for Zomie objects using a default health of 100
	 * 
	 * @param name	sets the name of the Zombie
	 * @param soundMade	sets the sound the Zombie makes
	 * 
	 * @precondition	none
	 */
	public Zombie(String name, String soundMade) {
		this(name, 100, soundMade);	
	}
	
	/**
	 * Method to get the sound made by the Zombie
	 * 
	 * @return sound made by the Zombie
	 * 
	 * @precondition	none
	 */
	public String getSoundMade() {
		return this.soundMade;
	}
	
	/**
	 * Method to set the sound made by the Zombie
	 * 
	 * @param soundMade sound made by Zombie
	 * 
	 * @precondition	none
	 */
	public void setSoundMade(String soundMade) {
		this.soundMade = soundMade;
	}
	
	/**
	 * Method to get string values of Zombie instance variables
	 * 
	 * @return string representation of object instance variable values
	 *
	 * @precondition none
	 */
	@Override
	public String toString() {
		return super.toString() + " -- Sound: " + this.soundMade;
	}

}
