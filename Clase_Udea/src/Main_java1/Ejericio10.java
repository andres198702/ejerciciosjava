package Main_java1;

import java.util.Scanner;

public class Ejericio10 {
    public static void main(String[] args) {
        Scanner escanner = new Scanner(System.in);
        System.out.println("elige un numero");
        int numeroDelMes = escanner.nextInt();

        switch (numeroDelMes) {
            case 1:
                System.out.println("Enero");
                ;
                break;
            case 2:
                System.out.println("Febrero");
                ;
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                ;
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            case 13:
                System.out.println("Excepcion");
                break;
        }
    }

//    public static void main(String[] args) {
//            Scanner escanner = new Scanner(System.in);
//
//            // Array con los nombres de los meses
//            String[] meses = {
//                    "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
//                    "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
//            };
//
//            // Solicitar el número del mes
//            System.out.print("Elige un número del 1 al 12: ");
//            int numeroDelMes = escanner.nextInt();
//
//            // Validar la entrada
//            if (numeroDelMes >= 1 && numeroDelMes <= 12) {
//                // Mostrar el mes correspondiente (índice del array empieza en 0)
//                System.out.println("El mes es: " + meses[numeroDelMes - 1]);
//            } else {
//                System.out.println("Excepción: Número fuera del rango (1-12).");
//            }
//        }
}

