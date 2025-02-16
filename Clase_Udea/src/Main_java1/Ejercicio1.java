package Main_java1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        //Escribir un programa que solicite un valor entero al usuario y determine si es par o impar.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("Es par " + numero);
        }else {
            System.out.println("Es impar" + numero);
        }


    }
}
