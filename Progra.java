/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursos;

/**
 *
 * @author Graciela
 */
public class Progra {
    public static void main(String[] args) {
        // Instanciar la clase Recursos
        RECURSOS recursos = new RECURSOS();

        // Llamar al primer método
        String mensaje = recursos.obtenerMensaje();
        System.out.println(mensaje);

        // Llamar al segundo método
        int edadPersona = 22;  // Cambia este valor para probar
        String resultadoEdad = recursos.evaluarEdad(edadPersona);
        System.out.println("Edad: " + edadPersona + " - " + resultadoEdad);

        // Llamar al tercer método
        int numero1 = 7;
        int numero2 = 5;
        int resultadoMultiplicacion = recursos.calcularMultiplicacion(numero1, numero2);
        System.out.println("Multiplicación de " + numero1 + " y " + numero2 + " es: " + resultadoMultiplicacion);

        // Llamar al cuarto método
        int limite = 10;  // Puedes cambiar este valor para generar una lista diferente
        System.out.println("Números del 1 al " + limite + ": " + recursos.generarListaNumeros(limite));
    }
}

