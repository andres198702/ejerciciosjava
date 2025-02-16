package Main_java1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Determinar en que estado está el agua en función de su temperatura. Si es negativa el estado será sólido, si es
        //menor que 100 será líquido y si es mayor que 100 será gas. Pedir al usuario el valor de la temperatura
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese la temperatura");
        float variableTemparatura=scanner.nextFloat();
        if(variableTemparatura<0){
            System.out.println("Es solido");
        } else if (variableTemparatura<100) {
            System.out.println("Es liquida");
        }else{
            System.out.println("Es gas");
        }
    }
}
