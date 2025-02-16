package Main_java1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Calcular el mayor de dos números enteros introducidos por teclado.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero ");
        int a = scanner.nextInt();
        System.out.print("Ingrese un numero entero ");
        int b = scanner.nextInt();
        if(a>b){
            System.out.println("A es mayor que B ");
        }else {
            System.out.println("b es mayor que A ");
        }
    }
}
