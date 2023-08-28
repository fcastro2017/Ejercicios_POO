package ejercicios.ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número de elementos: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese dato" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        for (int i = array.length - 1; i > 0; i--) {
            System.out.println(array[i]);
        }
    }
}
