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
	 */
	public String toString() {
		return "Monster Name: " + this.name + " -- Monster Health: " + this.health;
	}
}
