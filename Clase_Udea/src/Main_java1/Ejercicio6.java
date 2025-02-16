package Main_java1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Calcular el mayor de cuatro números enteros introducidos por teclado.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero ");
        int a = scanner.nextInt();
        System.out.print("Ingrese un numero entero ");
        int b = scanner.nextInt();
        System.out.print("Ingrese un numero entero ");
        int c = scanner.nextInt();
        System.out.print("Ingrese un numero entero ");
        int d = scanner.nextInt();

        if(a>b & a>c & a>d){
            System.out.println("A es mayor que todos");
        }else if(b>a & b>c & b>d){
            System.out.println("B es mayor que todos");
        }else if(c>a & c>b & c>d){
            System.out.println("C es mayor que todos");
        }else{
            System.out.println("D es mayor que todos");
        }
    }
}
