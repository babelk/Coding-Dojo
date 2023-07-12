package com.codingdojo.maestro;

public class Samurai extends Human {
	public Samurai() {
		setHealth(200);
	}

	public void deathBlow(Human clase) {
		clase.setHealth(clase.getHealth() - clase.getHealth());
		setHealth(getHealth() / 2);
		System.out.println("Samurai ha asesinado ha " + clase.getClass().getSimpleName() + " Vida restante de samurai: " + getHealth());
	}

	public void meditate() {
		setHealth(getHealth()+getHealth()/2);
		System.out.println("Samurai se ha curado. Su vida total es: "+getHealth());
	}
	public void howMany() {
		System.out.println("la vida actual de Samurai es: "+getHealth());
	}
}
