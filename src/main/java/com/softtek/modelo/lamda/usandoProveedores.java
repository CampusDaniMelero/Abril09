package com.softtek.modelo.lamda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class usandoProveedores {
    // Proveedor de números aleatorios en un rango especificado
    public static Supplier<Integer> generarNumeroAleatorio(int min, int max) {
        return () -> {
            Random random = new Random();
            return random.nextInt(max - min + 1) + min;
        };
    }

    // Proveedor de una lista predefinida de elementos
    public static Supplier<List<String>> obtenerLista() {
        return () -> {
            List<String> listaPredefinida = new ArrayList<>();
            listaPredefinida.add("elemento1");
            listaPredefinida.add("elemento2");
            listaPredefinida.add("elemento3");
            return listaPredefinida;
        };
    }

    // Proveedor de fecha y hora actual del sistema
    public static Supplier<LocalDateTime> obtenerDate() {
        return LocalDateTime::now;
    }

    // Proveedor de un nuevo objeto String vacío
    public static Supplier<String> obtenerStringVacio() {
        return () -> "";
    }

    // Clase de configuración de la aplicación para ejemplo
    static class ConfiguracionApp {
        String rutaArchivos;
        String ajustesConexion;

        public ConfiguracionApp(String rutaArchivos, String ajustesConexion) {
            this.rutaArchivos = rutaArchivos;
            this.ajustesConexion = ajustesConexion;
        }
    }

    // Proveedor de un objeto de configuración de la aplicación
    public static Supplier<ConfiguracionApp> obtenerConfiguracionApp() {
        return () -> new ConfiguracionApp("Aqui va mi ruta", "ajustes de conexión");
    }

    public static void main(String[] args) {
        int numeroAleatorio = generarNumeroAleatorio(1, 100).get();
        System.out.println("Número aleatorio: " + numeroAleatorio);

        List<String> listaPredefinida = obtenerLista().get();
        System.out.println("Lista predefinida: " + listaPredefinida);

        LocalDateTime fechaHoraActual = obtenerDate().get();
        System.out.println("Fecha y hora actual: " + fechaHoraActual);

        String stringVacio = obtenerStringVacio().get();
        System.out.println("String vacío: \"" + stringVacio + "\"");

        ConfiguracionApp configuracionApp = obtenerConfiguracionApp().get();
        System.out.println("Configuración de la aplicación +  " + configuracionApp.rutaArchivos  + " + " + configuracionApp.ajustesConexion);
    }
}
