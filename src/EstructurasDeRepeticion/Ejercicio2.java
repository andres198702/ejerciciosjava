package EstructurasDeRepeticion;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Programa que lee las edades de un grupo de 100 alumnos y encuentra el promedio.

        int[] age = {10, 18, 12, 15, 17, 11, 16, 13, 14, 10, 18, 12, 15, 17, 11, 16, 13, 14, 10, 18,
                12, 15, 17, 11, 16, 13, 14, 10, 18, 12, 15, 17, 11, 16, 13, 14, 10, 18, 12, 15,
                17, 11, 16, 13, 14, 10, 18, 12, 15, 17, 11, 16, 13, 14, 10, 18, 12, 15, 17, 11,
                16, 13, 14, 10, 18, 12, 15, 17, 11, 16, 13, 14, 10, 18, 12, 15, 17, 11, 16, 13,
                14, 10, 18, 12, 15, 17, 11, 16, 13, 14, 10, 18, 12, 15, 17, 11, 16, 13, 14, 10};

        int edad=0;

        for(int i:age){
            edad += i;
        }
        double promedio= (double) edad/age.length;
        System.out.println(promedio);
    }
}
