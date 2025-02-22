package Main_java1;

public class loops {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        for (int i :array) {
            System.out.println("El numero es " + i);
        }
        System.out.println("Termina ciclo for");
        int iterador = 0;
        do{
            System.out.println("El numero es: " + iterador);
            iterador++;
        }while(iterador<=10);
        System.out.println("Fin del Do while");

        int j =9;
        while(j >=0){
            System.out.println("El numero es: " + j);
            break;
        }
    }

}
