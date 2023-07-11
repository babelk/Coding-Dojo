package com.codingdojo.calculadora2;

import java.util.ArrayList;

public class Calculadora2 {
    private ArrayList<Double> operandos;
    private ArrayList<String> operadores;
    private double resultado;
    private double resultadoFinal;
    public Calculadora2() {
        operandos = new ArrayList<>();
        operadores = new ArrayList<>();
    }

    public void performOperation(double operando) {
        operandos.add(operando);
    }

    public void performOperation(String operador) {
        operadores.add(operador);
    }

    public void getResults() {
        ArrayList<Double> operandosTemp = new ArrayList<>(operandos);
        ArrayList<String> operadoresTemp = new ArrayList<>(operadores);

        //multiplicaciones y divisiones
        for (int i = 0; i < operadoresTemp.size(); i++) {
            if (operadoresTemp.get(i).equals("*") || operadoresTemp.get(i).equals("/")) {
                double num1 = operandosTemp.get(i);
                double num2 = operandosTemp.get(i + 1);
                if (operadoresTemp.get(i).equals("*")) {
                    resultado = num1 * num2;
                } else {
                    resultado = num1 / num2;
                }
                operandosTemp.set(i, resultado);
                operandosTemp.remove(i + 1);
                operadoresTemp.remove(i);
                i--;
            }
        }

        //sumas y restas
        resultadoFinal = operandosTemp.get(0);
        for (int i = 0; i < operadoresTemp.size(); i++) {
            double num = operandosTemp.get(i + 1);
            String operador = operadoresTemp.get(i);
            if (operador.equals("+")) {
                resultadoFinal += num;
            } else if (operador.equals("-")) {
                resultadoFinal -= num;
            }
        }

        System.out.println("El resultado es: "+resultadoFinal);;
    }
}
