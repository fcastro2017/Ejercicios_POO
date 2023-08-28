package ejercicios.ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de elementos:");
        int n = sc.nextInt();

        int[]numeros = new int[n];

        for (int i = 0; i<numeros.length ; i++) {
                Random rand = new Random();
              numeros[i] = rand.nextInt(1000);
              System.out.println(numeros[i]);
        }
    }
}
