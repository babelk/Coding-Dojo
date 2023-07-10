package com.codingdojo.rompecabezas;

import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJavaTest {

	public static void main(String[] args) {
		PuzzleJava ej1 = new PuzzleJava();
		int[] array = {3,5,1,2,7,9,8,13,25,32};
		System.out.println(ej1.printAndReturn(array));
		
		PuzzleJava ej2 = new PuzzleJava();
		String[] array1 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		System.out.println(ej2.mezclar(array1));
		
		PuzzleJava ej3 = new PuzzleJava();
		ArrayList<String> arraynuevo = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
		ej3.alfabeto(arraynuevo);
		
		PuzzleJava ej4 = new PuzzleJava();
		System.out.println(ej4.arregloRandom());
		
		PuzzleJava ej5 = new PuzzleJava();
		ej5.arregloOrdenado();;
		
		PuzzleJava ej6 = new PuzzleJava();
		System.out.println(ej6.generateRandomString());
		
		PuzzleJava ej7 = new PuzzleJava();
		System.out.println(ej7.cadenaArrays());
	}

}
