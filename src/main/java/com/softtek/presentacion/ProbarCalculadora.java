package com.softtek.presentacion;
import com.softtek.modelo.Calculadora;

import java.util.Scanner;

public class ProbarCalculadora {
    //Desde una clase principal PruebasCalculadora invocar a los cuatro métodos.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("El resultado de la suma es: " + Calculadora.suma(num1, num2));
        System.out.println("El resultado de la resta es: " + Calculadora.resta(num1, num2));
        System.out.println("El resultado de la multiplicación es: " + Calculadora.multiplica(num1, num2));
        System.out.println("El resultado de la división es: " + Calculadora.divide(num1, num2));

        scanner.close();


    }
}
