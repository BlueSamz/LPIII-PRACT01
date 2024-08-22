package PRACT_01;

public class SumaArreglo {
    public static int suma(int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};
        int resultado = suma(arreglo);
        System.out.println("La suma es: " + resultado);
    }
}


