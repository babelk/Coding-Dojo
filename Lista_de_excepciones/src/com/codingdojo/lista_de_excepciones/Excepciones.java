package com.codingdojo.lista_de_excepciones;

import java.util.ArrayList;

public class Excepciones {
	public void listaExcepciones(ArrayList<Object> array) {
		for (int i = 0; i < array.size(); i++) {
			
			try {
				int castedValue = (int) array.get(i);
				System.out.println("El valor es: " + castedValue);
				
			} catch (Exception e) {
				System.out.println("Error con el valor: " + array.get(i));
			}
		}

	}
}
