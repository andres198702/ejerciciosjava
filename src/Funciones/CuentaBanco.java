package Funciones;

import java.util.Scanner;
public class CuentaBanco {

    public static double totalCuenta=2000;

    //Funciones:
    public static double consultaSaldo(){
        double saldo = totalCuenta;
        return saldo;
    }
    public static double hacerRetiro() {
        Scanner escanner = new Scanner(System.in);
        double valor = escanner.nextDouble();
        if (valor > totalCuenta) {
            System.out.println("Saldo Insuficiente");
        } else {
            totalCuenta -= valor;
        }
        return valor;
    }
    public static double hacerConsignacion(){
        Scanner escanner = new Scanner(System.in);
        double valorConsignado = escanner.nextDouble();
        totalCuenta += valorConsignado;
        return valorConsignado;
    }

    //Metodo Main:
    public static void main(String[] args) {
        String user="Andres Escobar";
        while(true){
            System.out.println("Hola usuario: "+ user + "\n");
            System.out.println("¿Que deseas hacer el dia de hoy");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Hacer retiros");
            System.out.println("3. Hacer consignacion ");
            System.out.println("4. Salir");

            Scanner escanner=new Scanner(System.in);
            int option = escanner.nextInt();
            escanner.nextLine();

            if (option == 4){
                break;
            }
            switch (option){
                case 1:
                    System.out.println("Tu saldo es: " + consultaSaldo());
                    break;
                case 2:
                    System.out.println("Haz retirado: " + (hacerRetiro()));
                    break;
                case 3:
                    System.out.println("Haz consignado: " + (hacerConsignacion()));
                    break;
                default:
                    System.out.println("Salir");
            }
        }
    }
}
