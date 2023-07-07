package com.codingdojo.calculadora1;

public class CalculadoraTest {

	public static void main(String[] args) {
		Calculadora calculo1 = new Calculadora();
		calculo1.setOperador1(10.5);
		calculo1.setOperation("+");
		calculo1.setOperador2(5.2);
		calculo1.performOperation();
		calculo1.getResultado();
		
		Calculadora calculo2 = new Calculadora();
		calculo2.setOperador1(10.5);
		calculo2.setOperation("-");
		calculo2.setOperador2(5.2);
		calculo2.performOperation();
		calculo2.getResultado();
	}

}
