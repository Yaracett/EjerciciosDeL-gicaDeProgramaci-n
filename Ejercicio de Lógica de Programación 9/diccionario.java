package Diccionario;

import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {

    public static void main(String[] args) {
        // desarrollo de diccionario
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("libro", "book");
        diccionario.put("manzana", "apple");
        diccionario.put("mesa", "table");
        diccionario.put("computadora", "computer");
        diccionario.put("telefono", "phone");
        diccionario.put("ciudad", "city");
        diccionario.put("coche", "car");
        diccionario.put("arbol", "tree");
        diccionario.put("silla", "chair");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("mar", "sea");
        diccionario.put("rio", "river");
        diccionario.put("montaña", "mountain");
        diccionario.put("verde", "green");
        diccionario.put("rojo", "red");
        diccionario.put("azul", "blue");

        // Solicitar una palabra en español al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra en español: ");
        String palabra = scanner.nextLine().toLowerCase();

        // Buscar la traducción en el diccionario y mostrarla por consola
        if (diccionario.containsKey(palabra)) {
            String traduccion = diccionario.get(palabra);
            System.out.println("La traducción al inglés es: " + traduccion);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario");
        }
    }

}

