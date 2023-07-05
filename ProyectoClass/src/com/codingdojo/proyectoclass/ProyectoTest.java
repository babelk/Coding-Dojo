package com.codingdojo.proyectoclass;

public class ProyectoTest {

	public static void main(String[] args) {

		Proyecto proyecto1 = new Proyecto();
		Proyecto proyecto2 = new Proyecto("nombre",1500,null);
		Proyecto proyecto3 = new Proyecto("nombre",3000,"descripcion");
		Proyecto proyecto4 = new Proyecto("nombre",5000,"descripcion");
		Portafolio portafolio = new Portafolio();
		portafolio.agregarProyecto(proyecto1);
		portafolio.agregarProyecto(proyecto2);
		portafolio.agregarProyecto(proyecto3);
		portafolio.agregarProyecto(proyecto4);
		portafolio.showPortfolio();;
		
	}

}
