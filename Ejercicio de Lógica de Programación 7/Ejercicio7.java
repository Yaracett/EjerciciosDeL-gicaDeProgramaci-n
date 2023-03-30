package Semana;
import java.util.Scanner;
public class finSemana {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        String diaSemana = "";
	        int hora = -1;
	        int minutos = -1;

	        // Verificar que el día de la semana ingresado sea válido
	        while (true) {
	            System.out.print("Ingrese un día de la semana (Lunes - Viernes): ");
	            diaSemana = scanner.nextLine();
	            if (diaSemana.equalsIgnoreCase("Lunes") || diaSemana.equalsIgnoreCase("Martes") ||
	                    diaSemana.equalsIgnoreCase("Miércoles") || diaSemana.equalsIgnoreCase("Jueves") ||
	                    diaSemana.equalsIgnoreCase("Viernes")) {
	                break;
	            } else {
	                System.out.println("Día de la semana no válido. Intente de nuevo.");
	            }
	        }

	        // Verificar que la hora ingresada sea válida
	        while (true) {
	            System.out.print("Ingrese la hora (formato 24 horas): ");
	            String horaInput = scanner.nextLine();
	            String[] horaSplit = horaInput.split(":");
	            if (horaSplit.length == 2) {
	                try {
	                    hora = Integer.parseInt(horaSplit[0]);
	                    minutos = Integer.parseInt(horaSplit[1]);
	                    if (hora >= 0 && hora < 24 && minutos >= 0 && minutos < 60) {
	                        break;
	                    } else {
	                        System.out.println("Hora no válida. Intente de nuevo.");
	                    }
	                } catch (NumberFormatException e) {
	                    System.out.println("Hora no válida. Intente de nuevo.");
	                }
	            } else {
	                System.out.println("Formato de hora no válido. Intente de nuevo.");
	            }
	        }

	        // Calcular minutos faltantes para el fin de semana
	        int minutosFaltantes = 0;
	        switch (diaSemana.toLowerCase()) {
	            case "lunes":
	                minutosFaltantes = (24 - hora) * 60 - minutos + (4 - 1) * 24 * 60 + 15 * 60;
	                break;
	            case "martes":
	                minutosFaltantes = (24 - hora) * 60 - minutos + (4 - 2) * 24 * 60 + 15 * 60;
	                break;
	            case "miércoles":
	                minutosFaltantes = (24 - hora) * 60 - minutos + (4 - 3) * 24 * 60 + 15 * 60;
	                break;
	            case "jueves":
	                minutosFaltantes = (24 - hora) * 60 - minutos + (4 - 4) * 24 * 60 + 15 * 60;
	                break;
	            case "viernes":
	                if (hora < 15) {
	                    minutosFaltantes = (15 - hora) * 60 - minutos;
	                }
	                break;
	        }

	        if (minutosFaltantes > 0) {
	            System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana");
	        } else {
	            System.out.println("Ya es fin de semana");
	        }
	    }
	}
