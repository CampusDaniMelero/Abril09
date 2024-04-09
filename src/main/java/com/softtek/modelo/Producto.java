package com.softtek.modelo;

public class Producto {
    private final int ID;

    private String nombre;

    private double precio;

    public Producto() {
        this.ID=1;
    }

    public double importe(int cantidad){
        return cantidad*precio;
    }

}
