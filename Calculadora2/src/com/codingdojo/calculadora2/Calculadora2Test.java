package com.codingdojo.calculadora2;

public class Calculadora2Test {

	public static void main(String[] args) {
        Calculadora2 calculadora = new Calculadora2();       
        calculadora.performOperation(20);
        calculadora.performOperation("-");
        calculadora.performOperation(10.5);
        calculadora.performOperation("+");
        calculadora.performOperation(5.2);
        calculadora.performOperation("*");
        calculadora.performOperation(10);
        calculadora.performOperation("/");
        calculadora.performOperation(5);
        calculadora.getResults();

	}

}
