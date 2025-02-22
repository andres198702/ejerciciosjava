package Main_java1;

import java.util.Scanner;

public class Ejercicio11switch {
    public static void main(String[] args) {
        Scanner escanner=new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");

        int mes= escanner.nextInt();
        switch (mes){
            case 1:
                System.out.println("Has elegido enero");
                break;
            case 2:
                System.out.println("Has elegido febrero");
                break;
            case 3:
                    System.out.println("Has elegido marzo");
                    break;
            case 4:
                System.out.println("Has elegido abril");
                break;
            case 5:
                System.out.println("Has elegido mayo");
                break;
            case 6:
                System.out.println("Has elegido junio");
                break;
            case 7:
                System.out.println("Has elegido julio");
                break;
            case 8:
                System.out.println("Has elegido agosto");
                break;
            case 9:
                System.out.println("Has elegido septiembre");
            case 10:
                System.out.println("Has elegido octubre");
                break;
            case 11:
                System.out.println("Has elegido cuadrado");
                break;
            case 12:
                System.out.println("Has elegido trabajo");
                break;
                default:
                    System.out.println("No se puede elegar el mes");
        }
    }
}
