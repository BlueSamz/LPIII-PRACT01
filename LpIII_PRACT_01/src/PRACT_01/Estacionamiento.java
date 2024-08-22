package PRACT_01;

import java.util.Scanner;

public class Estacionamiento {
	 //Funcion para calcular el cargo
    public static double calcular_cargo(double horas) {
        double cargo;
        
        if (horas <= 1) {
            cargo = 3.00; //La primera hora
        } else {
            //La primera hora mas s/0.50 por hora adicional
            cargo = 3.00 + (horas - 1) * 0.50;
        }
        
        //Maximo por dia
        if (cargo > 12.00) {
            cargo = 12.00;
        }
        
        return cargo;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de horas: ");
        double horas = scanner.nextDouble();
        
        double cargo = calcular_cargo(horas);
        System.out.println("El cargo por " + horas + " horas es: S/" + cargo);
    }
}
