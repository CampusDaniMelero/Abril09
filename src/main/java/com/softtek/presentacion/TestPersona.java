package com.softtek.presentacion;

import com.softtek.modelo.EstadoCivil;
import com.softtek.modelo.Persona;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25, EstadoCivil.SOLTERO);
        Persona persona2 = new Persona("Pedro", 30, EstadoCivil.CASADO);
        Persona persona3 = new Persona("Maria", 35, EstadoCivil.DIVORCIADO);
        Persona persona4 = new Persona("Ana", 40, EstadoCivil.VIUDO);

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
        System.out.println(persona4.toString());


    }
}
