package com.codingdojo.proyectoclass;

import java.util.ArrayList;

public class Portafolio {
    private ArrayList<Proyecto> proyectos;

    public Portafolio() {
        proyectos = new ArrayList<>();
    }

    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public void eliminarProyecto(Proyecto proyecto) {
        proyectos.remove(proyecto);
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
    public double getPortfolioCost() {
        double costoTotal = 0;
        for (Proyecto proyecto : proyectos) {
            costoTotal += proyecto.getInitialCost();
        }
        return costoTotal;
    }
    public void showPortfolio() {
        for (Proyecto proyecto : proyectos) {
            proyecto.elevatorPitch();
        }
        System.out.println("Costo total del portafolio: $" + getPortfolioCost());
    }

}

