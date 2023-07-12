package com.codingdojo.maestro;

public class Ninja extends Human {
	public Ninja() {
		super();
		setStealth(10);
	}

	public void steal(Human clase) {
		int robo = getStealth();
		clase.setHealth(clase.getHealth() - robo);
		setHealth(getHealth() + robo);
		System.out.println("Ninja ha robado " + robo +" de Salud ha "+clase.getClass().getSimpleName()+ ". Salud Restante: " + getHealth());
	}

	public void runAway() {
		setHealth(getHealth() - 10);
		System.out.println(
				"El ninja ha escapado y ha disminuido su vida en 10. " + "Vida restante de Ninja: " + getHealth());
	}
}
