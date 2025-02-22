package Main_java1;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        //Solicitar al usuario la inicial del día de la semana y mostrar el nombre del día completo. La letra inicial puede ser
        //mayúscula o minúscula. Usar la x para el miércoles.
        Scanner escanner= new Scanner(System.in);
        System.out.println("Escribe la primera letra de la semana");
        String primeraLetraSemana= escanner.nextLine();
        String primeraLetra= primeraLetraSemana.toUpperCase();

        switch (primeraLetra){
            case "L":
                System.out.println("Es lunes");
                break;
            case "M":
                System.out.println("Es martes");
                break;
            case "X":
                System.out.println("Es miercoles");
                break;
            case "J":
                System.out.println("Es jueves");
                break;
            case "V":
                System.out.println("Es viernes");
                break;
            case "S":
                System.out.println("Es sabado");
                break;
            case "D":
                System.out.println("Es domingo");
                break;
                default:
        }
    }
}
