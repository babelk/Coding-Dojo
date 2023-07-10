package com.codingdojo.lista_de_excepciones;

import java.util.ArrayList;

public class ExcepcionesTest {

	public static void main(String[] args) {
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("Hola Mundo");
		myList.add(48);
		myList.add("Adios Mundo");
		
		Excepciones ejemplo = new Excepciones();
		ejemplo.listaExcepciones(myList);
	}

}
