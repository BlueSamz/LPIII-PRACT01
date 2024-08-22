package PRACT_01;

import java.util.Scanner;

public class MenorDeLosTres {
	 //Funcion para encontrar el menor numero de los tres
    public static double encontrarMenor(double a, double b, double c) {
        if (a < b && a < c) {
            return a;
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
    	Scanner Scanner = new Scanner(System.in); 
    	System.out.println("Ingrese el primer numero decimal: ");
        double numero1 = Scanner.nextDouble();
        System.out.println("Ingrese el segundo numero decimal: ");
        double numero2 = Scanner.nextDouble();
        System.out.println("Ingrese el tercer numero decimal: ");
        double numero3 = Scanner.nextDouble();
        
        double menor = encontrarMenor(numero1, numero2, numero3);
        System.out.println("El menor de los tres números es: " + menor);
    }
}
