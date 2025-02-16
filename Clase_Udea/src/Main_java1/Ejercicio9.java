package Main_java1;

import java.sql.Date;
import java.util.Scanner;

import static java.time.temporal.TemporalQueries.localDate;

public class Ejercicio9 {
    public static void main(String[] args) {
        //Dada la fecha de hoy, calcular la fecha del día siguiente. Suponer que el año no es bisiesto.
        Scanner scanner = new Scanner(System.in);

        // Ingresar la fecha actual
        System.out.print("Ingresa el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingresa el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ingresa el año: ");
        int año = scanner.nextInt();

        // Validar el rango del mes y el día
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            System.out.println("Fecha no válida.");
        } else {
            // Días en cada mes (año no bisiesto)
            int diasEnMes;
            switch (mes) {
                case 4:
                case 6:
                case 9:
                case 11:
                    diasEnMes = 30;
                    break;
                case 2:
                    diasEnMes = 28;
                    break;
                default:
                    diasEnMes = 31;
                    break;
            }
            // Verificar si el día ingresado es válido para ese mes
            if (dia > diasEnMes) {
                System.out.println("El día no es válido para el mes ingresado.");
            } else {
                // Calcular el día siguiente
                dia++;

                // Verificar si pasamos al siguiente mes
                if (dia > diasEnMes) {
                    dia = 1;
                    mes++;

                    // Verificar si pasamos al siguiente año
                    if (mes > 12) {
                        mes = 1;
                        año++;
                    }
                }

                // Mostrar la fecha del día siguiente
                System.out.printf("La fecha del día siguiente es: %02d/%02d/%d\n", dia, mes, año);

            }
        }
    }
}
