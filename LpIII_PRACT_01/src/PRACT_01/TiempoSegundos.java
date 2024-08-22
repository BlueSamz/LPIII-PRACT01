package PRACT_01;

import java.util.Scanner;

public class TiempoSegundos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Ingreso de horas, minutos y segundos
        System.out.print("Ingrese las horas: ");
        int hora = scanner.nextInt();
        
        System.out.print("Ingrese los minutos: ");
        int minutos = scanner.nextInt();
        
        System.out.print("Ingrese los segundos: ");
        int segundos = scanner.nextInt();
        
        //Calcular los segundos
        int totalSegundos = conv_total_seg(hora, minutos, segundos);
        
        //Muestra el total de segundos
        System.out.println("El equivalente en segundos es: " + totalSegundos);
    }

    //Funcion para convertir a segundos
    public static int conv_total_seg(int hora, int minutos, int segundos) {
        int seg_hora = 3600; //cantidad de segundos por hora
        int seg_minuto = 60; //cantidad de minutos por hora
        
        //Calculo para el total de segundos
        int totalSegundos = (hora * seg_hora) + (minutos * seg_minuto) + segundos;
        
        return totalSegundos;
    }
}
