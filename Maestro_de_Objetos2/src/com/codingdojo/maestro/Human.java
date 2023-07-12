package com.codingdojo.maestro;

public class Human {
	private int strength = 3;
	private int intelligence = 3;
	private int stealth = 3;
	private int health = 100;

	public void attack(Human clase) {
		int damage = strength;
		clase.health -= damage;
		System.out.println("Salud Restante de "+clase.getClass().getSimpleName() +" es: "+ clase.health);
	}

	public Human() {
		super();
	}

	public Human(int health) {
		super();
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
