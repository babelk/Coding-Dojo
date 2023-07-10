package com.codingdojo.rompecabezas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
	public String printAndReturn(int[] array) {
		int sum = 0;
		ArrayList<Integer> arraynuevo = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (array[i] > 10) {
				arraynuevo.add(array[i]);
			}
		}
		System.out.println("La suma de todos los vales es: " + sum);
		return "Los valores mayores a 10 son: " + arraynuevo.toString();
	}

	public String mezclar(String[] array) {
		ArrayList<String> arraynuevo = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > 5) {
				arraynuevo.add(array[i]);
			}
			int j = random.nextInt(i + 1);
			String temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		System.out.println(Arrays.toString(array));
		return arraynuevo.toString();
	}

	public void alfabeto(ArrayList<String> array) {
		Collections.shuffle(array);
		System.out.println(array);
		System.out.println(array.get(array.size() - 1).toString());
		if (array.get(0) == "a" || array.get(0) == "e" || array.get(0) == "i" || array.get(0) == "o"
				|| array.get(0) == "u") {
			System.out.println("El primer elemento es la vocal: " + array.get(0).toString());
		} else {
			System.out.println(array.get(0).toString());
		}
	}

	public ArrayList<Integer> arregloRandom() {
		Random random = new Random();
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int min = 55;
			int max = 100;
			array.add(random.nextInt(max - min + 1) + min);
		}
		return array;
	}

	public void arregloOrdenado() {
		Random random = new Random();
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int min = 55;
			int max = 100;
			array.add(random.nextInt(max - min + 1) + min);
		}
		Collections.sort(array);
		int valorMin = Collections.min(array);
		int valorMax = Collections.max(array);
		System.out.println(array);
		System.out.println("el valor minimo es: " + valorMin + " Y " + "el valor maximo es: " + valorMax);
	}

	public String generateRandomString() {
		ArrayList<Character> caracteres = new ArrayList<>();
		for (char c = 'A'; c <= 'Z'; c++) {
			caracteres.add(c);
		}
		for (char c = 'a'; c <= 'z'; c++) {
			caracteres.add(c);
		}
		for (char c = '0'; c <= '9'; c++) {
			caracteres.add(c);
		}
		Collections.shuffle(caracteres);

		StringBuilder cadena = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			int numeroRandom = random.nextInt(caracteres.size());
			cadena.append(caracteres.get(numeroRandom));
		}

		return cadena.toString();
	}
	public String cadenaArrays() {
		ArrayList<Character> caracteres = new ArrayList<>();
		for (char c = 'A'; c <= 'Z'; c++) {
			caracteres.add(c);
		}
		for (char c = 'a'; c <= 'z'; c++) {
			caracteres.add(c);
		}
		for (char c = '0'; c <= '9'; c++) {
			caracteres.add(c);
		}
		Collections.shuffle(caracteres);

		ArrayList<String> diesCadenas = new ArrayList<>();
		StringBuilder cadena = new StringBuilder();
		Random random = new Random();
		for(int i=0; i<10; i++) {
			for (int j = 0; j < 5; j++) {
				int numeroRandom = random.nextInt(caracteres.size());
				cadena.append(caracteres.get(numeroRandom));
			}
			diesCadenas.add(cadena.toString());
			cadena.setLength(0);
		}

		return diesCadenas.toString();
	}

}
