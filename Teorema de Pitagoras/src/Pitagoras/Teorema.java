package Pitagoras;

public class Teorema {

	public static void main(String[] args) {
		System.out.println(calcularhipotenusa(8, 4));
	}

	public static double calcularhipotenusa(int catA, int catB) {
		return Math.sqrt(Math.pow(catA, 2) + Math.pow(catB, 2));
	}
}
