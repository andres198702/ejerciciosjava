package EstructurasDeRepeticion;



public class Ejercicio1 {
    public static void main(String[] args) {
        //Realizar un programa que transforme todas las letras del alfabeto de mayúsculas a minúsculas.
        //character convierte un tipo de dato primitivo a un objeto

        char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        for (int i = 0; i < alfabeto.length; i++) {
            alfabeto[i] = Character.toLowerCase(alfabeto[i]); // Convertir a mayúscula
            System.out.print(alfabeto[i] + " ");
        }
    }
}
