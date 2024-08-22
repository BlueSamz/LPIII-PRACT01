package PRACT_01;

import java.util.Scanner;

public class BienvenidoJava {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String args[]) {
		System.out.println("Ingrese su nombre:");
		String nombre = input.nextLine();
		System.out.println("Bienvenido a Java " + nombre);
		input.close();
	}
	
}
