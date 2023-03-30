package Cadena;
import java.util.Scanner;
public class CadenaInvertida {




	    public static void main(String[] args) {
             // Crear un objeto Scanner para leer la entrada del usuario
	        Scanner input = new Scanner(System.in);
              // Solicitar al usuario que ingrese una palabra o frase
	        System.out.print("Ingrese una palabra o frase: ");

              // Leer la palabra o frase ingresada por el usuario
	        String palabra = input.nextLine();
            // Inicializar una cadena vacía para almacenar la palabra invertida
	        String invertida = "";
           // Recorrer la palabra original de atrás hacia adelante y concatenar cada letra a la cadena invertida
	        for(int i = palabra.length()-1; i>=0; i--) {
	            invertida += palabra.charAt(i);
	        }

	        System.out.println("El texto invertido es: " + invertida);
	    }
	}

