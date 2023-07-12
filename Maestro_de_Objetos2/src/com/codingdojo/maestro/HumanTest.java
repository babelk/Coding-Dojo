package com.codingdojo.maestro;

public class HumanTest {

	public static void main(String[] args) {
		Human humano = new Human();
		Wizard wizard = new Wizard();
		Samurai samurai = new Samurai();
		Ninja ninja = new Ninja();

		humano.attack(ninja);
		ninja.attack(samurai);
		samurai.attack(wizard);
		wizard.attack(humano);
		ninja.attack(samurai);
		ninja.attack(samurai);
		
		ninja.steal(samurai);
		samurai.howMany();
		ninja.runAway();
		
		wizard.heal(ninja);
		wizard.fireBall(samurai);
		
		samurai.howMany();
		samurai.meditate();
		samurai.deathBlow(wizard);
		
	}

}
