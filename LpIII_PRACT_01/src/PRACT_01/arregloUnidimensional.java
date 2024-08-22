package PRACT_01;

import java.util.Scanner;

public class arregloUnidimensional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];
        
        System.out.println("Ingrese 10 numeros en orden ascendente:");

        //Primer numero
        System.out.print("Numero 1: ");
        arreglo[0] = scanner.nextInt();
        
        //Los siguientes numeros
        for (int i = 1; i < arreglo.length; i++) {
            int numero;
            do {
                System.out.print("Numero " + (i + 1) + ": ");
                numero = scanner.nextInt();
                if (numero <= arreglo[i - 1]) {
                    System.out.println("Inténtalo de nuevo. El numero debera ser mayor");
                }
            } while (numero <= arreglo[i - 1]);
            arreglo[i] = numero;
        }

        //Muestra el arreglo
        System.out.println("Los numeros ingresados en el arreglo son:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
}
