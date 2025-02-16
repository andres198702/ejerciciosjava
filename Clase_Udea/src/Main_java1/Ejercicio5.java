package Main_java1;

import java.util.Scanner;

public class Ejercicio5 {
    //Calcular el mayor de tres números enteros introducidos por teclado
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese A ");
        int a = scanner.nextInt();
        System.out.print("Ingrese B ");
        int b = scanner.nextInt();
        System.out.print("Ingrese C ");
        int c = scanner.nextInt();

        if (a>b && a>c){
            System.out.println("A es mayor que B y C");
        } else if (b>a && b>c) {
            System.out.println("C es mayor que A y B");

        }else{
            System.out.println("C es mayor que A y B");
        }
    }
}
