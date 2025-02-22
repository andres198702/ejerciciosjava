package Main_java1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //Un año es bisiesto si es divisible por 4 y no es por 100, o si es divisible por 400. Escribe un programa que lea un
        //año y devuelva si es bisiesto o no.
        int yearBiciesto=2024;
        if( (yearBiciesto % 4 == 0 & yearBiciesto% 100 != 0) || (yearBiciesto % 400 == 0)) {
            System.out.println(yearBiciesto + " es un año bisiesto.");
        } else {
            System.out.println(yearBiciesto + " no es un año bisiesto.");
        }
    }
}
