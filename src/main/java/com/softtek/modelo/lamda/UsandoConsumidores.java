package com.softtek.modelo.lamda;

import java.util.function.Consumer;

public class UsandoConsumidores {

    public static class Producto {
        String nombre;
        double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        @Override
        public String toString() {
            return "Producto: " + nombre + ", Precio: $" + precio;
        }
    }

    public static Consumer<String> imprimirEnMayusculas = cadena -> System.out.println(cadena.toUpperCase());

    public static Consumer<Integer> imprimirCuadrados = numero -> System.out.println("Número: " + numero + ", Cuadrado: " + numero * numero);

    public static Consumer<Producto> mostrarDetallesProducto = producto -> System.out.println(producto.toString());

    public static Consumer<String> mostrarEnDialogo = mensaje -> System.out.println("Mensaje mostrado en cuadro de diálogo: " + mensaje);

    public static Consumer<String> escribirEnArchivoLog = evento -> System.out.println("Evento registrado: " + evento);

    public static void main(String[] args) {
        // Ejemplos aplicando los Consumer
        imprimirEnMayusculas.accept("hola mundo");
        imprimirCuadrados.accept(5);
        Producto producto = new Producto("Laptop", 1200.50);
        mostrarDetallesProducto.accept(producto);
        mostrarEnDialogo.accept("Este es un mensaje en un cuadro de diálogo");
        escribirEnArchivoLog.accept("Se ha registrado un evento de inicio de sesión");
    }
}
