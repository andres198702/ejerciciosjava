package Main_java1;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        //Pedir al usuario un valor. Si el valor es positivo, pedir un segundo valor y calcular la suma, resta y producto de
        //ambos. Mostrar los resultados por pantalla.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero ");
        int numero = scanner.nextInt();

        if(numero >0){
            System.out.println("Ingresa otro numero para realizar la operacion");
            int numero1 = scanner.nextInt();
            int suma= numero+numero1;
            int resta= numero-numero1;
            System.out.println("La suma de los numeros es: "+suma);
            System.out.println("La resta de los numeros es: "+resta);
        }else{
            System.out.println("En numero es negativo");
        }

    }
}
