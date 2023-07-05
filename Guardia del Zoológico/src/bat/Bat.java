package bat;

import mamifero.Mammal;

public class Bat extends Mammal{
	public Bat() {
		setEnergyLevel(300);
	}
	public void fly() {
		System.out.println("volar");
		setEnergyLevel(getEnergyLevel()-50);
	}
	public void eatHumans() {
		System.out.println("bueno, no importa");
		setEnergyLevel(getEnergyLevel()+25);
	}
	public void attackTown() {
		System.out.println("Bat atacando");
		setEnergyLevel(getEnergyLevel()-100);
	}
	
}
