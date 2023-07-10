package funciones;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicios {
	public void unoTo255() {
		ArrayList<Integer> array = new ArrayList<>();
		for(int i=0; i<=255;i++) {
			array.add(i);
		}
		System.out.println(array.toString());
	}
	public void impares1To255() {
		ArrayList<Integer> array = new ArrayList<>();
		for(int i=0; i<=255;i++) {
			if(i%2==1) {
				array.add(i);
			}
		}
		System.out.println(array.toString());
	}
	
	public void Printsum() {
		int sum=0;
		for(int i=0; i<=255;i++) {
			sum = sum + i;
			System.out.println("Nuevo Numero: "+ i + " suma: "+ sum);
		}
	}
	public void recorrerArray(int[] array) {
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	public void maximo(int[] array) {
		int max = 0;
		for(int i=0; i<array.length;i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		System.out.println("El valor maximo es: "+max);
	}
	public void promedio(int[] array) {
		int sum = 0;
		for(int i=0; i<array.length;i++) {
			sum+=array[i];
		}
		System.out.println("El promedio es: "+ sum/array.length);
	}
	public void mayorQueY(int[] array,int y) {
		int contador = 0;
		for(int i=0; i<array.length;i++) {
			if(array[i]>y) {
				contador++;
			}
		}
		System.out.println("Numeros mayores que Y: "+contador);
	}
	public void cuadrado(int[] array) {
		for(int i=0; i<array.length;i++) {
			array[i]= array[i] * array[i];
		}
		System.out.println(Arrays.toString(array));
	}
	public void eliminarNegativos(int[] array) {
		for(int i=0; i<array.length;i++) {
			if(array[i]<0) {
				array[i] = 0;
			}
		}
		System.out.println(Arrays.toString(array));
	}
	public void maxMinAvg(int[] array) {
		int max = 0;
		int min = 0;
		double sum = 0;
		for(int i = 0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
			else if(array[i]<min) {
				min = array[i];
			}
			sum+=array[i];
		}
		Object [] resultado = {max,min,sum/array.length};
		System.out.println(Arrays.toString(resultado));
	}
	public void cambiandoValores(int[] array) {
		for (int i=0; i<array.length-1; i++) {
			array[i]= array[i+1];
			}
		array[array.length-1]= 0;
		System.out.println(Arrays.toString(array));
	}
}
