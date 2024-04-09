package com.softtek.presentacion;

import com.softtek.modelo.Producto;

public class ProbarProducto {

    public static void main(String[] args) {
        System.out.println(Producto.Contador);
        Producto p1 = new Producto();
        Producto p2 = new Producto();

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        System.out.println(p1.importe(5));
        System.out.println(p2.importe(3));

        System.out.println(Producto.Contador);

       //Crear la clase globo con una variable estática entera para asignar el id del globo.
        //En una clase principal PruebaGlobo se crearán distintos objetos y desde cada uno de
        //ellos se mostrará el id del globo
    }
}
