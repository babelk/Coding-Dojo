package com.codingdojo.maestro;

public class Wizard extends Human {
	public Wizard() {
		super();
		setHealth(50);
		setIntelligence(8);
	}

	public void heal(Human clase) {
		int cura = getIntelligence();
		clase.setHealth(clase.getHealth() + cura);
		System.out.println("Wizzard ha curado ha "+ clase.getClass().getSimpleName()+ ". La salud de "+ clase.getClass().getSimpleName() +" ha aumentado en: " + cura + ". Salud Total: " + clase.getHealth());
	}

	public void fireBall(Human clase) {
		int damage = getIntelligence() * 3;
		clase.setHealth(clase.getHealth() - damage);
		System.out.println("Wizzard ha atacado ha " + clase.getClass().getSimpleName() + ". Salud Restante de "+ clase.getClass().getSimpleName()+" es: " + clase.getHealth());
	}
}
