package com.softtek.presentacion;
import com.softtek.modelo.Calculadora;

public class ProbarCalculadora {
    //Desde una clase principal PruebasCalculadora invocar a los cuatro métodos.
    public static void main(String[] args) {
        System.out.println("La suma de 5 y 3 es: " + Calculadora.suma(5, 3));
        System.out.println("La resta de 5 y 3 es: " + Calculadora.resta(5, 3));
        System.out.println("La multiplicación de 5 y 3 es: " + Calculadora.multiplica(5, 3));
        System.out.println("La división de 5 y 3 es: " + Calculadora.divide(5, 3));
    }
}
