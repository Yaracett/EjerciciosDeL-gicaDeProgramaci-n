package DiccionarioIE;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DiccionarioIngEsp {
	


	    public static void main(String[] args) {
	        Map<String, String> diccionario = new HashMap<>();
	        diccionario.put("perro", "dog");
	        diccionario.put("gato", "cat");
	        diccionario.put("casa", "house");
	        diccionario.put("coche", "car");
	        diccionario.put("jardín", "garden");
	        diccionario.put("hamburguesa", "hamburger");
	        diccionario.put("manzana", "apple");
	        diccionario.put("piscina", "pool");
	        diccionario.put("libro", "book");
	        diccionario.put("plátano", "banana");
	        diccionario.put("computadora", "computer");
	        diccionario.put("mesa", "table");
	        diccionario.put("teléfono", "phone");
	        diccionario.put("árbol", "tree");
	        diccionario.put("taza", "cup");
	        diccionario.put("carta", "letter");
	        diccionario.put("lápiz", "pencil");
	        diccionario.put("pájaro", "bird");
	        diccionario.put("reloj", "clock");
	        diccionario.put("león", "lion");

	        // Seleccionar 5 palabras aleatorias del diccionario
	        String[] palabrasAleatorias = seleccionarPalabrasAleatorias(diccionario, 5);

	        // Pedir al usuario la traducción de cada palabra y comprobar si es correcta
	        int respuestasCorrectas = 0;
	        int respuestasIncorrectas = 0;
	        Scanner scanner = new Scanner(System.in);
	        for (String palabra : palabrasAleatorias) {
	            System.out.print("Traducción de " + palabra + ": ");
	            String respuestaUsuario = scanner.nextLine();
	            if (diccionario.get(palabra).equals(respuestaUsuario.toLowerCase())) {
	                respuestasCorrectas++;
	            } else {
	                respuestasIncorrectas++;
	            }
	        }

	        // Mostrar cuántas respuestas son correctas e incorrectas
	        System.out.println("Respuestas correctas: " + respuestasCorrectas);
	        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
	    }

	    private static String[] seleccionarPalabrasAleatorias(Map<String, String> diccionario, int cantidad) {
	        // Crear un array con todas las palabras del diccionario
	        String[] palabras = diccionario.keySet().toArray(new String[0]);

	        // Seleccionar palabras aleatorias del array
	        String[] palabrasAleatorias = new String[cantidad];
	        for (int i = 0; i < cantidad; i++) {
	            int indiceAleatorio = (int) (Math.random() * palabras.length);
	            palabrasAleatorias[i] = palabras[indiceAleatorio];
	        }
	        return palabrasAleatorias;
	    }
	}



