package Main_java1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int operador = scanner.nextInt();

        int suma=numero+operador;
        int resta=numero-operador;
        int multiplicacion=numero*operador;
        double division=(double)numero/operador;

        System.out.println("La suma es " + suma);
        System.out.println("la resta es " + resta);
        System.out.println("la multiplicacion es " + multiplicacion);
        System.out.println("La division es " + division);

        if(numero > operador){
            System.out.println("El numero" + numero + " es mayor que el operador" + operador);
        }else

        if(suma > 10){
            System.out.println("El numero" + numero + " es mayor que el operador" + operador);
        }else {
            System.out.println("El numero" + numero + " es menor que el operador" + operador);
        }

    }
}
