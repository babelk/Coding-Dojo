package com.codingdojo.calculadora1;

public class Calculadora {
private double operador1;
private double operador2;
private String operation;
private double resultado;

public void performOperation() {
	if(operation == "+") {
		resultado = operador1 + operador2;
		System.out.println("el resultado es: "+resultado);
	}
	else if(operation == "-") {
		resultado = operador1 - operador2;
		System.out.println("el resultado es: "+resultado);
	}
	else {
		System.out.println("signo invalido");
	}
}

public String getOperation() {
	return operation;
}

public void setOperation(String operation) {
	this.operation = operation;
}

public double getResultado() {
	return resultado;
}


public void setResultado(double resultado) {
	this.resultado = resultado;
}


public double getOperador1() {
	return operador1;
}
public void setOperador1(double operador1) {
	this.operador1 = operador1;
}
public double getOperador2() {
	return operador2;
}
public void setOperador2(double operador2) {
	this.operador2 = operador2;
}

}
