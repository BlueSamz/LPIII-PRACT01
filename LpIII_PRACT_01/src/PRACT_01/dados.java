package PRACT_01;

import java.util.Random;

public class dados {
    public static void main(String[] args) {
        final int num_lanz = 20000;
        int[] frec = new int[6]; //Guarda la frecuencia de las caras del dado
        Random random = new Random();

        //Bucle para el lanzamiento del dado 20000
        for (int i = 0; i < num_lanz; i++) {
            int resultado = random.nextInt(6) + 1; //Genera un numero
            frec[resultado - 1]++; //Incrementa la la frecuencia del dado
        }

        //Muestra las frecuencias
        System.out.println("Frecuencias de las caras del dado:");
        for (int i = 0; i < frec.length; i++) {
            System.out.println("Cara " + (i + 1) + ": " + frec[i] + " veces");
        }
    }
}
