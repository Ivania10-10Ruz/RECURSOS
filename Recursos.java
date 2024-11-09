/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
/**
 * 
 *
 * @author Graciela
 */
public class Recursos {
    // Primer método: Retorna un mensaje
    public String obtenerMensaje() {
        return "Bienvenidos a la Programación Orientada a Objetos 2024";
    }

    // Segundo método: Verifica si es mayor o menor de edad
    public String evaluarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // Tercer método: Realiza una multiplicación de dos enteros
    public int calcularMultiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    // Cuarto método: Retorna una lista de números del 1 al número indicado
    public List<Integer> generarListaNumeros(int limite) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= limite; i++) {
            numeros.add(i);
        }
        return numeros;
    }
}
