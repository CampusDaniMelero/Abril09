package com.softtek.modelo.lamda;

public class UsandoPredicados {
    //Predicado para números positivos: Verificar si un número entero es positivo.
    //Predicado para cadenas no vacías: Comprobar si una cadena de texto no está vacía.
    //Predicado para números pares: Determinar si un número entero es par.
    //Predicado para números mayores que un valor dado:Comprobar si un número entero
    //es mayor que un valor específico.
    //Predicado para números primos:Determinar si un número entero es primo.

    public static boolean esPositivo(int numero) {
        return numero > 0;
    }

    public static boolean noEmpty(String cadena) {
        return cadena != null && !cadena.isEmpty();
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    public static boolean esMayorQue(int numero, int valor) {
        return numero > valor;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        System.out.println("el numero introducido : " + esPositivo(-5));
        System.out.println("La cadena esta vacia? : " + noEmpty(""));
        System.out.println("Es par?: " + esPar(3));
        System.out.println("Es mayor que: " + esMayorQue(2, 6));
        System.out.println("Es primo: " + esPrimo(9));
    }
}
