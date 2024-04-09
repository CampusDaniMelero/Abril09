package com.softtek.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data
public class Producto {




    public static int Contador=1;
    private final int ID;

    private String nombre;

    private double precio;

    public Producto() {
        this.ID=++Contador;
    }

    public double importe(int cantidad){
        return cantidad*precio;
    }

}
