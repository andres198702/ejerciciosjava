package Main_java1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Escribir un programa que solicite un valor entero al usuario y determine si es positivo o negativo.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero ");
        int numero = scanner.nextInt();

        if(numero < 0){
            System.out.println("El numero es negativo");
        }else if(numero > 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero no puede ser cero");
        }
    }
}
