package com.codingdojo.proyectoclass;

public class Proyecto {
	private String nombre;
	private String descripcion;
	private double initialCost;
	public Proyecto() {
		super();
	}
	public Proyecto(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Proyecto(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public Proyecto(String nombre,double initialCost, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.initialCost = initialCost;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Double getInitialCost() {
		return initialCost;
	}
	public void setInitialCost(Double initialCost) {
		this.initialCost = initialCost;
	}
	public void elevatorPitch() {
		System.out.println(nombre + " (" + initialCost + "): " + descripcion);
	}
}
