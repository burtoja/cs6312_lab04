package edu.westga.cs6312.inheritance.model;

/**
 * This class will model Monsters.  It will serve as a super class for 
 * more specific Monster types
 * 
 * @author J. Allen Burton
 * @version Jan 25, 2020
 *
 */
public class Monster {
	private String name;
	private int health;
	
	/**
	 * Constructor for Monsters
	 * 
	 * @param name	name of the monster
	 * @param health	health level of the monster
	 */
	public Monster(String name, int health) {
		this.name = name;
		this.health = health;
	}
	
	/**
	 * This method returns a string with a readable description of the 
	 * monster name and current health.
	 * 
	 * @return	a string listing the monster name and health
	 * 
	 * @precondition	none
	 */
	@Override
	public String toString() {
		return "Monster Name: " + this.name + " -- Monster Health: " + this.health;
	}

	/**
	 * Method to get the name of the Monster
	 * 
	 * @return the name
	 * 
	 * @precondition	none
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Method to set the name of the Monster
	 * 
	 * @param name the name to set
	 * 
	 * @precondition	none
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method to get the health of the Monster
	 * 
	 * @return the health
	 * 
	 * @precondition	none
	 */
	public int getHealth() {
		return this.health;
	}

	/**
	 * Method to set the helth of the Monster
	 * 
	 * @param health the health value to set
	 * 
	 * @precondition
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	
	
}
