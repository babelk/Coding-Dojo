package gorilla;

import mamifero.Mammal;

public class Gorilla extends Mammal{

	public void throwSomething() {
		System.out.println("ha lanzado algo");
		setEnergyLevel(getEnergyLevel()-5);
	}
	public void eatBananas() {
		System.out.println("Gorilla satisfecho");
		setEnergyLevel(getEnergyLevel()+10);
	}
	public void climb(){
		System.out.println("Gorilla ha trepado a la cima de un árbol");
		setEnergyLevel(getEnergyLevel()-10);
	}
	
}
