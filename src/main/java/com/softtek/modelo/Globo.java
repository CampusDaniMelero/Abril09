package com.softtek.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Globo {
   //Ejercicio1

    private static int idGlobo = 0;
    private int id;
    private String name;

    public Globo() {
        this.id=++idGlobo;
    }

    public static int getIdGlobo() {
        return idGlobo;
    }

    public static void setIdGlobo(int idGlobo) {
        Globo.idGlobo = idGlobo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
