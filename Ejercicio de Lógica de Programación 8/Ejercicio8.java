 package Primo;
import java.util.Scanner;
public class NumeroPrimo {






	    
	    // Función que determina si un número es primo
	    public static boolean isPrime(int num) {
	        if (num < 2) { // Si el número es menor que 2, no es primo
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) { // Comprobar si es divisible por algún número entre 2 y la raíz cuadrada del número
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true; // Si no es divisible por ningún número, es primo
	    }
	    
	    // Función que reordena el array para poner los números primos al principio
	    public static void reorderArray(int[] nums) {
	        int i = 0; // Puntero que recorre el array desde el principio
	        int j = nums.length - 1; // Puntero que recorre el array desde el final
	        
	        while (i < j) { // Mientras los punteros no se hayan cruzado
	            while (i < j && isPrime(nums[i]) == true) { // Mover el puntero i hacia la derecha hasta encontrar un número que no es primo
	                i++;
	            }
	            while (i < j && isPrime(nums[j]) == false) { // Mover el puntero j hacia la izquierda hasta encontrar un número que es primo
	                j--;
	            }
	            if (i < j) { // Si los punteros no se han cruzado, intercambiar los valores en las posiciones i y j
	                int temp = nums[i];
	                nums[i] = nums[j];
	                nums[j] = temp;
	                i++;
	                j--;
	            }
	        }
	    }

	    // Función principal que se ejecuta al iniciar el programa
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in); 
            // Crear array nums para almacenar los números introducidos
	        int[] nums = new int[10]; 
	        
	        System.out.println("Introduzca 10 números separados por coma:");
	        String input = sc.nextLine(); 
            // Dividir la cadena en subcadenas utilizando la coma como separador
	        String[] parts = input.split(","); 
            // Convertir cada subcadena en un número entero y almacenarlo en el array nums
	        for (int i = 0; i < parts.length; i++) { 
	            nums[i] = Integer.parseInt(parts[i]);
	        }
	        // Reordenar el array
	        reorderArray(nums); 
	        
	        System.out.println("Array ordenado:"); 
            // Recorrer el array y mostrar la posición y el valor correspondiente para cada elemento
	        for (int i = 0; i < nums.length; i++) { 
	            System.out.println("pos[" + i + "] = " + nums[i]);
	        }
	        
	        sc.close(); 
	    }

	}



