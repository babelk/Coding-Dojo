package funciones;

public class EjerciciosTest {

	public static void main(String[] args) {
		Ejercicios ej1 = new Ejercicios();
		ej1.unoTo255();
		Ejercicios ej2 = new Ejercicios();
		ej2.impares1To255();
		Ejercicios ej3 = new Ejercicios();
		ej3.Printsum();
		Ejercicios ej4 = new Ejercicios();
		int[] array = {1,3,5,7,9,13};
		ej4.recorrerArray(array);
		Ejercicios ej5 = new Ejercicios();
		int[] array1 = {5,7,1,3,9};
		ej5.maximo(array1);
		Ejercicios ej6 = new Ejercicios();
		int[] array2 = {2,10,3};
		ej6.promedio(array2);
		Ejercicios ej7 = new Ejercicios();
		int[] array3 = {1,3,5,7};
		ej7.mayorQueY(array3,3);
		Ejercicios ej8 = new Ejercicios();
		int[] array4 = {1,5,10,-2};
		ej8.cuadrado(array4);
		Ejercicios ej9 = new Ejercicios();
		int[] array5 = {1,5,10,-2};
		ej9.eliminarNegativos(array5);
		Ejercicios ej10 = new Ejercicios();
		int[] array6 = {1,5,10,-2};
		ej10.maxMinAvg(array6);
		Ejercicios ej11 = new Ejercicios();
		int[] array7 = {1,5,10,-2};
		ej11.cambiandoValores(array7);

	}

}
